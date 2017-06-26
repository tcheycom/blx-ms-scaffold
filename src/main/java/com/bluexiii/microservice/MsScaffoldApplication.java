package com.bluexiii.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard //only work with spring-boot 1.4.x
public class MsScaffoldApplication {  //NOSONAR
    public static void main(String[] args) {
        SpringApplication.run(MsScaffoldApplication.class, args);  //NOSONAR
    }
}
