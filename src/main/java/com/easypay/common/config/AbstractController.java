package com.easypay.common.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: AbstractController
 * @Description: 通用Controller
 * @Author: lww
 * @Date: 6/28/23 10:54 AM
 * @Version: V1
 **/
@RestController
public class AbstractController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

}