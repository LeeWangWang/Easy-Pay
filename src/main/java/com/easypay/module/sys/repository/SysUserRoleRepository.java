package com.easypay.module.sys.repository;

import com.easypay.module.sys.entity.SysUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: SysUserRoleRepository
 * @Description:
 * @Author: lww
 * @Date: 6/28/23 7:43 PM
 * @Version: V1
 **/
@Repository
public interface SysUserRoleRepository extends JpaRepository<SysUserRole, Long> {
}
