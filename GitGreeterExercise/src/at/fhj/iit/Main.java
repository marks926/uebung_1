package at.fhj.iit;

public class Main {

	public static void main(String[] args) {
		
		Greeter g = new GreeterImpl("Daniel");
		
		g.sayHello();
		g.sayGoodbye();
	}

}
