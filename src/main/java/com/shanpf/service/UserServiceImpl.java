package com.shanpf.service;

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

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
