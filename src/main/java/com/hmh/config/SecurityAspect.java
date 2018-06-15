package com.hmh.config;

import com.hmh.service.UserService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by 62450 on 2018/6/14.
 */
@Aspect
@Component
public class SecurityAspect {
    @Autowired
    private UserService userService;

    static Logger logger = LoggerFactory.getLogger(SecurityAspect.class);

//    @Pointcut("execution(* com.hmh.service.*.*(..))")
    @Pointcut("within(com.hmh.service.impl.UserServiceImpl)")
    public void check(){}

    @Before("check()")
    public void checkBefore(){
        System.out.println("-----before-----");
    }

    @After("check()")
    public void checkAfter(){
        System.out.println("-----after-----");
    }
}
