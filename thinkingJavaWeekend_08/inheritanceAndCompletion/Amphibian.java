package thinkingJavaWeekend_08.inheritanceAndCompletion;

import myClass.Ckatt;

public class Amphibian extends Animal{


	private Characteristic p = new Characteristic("����� ���� � ���� ");
	private Description d = new Description("� � ���� � �� ����� ");
	
	
	public Amphibian() {
		// TODO Auto-generated constructor stub
		Ckatt.outConsole("Amphibian() ");
		
	}
	
	protected void dispose() {
		Ckatt.outConsole("dipose � Amphibian");
		p.dispose();
		d.dispose();
		super.dispose();
	}

}
