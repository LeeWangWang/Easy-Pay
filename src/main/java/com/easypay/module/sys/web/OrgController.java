package com.easypay.module.sys.web;

import com.easypay.common.config.AbstractController;
import com.easypay.common.model.Result;
import com.easypay.module.sys.entity.SysOrg;
import com.easypay.module.sys.service.SysOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: OrgController
 * @Description: 机构管理
 * @Author: lww
 * @Date: 6/29/23 12:41 PM
 * @Version: V1
 **/
@RestController
@RequestMapping("/sys/org")
public class OrgController extends AbstractController {

    @Autowired
    private SysOrgService sysOrgService;

    /**
     * 机构列表
     */
    @PostMapping("/list")
    public Result list(SysOrg sysOrg){
        return sysOrgService.list(sysOrg);
    }

    /**
     * 树结构
     */
    @RequestMapping("/select")
    public Result select(Long parentId){
        return sysOrgService.select(parentId);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public Result save(@RequestBody SysOrg org){
        return sysOrgService.save(org);
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public Result delete(Long orgId){
        return sysOrgService.delete(orgId);
    }
}