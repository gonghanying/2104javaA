package com.lening;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    /**
     *这是测试者李四
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
