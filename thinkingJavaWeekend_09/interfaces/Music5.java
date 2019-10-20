package thinkingJavaWeekend_09.interfaces;

public class Music5 {

	public Music5() {
		// TODO Auto-generated constructor stub
	}
	
	// ������ ������ �� ������� �� ������������ ���� �������,
	// ������� ����, ���������� � ������� ����� �������� ��������� 
	

	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument [] e) {
		for(Instrument i : e) {
			tune(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //���������� �������������� ��� ���������� � ����� :
		
		Instrument [] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind() };
		
		tuneAll(orchestra);
	}

}
