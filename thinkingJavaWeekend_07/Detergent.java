package thinkingJavaWeekend_07;

public class Detergent extends Cleanser{

	
	
	//�������� ����� scrub
	public void scrub() {
		append("  Detergent.scrub() ");
	    super.scrub();
	}
	// ��������� ����� ����� � ����������
	public void foam() {
		append(" foam()");
	}
	
	public static void main(String [] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.applay();
		x.scrub();
		x.foam();
	
		System.out.println(x);
		System.out.println("��������� ������� �����");
		Cleanser.main(args);
		
	}
	
}
