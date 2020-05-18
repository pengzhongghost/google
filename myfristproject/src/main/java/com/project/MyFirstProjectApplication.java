package com.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.project.mapper")
@ServletComponentScan
@EnableSwagger2

public class MyFirstProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFirstProjectApplication.class, args);
    }

}
