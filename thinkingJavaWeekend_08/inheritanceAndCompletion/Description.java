package thinkingJavaWeekend_08.inheritanceAndCompletion;

import myClass.Ckatt;

public class Description {

	private String s;

	public Description(String s) {
		// TODO Auto-generated constructor stub

		this.s = s;
		Ckatt.outConsole("������� Description " + s);

	}

	protected void dispose() {
		Ckatt.outConsole("��������� Description " + s);
	}

}
