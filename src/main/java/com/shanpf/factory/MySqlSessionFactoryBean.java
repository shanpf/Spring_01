package com.shanpf.factory;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.FactoryBean;

public class MySqlSessionFactoryBean  implements FactoryBean<SqlSessionFactory>{

	//主体逻辑 完成某种复杂对象的生产
	@Override
	public SqlSessionFactory getObject() throws Exception {
		//
		return null;
	}

	//返回 某种复杂对象的 类对象
	@Override
	public Class<?> getObjectType() {
		return SqlSessionFactory.class;
	}

	// 控制复杂对象的创建模式
	@Override
	public boolean isSingleton() {
		return true;
	}

}
