package com.shanpf.di;

import com.shanpf.dao.UserDAO;

/**
 * 
 * @Title: AUTOComponent.java
 * @Package com.shanpf.di
 * @Description: spring自动注入测试类
 * @author shanpf
 * @date 2020年3月5日 下午4:14:36
 * @version V1.0
 */
public class AUTOComponent {
	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public String toString() {
		return "AUTOComponent [userDAO=" + userDAO + "]";
	}

}
