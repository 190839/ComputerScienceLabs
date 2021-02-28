
public class calculationSequence {

	public void start() {
		question q = new question();
		calc c = new calc();
		q.ask("o");
		q.ask("v1");
		q.ask("v2");
		
		c.run();
		
		System.out.println("\n\n");
	}
	
}
