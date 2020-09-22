package com.xtk.xtkanalyst;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zyh
 */



@MapperScan("com.xtk.xtkanalyst.mapper")
@SpringBootApplication //禁用security
public class XtkAnalystApplication {

    public static void main(String[] args) {
        SpringApplication.run(XtkAnalystApplication.class, args);
    }

}
