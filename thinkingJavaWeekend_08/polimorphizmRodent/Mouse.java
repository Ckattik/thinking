package thinkingJavaWeekend_08.polimorphizmRodent;

import myClass.Ckatt;

public class Mouse extends Rodent{

	public Mouse() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		Ckatt.outConsole("Mouse.run()");
	}
	@Override
	public void jump() {
		Ckatt.outConsole("Mouse.jump()");
	}
	

}
