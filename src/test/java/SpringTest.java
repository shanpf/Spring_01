import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shanpf.dao.UserDAO;
import com.shanpf.vo.User;

public class SpringTest {
	private ApplicationContext context ;

	@Test
	public void test() {
		// ��������
		context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// �ӹ�����ȡ���
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		UserDAO userDAO2 = context.getBean("userDAO", UserDAO.class);
		userDAO.insertUser(new User());
	}

}
