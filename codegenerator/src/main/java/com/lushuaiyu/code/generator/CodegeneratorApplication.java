package com.lushuaiyu.code.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class CodegeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodegeneratorApplication.class, args);
    }

}
