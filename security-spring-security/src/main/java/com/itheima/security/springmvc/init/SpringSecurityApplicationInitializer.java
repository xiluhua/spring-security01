package com.itheima.security.springmvc.init;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * @author Administrator
 * @version 1.0
 **/
public class SpringSecurityApplicationInitializer
        extends AbstractSecurityWebApplicationInitializer {

    // 若当前环境没有使用Spring或Spring MVC，则需要将 WebSecurityConfig(Spring Security配置类) 传入超 类，以确保获取配置，并创建spring context。
    // 相反，若当前环境已经使用spring，我们应该在现有的springContext中注册Spring Security(上一步已经做将 WebSecurityConfig加载至rootcontext)，
    // 此方法可以什么都不做。 在init包下定义SpringSecurityApplicationInitializer：
    public SpringSecurityApplicationInitializer() {
        //super(WebSecurityConfig.class);
    }
}
