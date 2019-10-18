package thinkingJavaWeekend_08.polimophizm;

import myClass.Ckatt;

public class Wind extends Instrument{

	public Wind() {
		// TODO Auto-generated constructor stub
	}

	public void play(Note n) {
		Ckatt.outConsole("Wind.play() " + n);
	}
	
}
