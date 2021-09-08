package spring.test.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author: chenf
 * @Date: 2021/9/8 14:09
 */
@Data
@ToString
public class Cat {
	private String name;
	private Person person;
}
