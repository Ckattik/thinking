package thinkinginJavaWeekend_05;

public class TestCon {

	int petalCount = 0;
	String s = "initial value";

	public TestCon(int petals) {
		// TODO Auto-generated constructor stub
		petalCount = petals;
		System.out.println("����������� � ���������� int , petalCount : " + petalCount);
	}

	public TestCon(String ss) {
		// TODO Auto-generated constructor stub
		System.out.println("����������� � ���������� String, s : " + ss);
		s = ss;
	}

	public TestCon(String s, int petals) {
		// TODO Auto-generated constructor stub
		this(petals);
		// this(s); //����� ������� ������������ ��������\
		this.s = s; // ������ ������������� this
		System.out.println("A�������� String � int");

	}

	public TestCon() {
		// TODO Auto-generated constructor stub

		this("hi", 47);
		System.out.println("����������� �� ��������� ��� ����������");

	}

	public void printPetalCount() {
		// !this(11); //������������ ������ � �������������
		System.out.println("petalCount = " + petalCount + " s = " + s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCon testCon = new TestCon();
		testCon.printPetalCount();
	}

}
