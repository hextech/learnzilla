package com.home.learn.zilla.service.spring.batch.dosomething;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.FactoryBean;

public class TestDataReadFromList implements FactoryBean<List<String>> {

	public List<String> getObject() throws Exception {
		// TODO Auto-generated method stub
		List<String> list2Ret = new ArrayList<String>();
		list2Ret.add("Bhupen");
		list2Ret.add("Conan");
		list2Ret.add("Benjamin");
		list2Ret.add("Jssay");
		list2Ret.add("Kuntal");
		return list2Ret;
	}

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return List.class;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
