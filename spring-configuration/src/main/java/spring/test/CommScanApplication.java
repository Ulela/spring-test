package spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.test.bean.Cat;
import spring.test.bean.CommScanConfiguration;

/**
 * @author: chenf
 * @Date: 2021/8/12 10:20
 */
public class CommScanApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CommScanConfiguration.class);
		Cat bean = applicationContext.getBean(Cat.class);
		System.out.println(bean);
	}
}
