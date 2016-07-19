
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class main {
	public static void main() {
		ApplicationContext context=new ClassPathXmlApplicationContext("beam.xml");
		second obj=(second)context.getBean("xyz");
		
	}

}
