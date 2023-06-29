package com.easypay.module.sys.service;

import com.easypay.common.model.Result;
import com.easypay.module.sys.entity.SysConfig;
import org.springframework.stereotype.Service;

/**
 * @ClassName: SysConfigService
 * @Description:
 * @Author: lww
 * @Date: 6/29/23 12:46 PM
 * @Version: V1
 **/
@Service
public interface SysConfigService {

    Result save(SysConfig config);

    Result get(Long id);

    Result delete(Long id);

    Result list(SysConfig config);
}
