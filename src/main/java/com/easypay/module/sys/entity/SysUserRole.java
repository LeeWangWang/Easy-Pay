package com.easypay.module.sys.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName: SysUserRole
 * @Description: sys_user_role 实体类
 * @Author: lww
 * @Date: 6/28/23 7:39 PM
 * @Version: V1
 **/
@Data
@Entity
@Table(name = "sys_user_role")
@EqualsAndHashCode(callSuper=false)
public class SysUserRole implements Serializable {
    /**
     * 记录id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 20)
    private Long id;

    /**
     * 用户ID
     */
    @Column(name = "user_id", length = 20)
    private Long userId;

    /**
     * 角色ID
     */
    @Column(name = "role_id", length = 20)
    private Long roleId;

}