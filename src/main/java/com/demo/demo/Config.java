package com.demo.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    CompClient compClient() {
        return new CompClient();
    }
}
