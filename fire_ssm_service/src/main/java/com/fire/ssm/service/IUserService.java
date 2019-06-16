package com.fire.ssm.service;

import com.fire.ssm.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserService {
    public List<User> findAll() throws Exception;
}
