package com.zhangwen.learn.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 请求响应日志打印
 *
 * @author zhangwen【zhangwenit@126.com】
 *         2018/1/8 22:42
 **/
@Component
@Aspect
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.zhangwen.learn.controller.Example.*(..))")
    public void log() {
    }

    @Before("log()")
    public void before(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //获取请求路径，method, ip, 方法路径，参数
        logger.info("url={},method={},ip={},class={},params={}",
                request.getRequestURI()
                , request.getMethod(), request.getRemoteAddr()
                , joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName()
                , joinPoint.getArgs());
    }

    @AfterReturning(returning = "o", pointcut = "log()")
    public void afterReturn(Object o) {
        logger.info("return={}", o);
        logger.debug("return={}", o);
    }

}
