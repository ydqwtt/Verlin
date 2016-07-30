package com.verlin.dao;

import com.verlin.entity.User;

public interface UserDao {
	/**
	 * @param userId
	 * @return User
	 */
	public User selectUserById(Integer userId);  
}
