package com.young.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties("com.young.config")
@Component
public class CommonConfig {
    public String key;
}
