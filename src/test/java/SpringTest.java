import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shanpf.di.AUTOComponent;

public class SpringTest {
	private ApplicationContext context;

	@Test
	public void test() {
		// 启动工厂
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 从工厂获取组件
		AUTOComponent aUTOComponent = context.getBean("aUTOComponent", AUTOComponent.class);
		System.out.println(aUTOComponent.toString());
	}

}
