package thinkingJavaWeekend_07;

public class Story extends Detergent{

	
	public void scrub() {
		append(" Story.scrub()");
	}
	
	public void perfom() {
		append(" Story.perfom");
	}
	
	public static void main(String [] args) {
		Detergent x = new Detergent();
		Story st = new Story();
		st.dilute();
		st.applay();
		st.scrub();
		st.foam();
		System.out.println(st);
		System.out.println();
		System.out.println("Проверяем базовый класс");
		Cleanser.main(args);
		Detergent.main(args);
	}
	
}
