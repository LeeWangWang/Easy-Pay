package com.easypay.module.sys.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName: SysRoleOrg
 * @Description: sys_role_org 实体类
 * @Author: lww
 * @Date: 6/28/23 7:38 PM
 * @Version: V1
 **/
@Data
@Entity
@Table(name = "sys_role_org")
@EqualsAndHashCode(callSuper=false)
public class SysRoleOrg implements Serializable {
    /**
     * 记录id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 20)
    private Long id;

    /**
     * 角色ID
     */
    @Column(name = "role_id", length = 20)
    private Long roleId;

    /**
     * 机构ID
     */
    @Column(name = "org_id", length = 20)
    private Long orgId;

}