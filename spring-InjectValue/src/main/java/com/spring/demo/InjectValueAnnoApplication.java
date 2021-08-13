package com.spring.demo;

import com.spring.demo.model.AnnoConfiguration;
import com.spring.demo.model.Person;
import com.spring.demo.model.PersonTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: chenf
 * @Date: 2021/8/13 16:50
 */
public class InjectValueAnnoApplication {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnoConfiguration.class);
		PersonTwo bean = applicationContext.getBean(PersonTwo.class);
		System.out.println(bean);
	}
}
