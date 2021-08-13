package com.spring.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: chenf
 * @Date: 2021/8/13 16:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Person {
	@Value("${name}")
	private String name;
	@Value("${age}")
	private String age;
}
