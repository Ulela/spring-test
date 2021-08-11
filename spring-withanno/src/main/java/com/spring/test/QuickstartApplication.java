package com.spring.test;

import com.spring.test.dao.anno.Color;
import com.spring.test.dao.bean.Dog;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.stream.Stream;

/**
 * @author: chenf
 * @Date: 2021/8/11 11:20
 */
public class QuickstartApplication {
	public static void main(String[] args) throws Exception {
		/*
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("quickstart-withanno.xml");
		String[] beans = applicationContext.getBeanDefinitionNames();
		Stream.of(beans).forEach(System.out::println);
		*/

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("quickstart-withanno.xml");
		ObjectProvider<Dog> beanProvider = applicationContext.getBeanProvider(Dog.class);
		System.out.println(beanProvider.getIfAvailable());
	}
}
