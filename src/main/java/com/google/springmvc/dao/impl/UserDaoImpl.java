package com.google.springmvc.dao.impl;

import com.google.springmvc.dao.UserDao;
import com.google.springmvc.repository.domain.SpringmvcUserEntity;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-11-30
 * Time: 18:22
 * Description:
 */
public class UserDaoImpl implements UserDao
{

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }

    /**
     * 添加user
     *
     * @param springmvcUserEntity
     * @return
     */
    public boolean insertUser(SpringmvcUserEntity springmvcUserEntity)
    {
        return false;
    }

    /**
     * 删除user
     *
     * @param id
     * @return
     */
    public boolean deleteUser(String id)
    {
        return false;
    }

    /**
     * 修改user
     *
     * @param springmvcUserEntity
     * @return
     */
    public boolean updateUser(SpringmvcUserEntity springmvcUserEntity)
    {
        return false;
    }

    /**
     * 查找user
     *
     * @param name
     * @return
     */
    public List<SpringmvcUserEntity> listUser(String name)
    {
        return null;
    }
}
