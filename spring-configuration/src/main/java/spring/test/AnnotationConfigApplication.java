package spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.test.bean.AnnotationConfigConfiguration;
import spring.test.bean.Person;

/**
 * @author: chenf
 * @Date: 2021/8/12 10:08
 */
public class AnnotationConfigApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfigConfiguration.class);
		Person person = applicationContext.getBean(Person.class);
		System.out.println(person);
	}
}
