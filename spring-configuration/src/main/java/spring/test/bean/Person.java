package spring.test.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: chenf
 * @Date: 2021/8/12 10:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	private String name;
	private String age;
}
