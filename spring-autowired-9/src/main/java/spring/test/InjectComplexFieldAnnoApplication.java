package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.test.bean.Cat;
import spring.test.bean.Dog;
import spring.test.bean.PersonList;
import spring.test.bean.PersonPlus;

/**
 * @author: chenf
 * @Date: 2021/9/8 14:02
 */
public class InjectComplexFieldAnnoApplication {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new AnnotationConfigApplicationContext("spring.test.bean");
		/*Cat cat = ctx.getBean(Cat.class);
		System.out.println(cat);

		Dog dog = ctx.getBean(Dog.class);
		System.out.println(dog);*/

		PersonPlus bean = ctx.getBean(PersonPlus.class);
		System.out.println(bean);
	}
}
