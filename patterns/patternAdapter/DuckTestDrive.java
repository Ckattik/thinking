package patterns.patternAdapter;

public class DuckTestDrive {

	public static void main(String [] args) {
		
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);       // Turkey �������������� � TurkeyAdapter � �������� ��������� ��� Duck 
		
		System.out.println("The Turkey says ...");           // ��������� ������ Turkey
		turkey.gobble();
		turkey.fly();

		System.out.println();
		
		System.out.println("\n The Duck says ...");           //������ �������� ����� testDuck(),������ �������� ������ Duck
		testDuck(duck);
		
		System.out.println("\n The TurkeyAdapter says ...");
		testDuck(turkeyAdapter);
		
		
	}
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
		
	}
	
	
}
