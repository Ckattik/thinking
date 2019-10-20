package thinkingJavaWeekend_09.interfaces;

import myClass.Ckatt;

public class Wind implements Instrument{

	public Wind() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
	Ckatt.outConsole(this + ".play()" + n);	
	}
	
	@Override
	public void adjust() {
		// TODO Auto-generated method stub
		Ckatt.outConsole(this + ".adjust()");
	}
	
	public String toString() {
		return "Wind";
	}
	
}
