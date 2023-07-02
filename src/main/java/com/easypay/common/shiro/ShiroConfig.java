package com.easypay.common.shiro;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.mgt.SessionsSecurityManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName: ShiroConfig
 * @Description: Shiro权限配置
 * @Author: lww
 * @Date: 6/28/23 7:22 PM
 * @Version: V1
 **/
@Configuration
public class ShiroConfig {

    @Bean
    public UserRealm userRealm() {
        return new UserRealm();
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean (SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        shiroFilterFactoryBean.setLoginUrl("/login.html");
        shiroFilterFactoryBean.setUnauthorizedUrl("/403");
        Map<String, Filter> filtersMap = new LinkedHashMap<>();
        shiroFilterFactoryBean.setFilters(filtersMap);
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
        /**
         * 静态文件
         */
        filterChainDefinitionMap.put("/css/**","anon");
        filterChainDefinitionMap.put("/lib/**","anon");
        filterChainDefinitionMap.put("/images/**","anon");
        filterChainDefinitionMap.put("/js/**","anon");

        /**
         * 登录注册
         */
        filterChainDefinitionMap.put("/login.html","anon");
        filterChainDefinitionMap.put("/sys/logout","anon");
        filterChainDefinitionMap.put("/sys/login","anon");

        /**
         * 支付异步回调
         */
        filterChainDefinitionMap.put("/order/wxNotify","anon");
        filterChainDefinitionMap.put("/order/aliNotify","anon");

        /**
         * 管理后台
         */
        filterChainDefinitionMap.put("/sys/**", "roles[admin]");
        filterChainDefinitionMap.put("/**", "authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

    @Bean
    public SessionsSecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(userRealm());
        securityManager.setSessionManager(sessionManager());
        return securityManager;
    }

    @Bean
    public DefaultWebSessionManager sessionManager() {
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        sessionManager.setSessionIdUrlRewritingEnabled(false);
        long time = 2*60*60*1000;
        sessionManager.setGlobalSessionTimeout(time);
        return sessionManager;
    }

    @Bean
    public ShiroDialect shiroDialect(){
        return new ShiroDialect();
    }

    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

}