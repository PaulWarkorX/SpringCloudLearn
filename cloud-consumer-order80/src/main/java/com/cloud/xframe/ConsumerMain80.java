package com.cloud.xframe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author : zengh
 * @Date : 2022/8/5 0005 - 12:05
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain80.class, args);
    }
}
