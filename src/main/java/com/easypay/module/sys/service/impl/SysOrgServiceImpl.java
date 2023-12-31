package com.easypay.module.sys.service.impl;

import com.easypay.common.dynamicquery.DynamicQuery;
import com.easypay.common.model.PageBean;
import com.easypay.common.model.Result;
import com.easypay.common.util.DateUtils;
import com.easypay.module.sys.entity.SysOrg;
import com.easypay.module.sys.repository.SysOrgRepository;
import com.easypay.module.sys.service.SysOrgService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: SysOrgServiceImpl
 * @Description:
 * @Author: lww
 * @Date: 6/29/23 12:56 PM
 * @Version: V1
 **/
@Service
public class SysOrgServiceImpl implements SysOrgService {

    @Autowired
    private DynamicQuery dynamicQuery;

    @Autowired
    private SysOrgRepository sysOrgRepository;

    @Override
    public Result list(SysOrg org) {
        String nativeSql = "SELECT COUNT(*) FROM sys_org WHERE parent_id=? ";
        String description = org.getDescription();
        if(StringUtils.isNotBlank(description)){
            nativeSql +="AND name like '"+description+"%'";
        }
        Long count = dynamicQuery.nativeQueryCount(nativeSql,new Object[]{org.getParentId()});
        PageBean<SysOrg> data = new PageBean<>();
        if(count>0){
            nativeSql = "SELECT * FROM sys_org WHERE parent_id=? ";
            if(StringUtils.isNotBlank(description)){
                nativeSql +="AND name like '"+description+"%' ";
            }
            nativeSql +="ORDER BY gmt_create desc";
            Pageable pageable = PageRequest.of(org.getPageNo(),org.getPageSize());
            List<SysOrg> list =
                    dynamicQuery.nativeQueryPagingList(SysOrg.class,pageable,nativeSql,new Object[]{org.getParentId()});
            data = new PageBean(list,count);
        }
        return Result.ok(data);
    }

    @Override
    public Result select(Long parentId) {
        String nativeSql = "SELECT * FROM sys_org";
        if(parentId!=null){
            nativeSql += " WHERE parent_id="+parentId;
        }
        nativeSql += " ORDER BY order_num desc";
        List<SysOrg> list = dynamicQuery.query(SysOrg.class,nativeSql);
        return Result.ok(list);
    }

    @Override
    @Transactional(rollbackFor=Exception.class)
    public Result save(SysOrg org) {
        String nativeSql = "SELECT * FROM sys_org WHERE code=?";
        SysOrg sysOrg =  dynamicQuery.nativeQuerySingleResult(
                SysOrg.class,nativeSql,new Object[]{org.getCode()});
        if(sysOrg==null){
            org.setGmtCreate(DateUtils.getTimestamp());
        }else{
            if(!sysOrg.getOrgId().equals(org.getOrgId())){
                return Result.error("机构代码重复");
            }
        }
        org.setGmtModified(DateUtils.getTimestamp());
        if(org.getParentId()==null){
            org.setParentId(0L);
        }
        sysOrgRepository.saveAndFlush(org);
        return Result.ok("保存成功");
    }

    @Override
    @Transactional(rollbackFor=Exception.class)
    public Result delete(Long orgId) {
        String nativeSql = "SELECT COUNT(*) FROM sys_org WHERE parent_id=?";
        Long count = dynamicQuery.nativeQueryCount(nativeSql,new Object[]{orgId});
        if(count>0){
            return Result.error("请先删除下级机构");
        }else{
            nativeSql = "DELETE FROM sys_org WHERE org_id=?";
            dynamicQuery.nativeExecuteUpdate(nativeSql,new Object[]{orgId});
        }
        return Result.ok("删除成功");
    }
}