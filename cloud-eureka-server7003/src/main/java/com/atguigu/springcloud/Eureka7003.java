package com.atguigu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Authtor pshdhx
 * @Date 2021/7/4 15:19
 * @Version 1.0
 */


@EnableEurekaServer
@SpringBootApplication
public class Eureka7003 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7003.class,args);
    }
}
