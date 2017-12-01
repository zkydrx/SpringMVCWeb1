package com.google.springmvc.utils;

import com.google.common.collect.Lists;
import org.dozer.Mapper;
import org.springframework.util.Assert;

import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-11-29
 * Time: 15:36
 * Description:
 */
public class BeanMapper
{

    private Mapper mapper;

    /**
     * 将一个对象转换成一个实体类
     *
     * @param source
     * @param destionationClass
     * @param <T>
     * @return
     */
    public <T> T map(Object source, Class<T> destionationClass)
    {
        Assert.notNull(source, "未查询到相关数据");
        T t = mapper.map(source, destionationClass);
        return t;
    }


    /**
     * 将一个对象转换成一个实体类。
     * @param source
     * @param destionationClass
     * @param keyID
     * @param <T>
     * @return
     */
    public <T> T map(Object source, Class<T> destionationClass, String keyID)
    {
        Assert.notNull(source, "未查询到相关数据");
        T t = mapper.map(source, destionationClass, keyID);
        return t;
    }


    /**
     * 将一个集合转成一个目标实体类的集合
     * @param sourceList
     * @param destionationClass
     * @param <T>
     * @return
     */
    public <T> List<T> map(Collection<?> sourceList,Class<T> destionationClass)
    {
        List<T> destinationList = Lists.newArrayList();
        if(null !=  sourceList&&sourceList.size() >0)
        {
            for (Object o : sourceList)
            {
                T t = mapper.map(o, destionationClass);
                destinationList.add(t);
            }
        }
        return destinationList;
    }


    /**
     * 将一个对象的值复制到另外一个对象中。
     * @param source
     * @param destinationObject
     */
    public void copy(Object source,Object destinationObject)
    {
        Assert.notNull(source,"未查询到相关数据。");
        Assert.notNull(destinationObject,"目标结果对象为空");
        mapper.map(source,destinationObject);
    }

}
