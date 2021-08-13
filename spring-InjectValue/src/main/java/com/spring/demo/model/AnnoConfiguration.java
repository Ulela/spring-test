package com.spring.demo.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: chenf
 * @Date: 2021/8/13 17:00
 */
@Configuration
@ComponentScan("com.spring.demo.model")
@PropertySource("classpath:beans/person.yml")
public class AnnoConfiguration {

}
