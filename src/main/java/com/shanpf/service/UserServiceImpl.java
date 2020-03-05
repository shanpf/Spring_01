package com.shanpf.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shanpf.dao.UserDAO;
import com.shanpf.vo.User;

//组件的文件度
public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	
	@Override
	public void insertUser(User user) {
		System.out.println("进入了Srevice");
		userDAO.insertUser(user);
	}

}
