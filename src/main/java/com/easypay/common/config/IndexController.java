package com.easypay.common.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName: IndexController
 * @Description: 通用访问拦截匹配
 * @Author: lww
 * @Date: 6/28/23 10:56 AM
 * @Version: V1
 **/
@Controller
public class IndexController {

    @GetMapping("{url}.html")
    public String page(@PathVariable("url") String url) {
        return  url;
    }

    @GetMapping("{module}/{url}.html")
    public String page(@PathVariable("module") String module, @PathVariable("url") String url) {
        return module + "/" + url;
    }

    @GetMapping("{module}/{sub}/{url}.html")
    public String page(@PathVariable("module") String module,
                       @PathVariable("url") String url,
                       @PathVariable("sub") String sub) {
        return module + "/" + sub + "/" + url;
    }

    @GetMapping("{module}/{sub}/{smallSub}/{url}.html")
    public String page(@PathVariable("module") String module,
                       @PathVariable("url") String url,
                       @PathVariable("sub") String sub,
                       @PathVariable("smallSub") String smallSub) {
        return module + "/" + sub + "/" + smallSub + "/" + url;
    }

}