package thinkingJavaWeekend_08.inheritanceAndCompletion;

import myClass.Ckatt;

public class Characteristic {

	private String s;

	public Characteristic(String s) {
		// TODO Auto-generated constructor stub

		this.s = s;
		Ckatt.outConsole("������� Characteristic " + s);

	}

	protected void dispose() {
		Ckatt.outConsole("��������� Characteristic " + s);
	}

}
