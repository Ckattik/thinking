package thinkingJavaWeekend_08.polimorphizmRodent;

import myClass.Ckatt;

public class GuineaPig extends Rodent {

	public GuineaPig()  {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		Ckatt.outConsole("GuineaPig.run()");
	}
	@Override
	public void jump() {
		Ckatt.outConsole("GuineaPig.jump()");
	}
	

}
