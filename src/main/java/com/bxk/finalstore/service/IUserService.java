package com.bxk.finalstore.service;

import com.bxk.entity.User;
import com.bxk.finalstore.service.ex.PasswordNotMatchException;
import com.bxk.finalstore.service.ex.UserNotFoundException;

/*
业务层接口
 */

public interface IUserService {
    /**
     * 根据用户名查询对应的信息
     * @param username
     * @param password
     * @return
     * @throws UserNotFoundException
     * @throws PasswordNotMatchException
     */
    User login(String username, String password)throws UserNotFoundException, PasswordNotMatchException;
}
