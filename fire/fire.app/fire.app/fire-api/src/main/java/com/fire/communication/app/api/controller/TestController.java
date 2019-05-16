package com.fire.communication.app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Gz.
 * @Date: 2019/5/15 21:56
 * @Description:
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

  @GetMapping("hello")
  public String hello(){
    return "hello";
  }


}
