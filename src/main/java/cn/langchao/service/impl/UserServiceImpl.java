package cn.langchao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.langchao.bean.User;
import cn.langchao.dao.UserDao;
import cn.langchao.service.UserService;

public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDao userDao;
    public List<User> getUser()
    {
        return userDao.getUser();
    }
    
}
