package com.spring.test;

import com.spring.test.dao.DemoDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author: chenf
 * @Date: 2021/8/11 11:20
 */
public class QuickstartByTypeApplication {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("quickstart-oftype.xml");
		Map<String, DemoDao> beans = applicationContext.getBeansOfType(DemoDao.class);
		beans.forEach((beanName, bean) -> {
			System.out.println(beanName + ":" + bean.toString());
		});
	}
}
