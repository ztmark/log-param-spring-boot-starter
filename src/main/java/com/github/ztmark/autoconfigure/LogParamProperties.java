package com.github.ztmark.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Author: Mark
 * Date  : 2017/5/28
 */
@ConfigurationProperties(prefix = "log-param")
public class LogParamProperties {
    private boolean disable = false;

    public boolean isDisable() {
        return disable;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }
}
