package com.ztgreat.cola;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.ztgreat.cola", "com.alibaba.cola" })
@MapperScan("com.ztgreat.cola.gatewayimpl.database")
public class ColaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ColaDemoApplication.class, args);
    }

}
