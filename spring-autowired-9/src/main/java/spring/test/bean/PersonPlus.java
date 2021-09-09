package spring.test.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author: chenf
 * @Date: 2021/9/8 17:17
 */
@Component
@Primary
@Data
@ToString
public class PersonPlus {
	private String[] names;
	private List<String> tels;
	private Set<Cat> cats;
	private Map<String, Object> events;
	private Properties props;
}
