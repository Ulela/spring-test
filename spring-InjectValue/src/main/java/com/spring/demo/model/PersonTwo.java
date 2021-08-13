package com.spring.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: chenf
 * @Date: 2021/8/13 17:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class PersonTwo {
	@Value("#{person.name + ':two'}")
	private String name;
	@Value("#{person.age + 1}")
	private String age;
}
