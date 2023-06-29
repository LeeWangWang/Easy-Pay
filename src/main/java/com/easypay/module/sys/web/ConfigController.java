package com.easypay.module.sys.web;

import com.easypay.common.config.AbstractController;
import com.easypay.common.model.Result;
import com.easypay.module.sys.entity.SysConfig;
import com.easypay.module.sys.service.SysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConfigController
 * @Description: 参数设置
 * @Author: lww
 * @Date: 6/29/23 12:36 PM
 * @Version: V1
 **/
@RestController
@RequestMapping("/sys/config")
public class ConfigController extends AbstractController {

    @Autowired
    private SysConfigService sysConfigService;

    /**
     * 参数列表
     */
    @PostMapping("/list")
    public Result list(SysConfig config){
        return sysConfigService.list(config);
    }

    /**
     * 获取
     */
    @PostMapping("/get")
    public Result get(Long id){
        return sysConfigService.get(id);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public Result save(@RequestBody SysConfig config){
        return sysConfigService.save(config);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public Result delete(Long id){
        return sysConfigService.delete(id);
    }

}