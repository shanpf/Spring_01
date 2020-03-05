package com.shanpf.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.shanpf.dao.UserDAO;

/**
 * 
 * @Title: setComponent.java
 * @Package com.shanpf.di
 * @Description: 注入测试类
 * @author shanpf
 * @date 2020年3月5日 下午3:01:10
 * @version V1.0
 */
public class SetComponent {
	private Integer id;
	private String name;
	private Boolean gender;
	private UserDAO userDAO;
	private List<Object> list04;
	private Set<String> set04;
	private Map<String, Object> map04;
	private Properties props04;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public List<Object> getList04() {
		return list04;
	}

	public void setList04(List<Object> list04) {
		this.list04 = list04;
	}

	public Set<String> getSet04() {
		return set04;
	}

	public void setSet04(Set<String> set04) {
		this.set04 = set04;
	}

	public Map<String, Object> getMap04() {
		return map04;
	}

	public void setMap04(Map<String, Object> map04) {
		this.map04 = map04;
	}

	public Properties getProps04() {
		return props04;
	}

	public void setProps04(Properties props04) {
		this.props04 = props04;
	}

	@Override
	public String toString() {
		return "setComponent [id=" + id + ", name=" + name + ", gender=" + gender + ", userDAO=" + userDAO + ", list04="
				+ list04 + ", set04=" + set04 + ", map04=" + map04 + ", props04=" + props04 + "]";
	}
}
