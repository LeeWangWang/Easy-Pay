package com.easypay.module.sys.web;

import com.easypay.common.config.AbstractController;
import com.easypay.common.model.Result;
import com.easypay.module.sys.entity.SysLog;
import com.easypay.module.sys.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: LogController
 * @Description: 日志管理
 * @Author: lww
 * @Date: 6/29/23 12:37 PM
 * @Version: V1
 **/
@RestController
@RequestMapping("/sys/log")
public class LogController extends AbstractController {

    @Autowired
    private SysLogService sysLogService;

    /**
     * 日志列表
     */
    @PostMapping("/list")
    public Result list(SysLog log){
        return sysLogService.list(log);
    }

}