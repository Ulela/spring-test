package spring.test.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * @author: chenf
 * @Date: 2021/9/9 10:47
 */
@Component
public class AwareApplicationContext implements ApplicationContextAware, BeanNameAware {

	private ApplicationContext context;
	private String beanName;

	public String getBeanName() {
		return beanName;
	}

	public void printBeanNames() {
		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}

	@Override
	public void setBeanName(String s) {
		this.beanName = s;
	}
}
