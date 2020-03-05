package com.shanpf.service;

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

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
