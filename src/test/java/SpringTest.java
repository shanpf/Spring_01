import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shanpf.di.AUTOComponent;

public class SpringTest {
	private ApplicationContext context;

	@Test
	public void test() {
		// ��������
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// �ӹ�����ȡ���
		AUTOComponent aUTOComponent = context.getBean("aUTOComponent", AUTOComponent.class);
		System.out.println(aUTOComponent.toString());
	}

}
