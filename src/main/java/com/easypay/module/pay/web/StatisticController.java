package com.easypay.module.pay.web;

import com.easypay.common.config.AbstractController;
import com.easypay.common.model.Result;
import com.easypay.module.pay.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: StatisticController
 * @Description: 统计
 * @Author: lww
 * @Date: 6/29/23 8:45 AM
 * @Version: V1
 **/
@RestController
@RequestMapping("/statistic")
public class StatisticController extends AbstractController {

    @Autowired
    private StatisticService statisticService;

    @PostMapping(value="console")
    public Result console(){
        return statisticService.console();
    }
}