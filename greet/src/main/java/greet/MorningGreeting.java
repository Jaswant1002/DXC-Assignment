package greet;
import org.springframework.stereotype.Component;

@Component
public class MorningGreeting implements Greeting {
	String greeting="Good Morning";
	public String greet()
	{
		return greeting;
	}

}
