package com.remango.blog.service.impl;

import com.remango.blog.entity.CurrentUserInfo;
import com.remango.blog.entity.PageList;
import com.remango.blog.entity.User;
import com.remango.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by li on 2019/3/16.
 */

@Service
public class UserServiceImpl implements UserService {
    @Override
    public PageList<User> queryUserList(String username, Integer offset, Integer limit){
        PageList<User> userPageList = new PageList<>();
        return userPageList;
    }

    @Override
    public void saveUser(User user){
        user.setCreateTime(new Date());
    }

    @Override
    public User queryUserByName(String username) {
        return null;
    }

    @Override
    public CurrentUserInfo queryUserInfoByName (String username){
        return null;
    }
    
}
