package spring.test.bean;

import lombok.Data;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: chenf
 * @Date: 2021/9/9 10:46
 */
@Data
@Component
public class Person {
	private Cat cat;

	public Cat getCat() {
		return cat;
	}

	@Autowired
	public void setCat(ObjectProvider<Cat> provider) {
		this.cat = provider.getIfAvailable();
	}


}
