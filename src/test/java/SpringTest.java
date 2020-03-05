import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shanpf.service.UserService;
import com.shanpf.vo.User;

public class SpringTest {
	private ApplicationContext context ;

	@Test
	public void test() {
		// ��������
		context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// �ӹ�����ȡ���
		UserService userService = context.getBean("userService",UserService.class);
		userService.insertUser(new User());
	}

}
