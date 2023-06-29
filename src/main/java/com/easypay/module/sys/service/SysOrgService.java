package com.easypay.module.sys.service;

import com.easypay.common.model.Result;
import com.easypay.module.sys.entity.SysOrg;
import org.springframework.stereotype.Service;

/**
 * @ClassName: SysOrgService
 * @Description:
 * @Author: lww
 * @Date: 6/29/23 12:47 PM
 * @Version: V1
 **/
@Service
public interface SysOrgService {

    Result list(SysOrg org);

    Result select(Long parentId);

    Result save(SysOrg org);

    Result delete(Long orgId);

}