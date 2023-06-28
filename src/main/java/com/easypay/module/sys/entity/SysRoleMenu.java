package com.easypay.module.sys.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName: SysRoleMenu
 * @Description: sys_role_menu 实体类
 * @Author: lww
 * @Date: 6/28/23 7:38 PM
 * @Version: V1
 **/
@Data
@Entity
@Table(name = "sys_role_menu")
public class SysRoleMenu implements Serializable {
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
     * 菜单ID
     */
    @Column(name = "menu_id", length = 20)
    private Long menuId;

}