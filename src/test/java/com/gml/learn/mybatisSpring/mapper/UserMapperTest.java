package com.gml.learn.mybatisSpring.mapper;

import com.gml.learn.mybatisSpring.po.User;
import com.gml.learn.mybatisSpring.po.UserExample;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * @author minglug
 * @date 2016/12/23
 */
public class UserMapperTest {
    private ApplicationContext applicationContext;
    private UserMapper userMapper;

    @Test
    public void countByExample() throws Exception {

    }

    @Test
    public void deleteByExample() throws Exception {

    }

    @Test
    public void deleteByPrimaryKey() throws Exception {

    }

    @Test
    public void insert() throws Exception {

    }

    @Test
    public void insertSelective() throws Exception {

    }

    @Test
    public void selectByExample() throws Exception {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo("张三");
        List<User> userList = userMapper.selectByExample(userExample);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void selectByPrimaryKey() throws Exception {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
    }

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        userMapper = (UserMapper) applicationContext.getBean("userMapper");
    }

    @Test
    public void updateByExample() throws Exception {

    }

    @Test
    public void updateByExampleSelective() throws Exception {

    }

    @Test
    public void updateByPrimaryKey() throws Exception {
       /* User user = userMapper.selectByPrimaryKey(10);
        user.setBirthday(new Date());
        user.setSex("0");
        userMapper.updateByPrimaryKey(user);*/
        User user1 = new User();
        user1.setId(16);
        user1.setUsername("test");
        user1.setBirthday(new Date());
        user1.setAddress("aaaa");
        userMapper.updateByPrimaryKey(user1);
    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {
        User user1 = new User();
        user1.setId(16);
        user1.setBirthday(new Date());
        userMapper.updateByPrimaryKeySelective(user1);
    }

}