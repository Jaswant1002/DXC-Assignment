package greet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreeterService {
	public static void main(String args[])
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Greeting grt=(Greeting)context.getBean("gooddaygreeting");
		grt.greet();
	}

}
