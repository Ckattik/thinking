package thinkingJavaWeekend_08.referenceCounting;

import myClass.Ckatt;

public class Composing {

	private Shared shared;
	private static long counter;
	private final long id = counter++;
	
	
	public Composing(Shared shared) {
		// TODO Auto-generated constructor stub
	
		Ckatt.outConsole("������� " + this);
		this.shared = shared;
		this.shared.addReff();
	
	
	}
	
	public void dispose() {
		Ckatt.outConsole("Disposing " + this);
		shared.dispose();
	}
	
	public String toString() {
		return "Composing " + id;
	}

}
