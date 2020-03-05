package com.shanpf.di;

/**
 * 
 * @Title: ConsComponent.java
 * @Package com.shanpf.di
 * @Description: ����ע�������
 * @author shanpf
 * @date 2020��3��5�� ����3:49:18
 * @version V1.0
 */
public class ConsComponent {
	private Integer id;
	private String name;
	private Boolean gender;

	public ConsComponent() {
	}

	public ConsComponent(Integer id, String name, Boolean gender) {
		System.out.println("����1");
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public ConsComponent(Integer id, String name) {
		System.out.println("����2");
		this.id = id;
		this.name = name;
	}

	public ConsComponent(Boolean gender, Integer id, String name) {
		System.out.println("����3");
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "ConsComponent [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}

}
