package com.github.ztmark.autoconfigure;

import com.github.ztmark.annotation.LogParam;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: Mark
 * Date  : 2017/5/28
 */
@Configuration
@EnableConfigurationProperties(LogParamProperties.class)
@ConditionalOnClass(LogParam.class)
public class LogParamAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(LogParamAspect.class)
    public LogParamAspect logParamAspect() {
        return new LogParamAspect();
    }

}
