package com.easypay.module.sys.web;

import com.easypay.common.config.AbstractController;
import com.easypay.common.model.Result;
import com.easypay.common.util.MD5Utils;
import com.easypay.common.util.ShiroUtils;
import com.easypay.module.sys.entity.SysUser;
import com.easypay.module.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: MemberController
 * @Description: 个人设置
 * @Author: lww
 * @Date: 6/29/23 12:38 PM
 * @Version: V1
 **/
@RestController
@RequestMapping("/member")
public class MemberController extends AbstractController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 修改密码
     */
    @PostMapping("/updatePwd")
    public Result updatePwd(@RequestBody SysUser user){
        SysUser entity = ShiroUtils.getUserEntity();
        String password = MD5Utils.encrypt(entity.getUsername(),user.getOldPassword());
        if(entity.getPassword().equals(password)){
            entity.setPassword(user.getPassword());
            return sysUserService.updatePwd(entity);
        }else{
            return Result.error("原密码不正确");
        }
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