package patterns.patternAdapter;

public class TurkeyAdapter implements Duck {    //������ ����� ���������� ����������� ��������� ���� ����, �� ������� �������� ��� ������

	Turkey turkey;
	
	
	public TurkeyAdapter(Turkey turkey) {   // ����� ������� �������� ������ �� ������������ ������; ������ ��� ��������� � �����������
		this.turkey = turkey;
		
	}
	
	
	
	@Override
	public void fly() {                    // ���� ����� fly() ������ � ��� �����������, ������� �� ����� ������ �� ������� ���������� 
		// TODO Auto-generated method stub // ��� �� ���������� ����������� ����� ����� �������� �� �������� ����� fly() � ������ 
		for(int i = 0; i < 5; i ++) {      // Turkey ���� ���
			turkey.fly();
		}
		
		
		
		
	}
	
	@Override
		public void quack() {                    // ������� ������ ����������� ��� ������ ���������� �������������� quack() 
		// TODO Auto-generated method stub	     // ����� �������� ������������ ������ - ���������� �������� gobble()
 			
		turkey.gobble();	
		}
	
}
