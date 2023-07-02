package com.easypay.module.sys.service;

import com.easypay.common.model.Result;
import com.easypay.module.sys.entity.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: SysUserService
 * @Description:
 * @Author: lww
 * @Date: 6/29/23 12:48 PM
 * @Version: V1
 **/
@Service
public interface SysUserService {

    /**
     * 保存用户
     * @param user
     * @return
     */
    Result save(SysUser user);

    /**
     * 根据用户ID获取用户
     * @param userId
     * @return
     */
    Result get(Long userId);

    /**
     * 根据用户ID删除用户
     * @param userId
     * @return
     */
    Result delete(Long userId);

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    SysUser getUser(String username);

    /**
     * 用户列表
     * @param user
     * @return
     */
    Result list(SysUser user);

    /**
     * 根据用户ID获取用户角色
     * @param userId
     * @return
     */
    List<String> listUserRoles(Long userId);

    /**
     * 根据用户ID获取用户权限
     * @param userId
     * @return
     */
    List<String> listUserPerms(Long userId);

    /**
     * 更新用户密码
     * @param user
     * @return
     */
    Result updatePwd(SysUser user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    Result update(SysUser user);

    /**
     * 根据角色获取用户信息
     * @param roleSign
     * @return
     */
    List<SysUser> listUserByRole(String roleSign);

}
