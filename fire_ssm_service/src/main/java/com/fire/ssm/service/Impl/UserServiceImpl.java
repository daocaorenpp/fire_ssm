package com.fire.ssm.service.Impl;

import com.fire.ssm.dao.IUserDao;
import com.fire.ssm.domain.User;
import com.fire.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional //事务注解
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAll() throws Exception {

        List<User> userList = userDao.findAll();
        return userList;
    }
}
