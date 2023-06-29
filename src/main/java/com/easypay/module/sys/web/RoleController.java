package com.easypay.module.sys.web;

import com.easypay.common.config.AbstractController;
import com.easypay.common.model.Result;
import com.easypay.module.sys.entity.SysRole;
import com.easypay.module.sys.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: RoleController
 * @Description: 角色管理
 * @Author: lww
 * @Date: 6/29/23 12:41 PM
 * @Version: V1
 **/
@RestController
@RequestMapping("/sys/role")
public class RoleController extends AbstractController {

    @Autowired
    private SysRoleService sysRoleService;

    /**
     * 角色列表
     */
    @PostMapping("/list")
    public Result list(SysRole role){
        return sysRoleService.list(role);
    }

    /**
     * 角色选择
     */
    @PostMapping("/select")
    public Result select(){
        return sysRoleService.select();
    }

    /**
     * 角色选择
     */
    @PostMapping("/selectByUser")
    public Result selectByUser(){
        return sysRoleService.select();
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public Result save(@RequestBody SysRole role){
        return sysRoleService.save(role);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public Result delete(Long roleId){
        return sysRoleService.delete(roleId);
    }

    /**
     * 根据角色ID获取菜单
     */
    @PostMapping("/getMenu")
    public Result getMenu(Long roleId){
        return sysRoleService.getMenu(roleId);
    }

    /**
     * 根据角色保存菜单
     */
    @PostMapping("/saveMenu")
    public Result saveMenu(@RequestBody SysRole role){
        return sysRoleService.saveMenu(role);
    }

    /**
     * 根据角色ID获取机构
     */
    @PostMapping("/getOrg")
    public Result getOrg(Long roleId){
        return sysRoleService.getOrg(roleId);
    }

    /**
     * 根据角色保存机构
     */
    @PostMapping("/saveOrg")
    public Result saveOrg(@RequestBody SysRole role){
        return sysRoleService.saveOrg(role);
    }
}