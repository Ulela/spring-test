package spring.test.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: chenf
 * @Date: 2021/8/12 9:47
 */
@Configuration
public class AnnotationConfigConfiguration {

	@Bean
	public Person person() {
		return new Person("daicai", "19");
	}
}
