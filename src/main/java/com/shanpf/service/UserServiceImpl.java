package com.shanpf.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shanpf.dao.UserDAO;
import com.shanpf.vo.User;

//������ļ���
public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	
	@Override
	public void insertUser(User user) {
		System.out.println("������Srevice");
		userDAO.insertUser(user);
	}

}
