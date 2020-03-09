package com.shanpf.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
	private static final long serialVersionUID = 2311259373535480300L;
	private Integer id;
	private String userId;
	private String orderNumber;
	private String created;
	private String updated;
	private User user;
}