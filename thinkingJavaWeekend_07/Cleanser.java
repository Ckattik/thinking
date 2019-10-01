package thinkingJavaWeekend_07;

public class Cleanser {

	private String s = "Cleanser";

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");
	}
	
	public void applay() {
		append(" applay()");
	}
	public void scrub() {
		append(" scrub()");
	}
	
	public String toString() {
		return s;
	}
	
	public static void main (String [] args) {
		Cleanser x = new Cleanser();
	    x.dilute();
	    x.applay();
	    x.scrub();
	    System.out.println(x);
	
	}
	
	
}
