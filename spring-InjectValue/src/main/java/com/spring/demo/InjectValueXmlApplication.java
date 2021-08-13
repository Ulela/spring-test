package com.spring.demo;

import com.spring.demo.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author: chenf
 * @Date: 2021/8/13 16:50
 */
public class InjectValueXmlApplication {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
		Person bean = applicationContext.getBean(Person.class);
		System.out.println(bean);
	}
}
