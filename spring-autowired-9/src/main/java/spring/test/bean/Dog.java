package spring.test.bean;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: chenf
 * @Date: 2021/9/8 14:01
 */
@Component
@ToString
public class Dog {

	@Value("dogdog")
	private String name;

	// method 1
	/*@Autowired
	private Person person;*/

	//method 2
	/*private Person person;
	public Dog(Person person) {
		this.person = person;
	}*/

	//method 3
	private Person person;
	@Autowired
	@Qualifier("administrator")
	public void setPerson(Person person) {
		this.person = person;
	}
}
