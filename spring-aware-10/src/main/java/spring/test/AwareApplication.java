package spring.test;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.test.bean.AwareApplicationContext;
import spring.test.bean.Cat;
import spring.test.bean.Person;

/**
 * @author: chenf
 * @Date: 2021/9/9 10:56
 */
public class AwareApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("spring.test.bean");

		AwareApplicationContext contextBean = context.getBean(AwareApplicationContext.class);
		contextBean.printBeanNames();
		System.out.println("beanName 为 : " + contextBean.getBeanName());

		Person bean = context.getBean(Person.class);
		Cat cat = bean.getCat();
		System.out.println(cat);


	}
}
