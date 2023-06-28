package com.easypay.module.sys.repository;

import com.easypay.module.sys.entity.SysRoleMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: SysRoleMenuRepository
 * @Description:
 * @Author: lww
 * @Date: 6/28/23 7:42 PM
 * @Version: V1
 **/
@Repository
public interface SysRoleMenuRepository extends JpaRepository<SysRoleMenu, Long> {
}

