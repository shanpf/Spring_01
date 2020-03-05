import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shanpf.service.UserService;
import com.shanpf.vo.User;

public class SpringTest {
	private ApplicationContext context ;

	@Test
	public void test() {
		// 启动工厂
		context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// 从工厂获取组件
		UserService userService = context.getBean("userService",UserService.class);
		userService.insertUser(new User());
	}

}
