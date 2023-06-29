package com.easypay.module.sys.service;

import com.easypay.common.model.Result;
import com.easypay.module.sys.entity.SysRole;
import org.springframework.stereotype.Service;

/**
 * @ClassName: SysRoleService
 * @Description:
 * @Author: lww
 * @Date: 6/29/23 12:48 PM
 * @Version: V1
 **/
@Service
public interface SysRoleService {

    Result list(SysRole role);

    Result select();

    Result save(SysRole role);

    Result delete(Long roleId);

    Result getMenu(Long roleId);

    Result saveMenu(SysRole role);

    Result getOrg(Long roleId);

    Result saveOrg(SysRole role);

}
