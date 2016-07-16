
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class rohit2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		rohit1 obj=(rohit1)context.getBean("aa");
		obj.getA();

	}

}
