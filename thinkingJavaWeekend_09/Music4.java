package thinkingJavaWeekend_09;

import myClass.Ckatt;

public class Music4 {

	public Music4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Note [] note = Note.values();
		for(Note n : note) {
			Ckatt.outConsole(n);
		}

		/*OperationEnum op = OperationEnum.SUM;
		Ckatt.outConsole(op.action(10, 25));*/
		
	}

}
