package com.github.ztmark.autoconfigure;

import com.google.gson.Gson;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Author: Mark
 * Date  : 2017/5/28
 */
@Aspect
public class LogParamAspect {
    private static final Logger logger = LoggerFactory.getLogger(LogParamAspect.class);
    private static final Gson gson = new Gson();

    @Autowired
    private LogParamProperties logParamProperties;

    @Before("@annotation(com.github.ztmark.annotation.LogParam) || @within(com.github.ztmark.annotation.LogParam)")
    public void beforeMethodProcess(JoinPoint joinPoint) {
        if (!logParamProperties.isDisable()) {
            logger.info("method {} called and param is {}", joinPoint.getSignature().getName(), gson.toJson(joinPoint.getArgs()));
        }
    }
}
