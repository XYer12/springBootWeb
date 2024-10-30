package com.young.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ConditionalOnProperty(prefix = "com.young.feature", name = "aop", havingValue = "true")
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.young.aop")
public class AopConfiguration {


}
