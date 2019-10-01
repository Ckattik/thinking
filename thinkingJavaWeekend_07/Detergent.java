package thinkingJavaWeekend_07;

public class Detergent extends Cleanser{

	
	
	//измен€ем метод scrub
	public void scrub() {
		append("  Detergent.scrub() ");
	    super.scrub();
	}
	// добавл€ем новый метод к интерфейсу
	public void foam() {
		append(" foam()");
	}
	
	public static void main(String [] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.applay();
		x.scrub();
		x.foam();
	
		System.out.println(x);
		System.out.println("ѕровер€ем базовый класс");
		Cleanser.main(args);
		
	}
	
}
