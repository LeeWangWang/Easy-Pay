package com.easypay.common.shiro;

import com.easypay.common.util.ShiroUtils;
import com.easypay.module.sys.entity.SysUser;
import com.easypay.module.sys.service.SysUserService;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;

/**
 * @ClassName: UserRealm
 * @Description:
 * @Author: lww
 * @Date: 6/28/23 7:22 PM
 * @Version: V1
 **/
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private SysUserService userService;
    /**
     * 获取授权
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        Long userId = ShiroUtils.getUserId();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        List<String> rolesSet = userService.listUserRoles(userId);
        List<String> permsSet = userService.listUserPerms(userId);
        info.setRoles(new HashSet<>(rolesSet));
        info.setStringPermissions(new HashSet<>(permsSet));
        return info;
    }

    /**
     * 获取认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
            throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();
        String password = new String((char[]) authenticationToken.getCredentials());
        SysUser user = userService.getUser(username);
        if (user == null) {
            throw new UnknownAccountException("账户不存在");
        }
        if(!password.equals(user.getPassword())) {
            throw new IncorrectCredentialsException("密码不正确");
        }
        return new SimpleAuthenticationInfo(user, password, getName());
    }
}