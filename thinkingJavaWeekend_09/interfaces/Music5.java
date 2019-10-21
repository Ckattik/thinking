package thinkingJavaWeekend_09.interfaces;

public class Music5 {

	public Music5() {
		// TODO Auto-generated constructor stub
	}
	
	// ������ ������ �� ������� �� ������������ ���� �������,
	// ������� ����, ���������� � ������� ����� �������� ��������� 
	

	public static void tune(Playble i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Playble [] e) {
		for(Playble i : e) {
			tune(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //���������� �������������� ��� ���������� � ����� :
		
		Playble [] orchestra = { new Wind(),  new Percussion(),  new Stringed(), new Brass(), new Woodwind() };
		
		tuneAll(orchestra);
	}

}
