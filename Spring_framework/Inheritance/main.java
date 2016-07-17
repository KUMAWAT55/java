
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		parent obj1=(parent)context.getBean("1");
		obj1.getM1();
		obj1.getM2();
		child boj2=(child)context.getBean("2");
		boj2.getM1();
		boj2.getM2();
		boj2.getM3();

	}

}

