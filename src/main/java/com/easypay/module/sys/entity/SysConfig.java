package com.easypay.module.sys.entity;

import com.easypay.common.model.PageBean;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @ClassName: SysConfig
 * @Description: sys_config 实体类
 * @Author: lww
 * @Date: 6/28/23 7:35 PM
 * @Version: V1
 **/
@Data
@Entity
@Table(name = "sys_config")
public class SysConfig extends PageBean implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 20)
    private Long id;

    /**
     * 键
     */
    @Column(name = "config_key", length = 50)
    private String key;

    /**
     * 值
     */
    @Column(name = "config_value", length = 2000)
    private String value;

    /**
     * 状态，0：隐藏   1：显示
     */
    @Column(name = "status", length = 4)
    private Short status;

    /**
     * 备注
     */
    @Column(name = "config_remark", length = 500)
    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp gmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp gmtModified;

    /**
     * 创建用户id
     */
    @Column(name = "user_id_create")
    private Long userIdCreate;

}