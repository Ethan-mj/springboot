package com.zeasn.whitelist;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zeasn.whitelist.dao.mapper")
public class WhitelistApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhitelistApplication.class, args);
    }

}
