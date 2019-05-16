package com.fire.communication.app.biz.service;

import com.fire.communication.app.biz.dto.UsersDto;

/**
 * @Auther: Gz.
 * @Date: 2019/5/16 21:31
 * @Description:
 */
public interface UserService {

   UsersDto queryUserById(Long userId);

}
