package spring.test.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: chenf
 * @Date: 2021/9/8 15:20
 */
@Data
@ToString
@Component
public class PersonList {
	@Autowired
	private List<Person> list;
}
