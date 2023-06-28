package com.easypay.module.sys.repository;

import com.easypay.module.sys.entity.SysMacro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: SysMacroRepository
 * @Description:
 * @Author: lww
 * @Date: 6/28/23 7:41 PM
 * @Version: V1
 **/
@Repository
public interface SysMacroRepository extends JpaRepository<SysMacro, Long> {
}