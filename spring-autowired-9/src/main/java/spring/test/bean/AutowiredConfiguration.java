package spring.test.bean;

import com.sun.xml.internal.bind.annotation.XmlLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: chenf
 * @Date: 2021/9/8 14:10
 */
@Configuration
@ImportResource("classpath:beans.xml")
public class AutowiredConfiguration {

	@Bean
	@Qualifier("mini")
	Cat cat(Person person) {
		Cat cat = new Cat();
		cat.setName("mimi");
		cat.setPerson(person);
		return cat;
	}

	@Bean
	@Primary
	Person master() {
		Person person = new Person();
		person.setName("dacai");
		return person;
	}

	@Bean
	@Primary
	PersonPlus personPlus() {
		PersonPlus personPlus = new PersonPlus();
		Set<Cat> cats = new HashSet<>();
		Cat cat = new Cat();
		cat.setName("maomi");
		cats.add(cat);
		personPlus.setCats(cats);
		String[] names = {"大财","小财"};
		personPlus.setNames(names);
		return personPlus;
	}
}
