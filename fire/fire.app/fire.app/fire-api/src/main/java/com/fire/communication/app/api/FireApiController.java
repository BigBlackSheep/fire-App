package com.fire.communication.app.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Auther: Gz.
 * @Date: 2019/5/10 22:17
 * @Description:
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.fire.communication.app")
@MapperScan("com.fire.communication.app.biz.mapper")
public class FireApiController {

  public static void main(String[] args) {
    SpringApplication.run(FireApiController.class,args);
  }
}
