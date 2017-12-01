package com.google.springmvc.utils;

import com.google.springmvc.pojo.UserDto;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-11-29
 * Time: 14:27
 * Description:
 * 用户信息工具，在用户访问时，直接从session中获取用户信息并存入session使用时直接从线程中获取。
 */
public class UserUtil
{
    static ThreadLocal<UserDto> sessionUser= new ThreadLocal<UserDto>();

    public static ThreadLocal<UserDto> getSessinoUser()
    {
        return sessionUser;
    }

    public static void setSessinoUser(ThreadLocal<UserDto> sessionUser)
    {
        UserUtil.sessionUser = sessionUser;
    }

    public static void clear()
    {
        sessionUser.remove();
    }
}
