package thinkinginJavaWeekend_05;

public class StaticInitialization {

	public static void main(String [] args) {
		
		System.out.println("�������� ������ ������� Cupboard � main() ");
		new Cupboard();
		System.out.println("�������� ������ ������� Cupboard � main() ");
		new Cupboard();
		
		table.f2(1);
	   System.out.println("/////////////");
		
		cupboard.f3(1);
		
		
	}
	 static Table table = new Table();
	 static Cupboard cupboard = new Cupboard();
	
}
