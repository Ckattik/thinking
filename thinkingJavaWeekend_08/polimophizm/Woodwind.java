package thinkingJavaWeekend_08.polimophizm;

import myClass.Ckatt;

public class Woodwind extends Wind {

	public Woodwind() {
		// TODO Auto-generated constructor stub
	}
	
	public void play(Note n) {
		Ckatt.outConsole("Woodwind.play() " + n);
	}
	
	public String what() {
		return "Woodwind";
	}
	

}
