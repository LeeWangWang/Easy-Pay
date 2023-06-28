package com.easypay.module.sys.repository;

import com.easypay.module.sys.entity.SysRoleOrg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: SysRoleOrgRepository
 * @Description:
 * @Author: lww
 * @Date: 6/28/23 7:42 PM
 * @Version: V1
 **/
@Repository
public interface SysRoleOrgRepository extends JpaRepository<SysRoleOrg, Long> {
}
