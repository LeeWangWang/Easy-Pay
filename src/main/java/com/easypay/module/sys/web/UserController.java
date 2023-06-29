package com.easypay.module.sys.web;

import com.easypay.common.config.AbstractController;
import com.easypay.common.model.Result;
import com.easypay.common.util.ShiroUtils;
import com.easypay.module.sys.entity.SysUser;
import com.easypay.module.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description: 用户管理
 * @Author: lww
 * @Date: 6/29/23 12:41 PM
 * @Version: V1
 **/
@RestController
@RequestMapping("/sys/user")
public class UserController extends AbstractController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 用户列表
     */
    @PostMapping("/list")
    public Result list(SysUser user){
        return sysUserService.list(user);
    }

    /**
     * 获取
     */
    @PostMapping("/get")
    public Result get(Long userId){
        return sysUserService.get(userId);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public Result save(@RequestBody SysUser user){
        return sysUserService.save(user);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public Result delete(Long userId){
        return sysUserService.delete(userId);
    }

    /**
     * 修改密码
     */
    @PostMapping("/updatePwd")
    public Result updatePwd(SysUser user){
        return sysUserService.updatePwd(user);
    }

    /**
     * 获取当前用户信息
     */
    @PostMapping("/info")
    public Result info(){
        return sysUserService.get(ShiroUtils.getUserId());
    }

    /**
     * 更新用户信息
     */
    @PostMapping("/update")
    public Result update(@RequestBody SysUser user){
        return sysUserService.update(user);
    }

}