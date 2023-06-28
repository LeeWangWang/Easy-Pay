package com.easypay.module.sys.repository;

import com.easypay.module.sys.entity.SysConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: SysConfigRepository
 * @Description:
 * @Author: lww
 * @Date: 6/28/23 7:40 PM
 * @Version: V1
 **/
@Repository
public interface SysConfigRepository extends JpaRepository<SysConfig, Long> {

}