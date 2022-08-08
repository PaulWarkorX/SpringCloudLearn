package com.cloud.xframe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : zengh
 * @Date : 2022/8/5 0005 - 19:38
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7003 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7003.class, args);
    }
}
