package com.verlin.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.verlin.base.SpringTestCase;
import com.verlin.entity.User;

public class UserServiceTest extends SpringTestCase{
	
	@Autowired  
    private UserService userService;
	
	@Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(1);  
        System.out.println(user.getUserName() + ":" + user.getUserPassword());
    }
}
