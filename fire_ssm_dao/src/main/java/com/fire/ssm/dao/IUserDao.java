package com.fire.ssm.dao;

import com.fire.ssm.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {

    @Select("select * from User01")
    List<User> findAll();
}
