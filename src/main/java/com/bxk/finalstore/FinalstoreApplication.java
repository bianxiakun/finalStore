package com.bxk.finalstore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bxk.finalstore.mapper")
public class FinalstoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(FinalstoreApplication.class, args);
    }

}
