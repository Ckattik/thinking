package thinkingJavaWeekend_08.inheritanceAndCompletion;

import myClass.Ckatt;

public class Frog extends Amphibian{


	private Characteristic p = new Characteristic("������� ");
	private Description d = new Description("��� ����� ");
	
	
	
	public Frog() {
		// TODO Auto-generated constructor stub
	
	  Ckatt.outConsole("Frog()");
	}
	
	protected void dispose() {
		Ckatt.outConsole("���������� Frog()");
		p.dispose();
		d.dispose();
		super.dispose();
	}

	public static void main(String [] args) {
		Frog f = new Frog();
		Ckatt.outConsole("����!");
		f.dispose();
	}
	
	
	
}
