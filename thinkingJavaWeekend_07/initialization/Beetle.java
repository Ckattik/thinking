package thinkingJavaWeekend_07.initialization;


import myClass.Ckatt;


public class Beetle extends Insect{

	private int k = printInit("���� Beetle.k ����������������");
	
	public Beetle() {
		// TODO Auto-generated constructor stub
	
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	
	}
	
	private static int x2 = printInit("���� static Beetle.x2 ����������������");
	
	public static void main(String [] args) {
		
		Ckatt.outConsole("����������� Beetle");
		Beetle b = new Beetle();
		System.out.println();
		Beetle b1 = new Beetle();
		System.out.println("^^^^^^^^^^^^^^");
		Term t = new Term();
		
		
	}

}
