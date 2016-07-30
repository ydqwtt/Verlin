package com.verlin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verlin.dao.UserDao;
import com.verlin.entity.User;
import com.verlin.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired  
    private UserDao userDao;
	
	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);
	}

}
