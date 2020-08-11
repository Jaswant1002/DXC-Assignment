package greet;
import org.springframework.stereotype.Component;

@Component
public class GoodDayGreeting implements Greeting { 
	String greeting="have a nice day";
	
	
	public String getGreeting() {
		return greeting;
	}


	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}


	public String greet() {
		return greeting;
	}

}
