package com.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}, proxyBeanMethods = false)
public class Application {

    public static void main(String[] args) {
        System.out.println("hello/.....");
        SpringApplication.run(Application.class, args);
        System.out.println("Done");
    }

}
