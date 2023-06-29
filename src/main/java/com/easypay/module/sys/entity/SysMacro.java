package com.easypay.module.sys.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @ClassName: SysMacro
 * @Description: sys_macro 实体类
 * @Author: lww
 * @Date: 6/28/23 7:36 PM
 * @Version: V1
 **/
@Data
@Entity
@Table(name = "sys_macro")
public class SysMacro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "macro_id", nullable = false, length = 20)
    private Long macroId;

    /**
     * 父级id
     */
    @Column(name = "type_id", length = 255)
    private Long typeId;

    /**
     * 名称
     */
    @Column(name = "name", length = 50)
    private String name;

    /**
     * 值
     */
    @Column(name = "value", length = 2000)
    private String value;

    /**
     * 状态，0：隐藏   1：显示
     */
    @Column(name = "status", length = 4)
    private Short status;

    /**
     * 类型,0:目录，1:参数配置
     */
    @Column(name = "type", length = 20)
    private Short type;

    /**
     * 排序
     */
    @Column(name = "order_num", length = 11)
    private Integer orderNum;

    /**
     * 备注
     */
    @Column(name = "remark", length = 500)
    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Timestamp gmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private Timestamp gmtModified;

}