package com.easypay.module.sys.repository;

import com.easypay.module.sys.entity.SysOrg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: SysOrgRepository
 * @Description:
 * @Author: lww
 * @Date: 6/28/23 7:42 PM
 * @Version: V1
 **/
@Repository
public interface SysOrgRepository extends JpaRepository<SysOrg, Long> {
}

