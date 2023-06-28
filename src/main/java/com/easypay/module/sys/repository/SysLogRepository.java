package com.easypay.module.sys.repository;

import com.easypay.module.sys.entity.SysLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: SysLogRepository
 * @Description:
 * @Author: lww
 * @Date: 6/28/23 7:41 PM
 * @Version: V1
 **/
@Repository
public interface SysLogRepository extends JpaRepository<SysLog, Long> {
}
