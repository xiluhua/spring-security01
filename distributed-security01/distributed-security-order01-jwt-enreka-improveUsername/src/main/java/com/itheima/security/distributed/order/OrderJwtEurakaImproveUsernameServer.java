package com.itheima.security.distributed.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderJwtEurakaImproveUsernameServer {
    public static void main(String[] args) {
        SpringApplication.run(OrderJwtEurakaImproveUsernameServer.class, args);
    }
}
