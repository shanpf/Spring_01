package com.shanpf.di;

/**
 * 
 * @Title: ConsComponent.java
 * @Package com.shanpf.di
 * @Description: 构造注入测试类
 * @author shanpf
 * @date 2020年3月5日 下午3:49:18
 * @version V1.0
 */
public class ConsComponent {
	private Integer id;
	private String name;
	private Boolean gender;

	public ConsComponent() {
	}

	public ConsComponent(Integer id, String name, Boolean gender) {
		System.out.println("构造1");
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public ConsComponent(Integer id, String name) {
		System.out.println("构造2");
		this.id = id;
		this.name = name;
	}

	public ConsComponent(Boolean gender, Integer id, String name) {
		System.out.println("构造3");
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "ConsComponent [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}

}
