package com.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: chenf
 * @Date: 2021/8/11 11:20
 */
public class QuickstartByTypeApplication {
	public static void main(String[] args) throws Exception {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("inject-set.xml");
		Person person = beanFactory.getBean(Person.class);
		System.out.println(person);

		Cat cat = beanFactory.getBean(Cat.class);
		System.out.println(cat);
	}
}
