package thinkinginJavaWeekend_05;

public class House {

	Window w1 = new Window(1); // ����� �������������

	public House() {
		// TODO Auto-generated constructor stub
		System.out.println("House () ");

		Window w3 = new Window(33); // ��������� ������������� w3

	}

	Window w2 = new Window(2); // ����� ������������

	public void f() {
		System.out.println("f()");
	}

	Window w3 = new Window(3);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         House h = new House();
         h.f();
	}

}
