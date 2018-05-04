package com.sunlands.ehr.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Zuul启动类
 */
@SpringBootApplication
@EnableZuulProxy
public class EhrZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(EhrZuulApplication.class, args);
    }
}
