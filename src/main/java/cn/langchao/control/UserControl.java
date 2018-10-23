package cn.langchao.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.langchao.bean.User;
import cn.langchao.service.UserService;

public class UserControl
{
    @Autowired
    private UserService userService;
    public List<User> getUser(){
        return userService.getUser();
    }
}
