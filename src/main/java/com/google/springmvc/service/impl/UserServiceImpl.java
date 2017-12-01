package com.google.springmvc.service.impl;

import com.google.springmvc.dao.UserDao;
import com.google.springmvc.pojo.UserDto;
import com.google.springmvc.repository.domain.SpringmvcUserEntity;
import com.google.springmvc.service.UserService;
import com.google.springmvc.utils.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-11-30
 * Time: 18:31
 * Description:
 */
@Service
public class UserServiceImpl implements UserService
{

    @Autowired
    private UserDao userDao;
    @Autowired
    private BeanMapper beanMapper;
    /**
     * 注册用户
     *
     * @param userDto
     */
    public boolean insertuser(UserDto userDto)
    {
        SpringmvcUserEntity springUserEntity = beanMapper.map(userDto, SpringmvcUserEntity.class);

        boolean b = userDao.insertUser(springUserEntity);
        return b;
    }
}
