package thinkingJavaWeekend_08.polimorphizmRodent;

public class TestDriveRodent {

	private static RandomRodentGenerator gen = new RandomRodentGenerator();

	public TestDriveRodent() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rodent s[] = new Rodent[5];
		// ��������� ����� ��������
		for (int i = 0; i < s.length; i++) {
			s[i] = gen.next();
		}
		// ����������� ������ �������:
		for (Rodent rd : s) {

			rd.run();
			rd.jump();
		}

	}

}
