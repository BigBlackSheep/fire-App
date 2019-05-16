package com.fire.communication.app.biz.service.Impl;

import com.fire.communication.app.biz.dto.UsersDto;
import com.fire.communication.app.biz.mapper.UsersDtoMapper;
import com.fire.communication.app.biz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * @Auther: Gz.
 * @Date: 2019/5/16 21:33
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UsersDtoMapper usersDtoMapper;

  @Override
  public UsersDto queryUserById(Long userId) {
    Example example = new Example(UsersDto.class);
    example.createCriteria().andEqualTo("id",userId);
    return usersDtoMapper.selectOneByExample(example);
  }
}
