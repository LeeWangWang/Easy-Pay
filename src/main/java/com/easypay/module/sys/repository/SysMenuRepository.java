package com.easypay.module.sys.repository;

import com.easypay.module.sys.entity.SysMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: SysMenuRepository
 * @Description:
 * @Author: lww
 * @Date: 6/28/23 7:41 PM
 * @Version: V1
 **/
@Repository
public interface SysMenuRepository extends JpaRepository<SysMenu, Long> {
}
