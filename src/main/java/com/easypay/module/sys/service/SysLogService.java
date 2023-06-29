package com.easypay.module.sys.service;

import com.easypay.common.model.Result;
import com.easypay.module.sys.entity.SysLog;
import org.springframework.stereotype.Service;

/**
 * @ClassName: SysLogService
 * @Description:
 * @Author: lww
 * @Date: 6/29/23 12:47 PM
 * @Version: V1
 **/
@Service
public interface SysLogService {

    Result list(SysLog log);

}
