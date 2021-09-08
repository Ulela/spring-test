package spring.test.bean;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author: chenf
 * @Date: 2021/9/8 13:55
 */
@Data
@ToString
@Component("administrator")
public class Person {
	private String name = "administrator";
}
