package com.easypay.module.sys.service;

import com.easypay.common.model.Result;
import com.easypay.module.sys.entity.SysMenu;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: SysMenuService
 * @Description:
 * @Author: lww
 * @Date: 6/29/23 12:47 PM
 * @Version: V1
 **/
@Service
public interface SysMenuService {

    Result list(SysMenu menu);

    List<SysMenu> select(Long parentId);

    Result delete(Long menuId);

    List<SysMenu> getByUserId(Long userId);

    Result drop(Long parentId, Long menuId);
}
