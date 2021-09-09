package spring.test.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author: chenf
 * @Date: 2021/9/9 11:08
 */
@Data
//@Component
@ToString
public class Cat {
	private String name = "maomi";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
