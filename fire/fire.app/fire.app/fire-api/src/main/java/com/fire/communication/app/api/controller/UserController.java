package com.fire.communication.app.api.controller;

import com.alibaba.fastjson.JSON;
import com.fire.communication.app.biz.dto.UsersDto;
import com.fire.communication.app.biz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Gz.
 * @Date: 2019/5/16 21:35
 * @Description:
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/queryUserById")
  public String queryUserById(@RequestParam("id") Long id){
      UsersDto usersDto = userService.queryUserById(id);
      return JSON.toJSONString(usersDto);
  }

}
