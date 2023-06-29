package com.easypay.module.sys.entity;

import com.easypay.common.model.PageBean;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * @ClassName: SysRole
 * @Description: sys_role 实体类
 * @Author: lww
 * @Date: 6/28/23 7:37 PM
 * @Version: V1
 **/
@Data
@Entity
@Table(name = "sys_role")
@EqualsAndHashCode(callSuper=false)
public class SysRole extends PageBean implements Serializable {
    /**
     * 角色id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id", nullable = false, length = 20)
    private Long roleId;

    /**
     * 所属机构
     */
    @Column(name = "org_id")
    private Long orgId;

    /**
     * 角色名称
     */
    @Column(name = "role_name", length = 100)
    private String roleName;

    /**
     * 角色标识
     */
    @Column(name = "role_sign", length = 100)
    private String roleSign;

    /**
     * 备注
     */
    @Column(name = "remark", length = 100)
    private String remark;

    /**
     * 创建用户id
     */
    @Column(name = "user_id_create")
    private Long userIdCreate;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "gmt_create")
    private Timestamp gmtCreate;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "gmt_modified")
    private Timestamp gmtModified;

    @Transient
    private List<Long> menuIdList;

    @Transient
    private List<Long> orgIdList;

}