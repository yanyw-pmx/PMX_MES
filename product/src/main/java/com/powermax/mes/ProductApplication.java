package com.powermax.mes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.powermax.mes.mapper")
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
    }
}
