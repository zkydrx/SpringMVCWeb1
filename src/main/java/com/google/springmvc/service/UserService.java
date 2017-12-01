package com.google.springmvc.service;

import com.google.springmvc.pojo.UserDto;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-11-30
 * Time: 18:31
 * Description:
 */
public interface UserService
{
    /**
     * 注册用户
     * @param userDto
     */
    boolean insertuser(UserDto userDto);
}
