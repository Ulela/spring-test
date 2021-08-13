package spring.test.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author: chenf
 * @Date: 2021/8/12 10:18
 */
@Configuration
@ComponentScan("spring.test.bean")
@ImportResource("classpath:annotation/beans.xml")
public class CommScanConfiguration {
}
