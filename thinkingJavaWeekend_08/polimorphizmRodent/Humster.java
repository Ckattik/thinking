package thinkingJavaWeekend_08.polimorphizmRodent;

import myClass.Ckatt;

public class Humster extends Rodent{

	public Humster() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		Ckatt.outConsole("Humster.run()");
	}
	@Override
	public void jump() {
		Ckatt.outConsole("Humster.jump()");
	}
	

}
