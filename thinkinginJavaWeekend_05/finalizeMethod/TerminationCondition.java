package thinkinginJavaWeekend_05.finalizeMethod;

public class TerminationCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book novel = new Book(true);
		//���������� �������
		novel.checkIn();
		//������ ������ ������ ��� ��������
		new Book(true);
		
		
		
		//�������������� ������ ������ � ����������
		System.gc();
		

	}

}
