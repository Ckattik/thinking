package thinkingJavaWeekend_07.finalJava;

import java.util.Random;

public class FinalData {
	
	private static Random rand = new Random(47);
	private String id;
	
	

	public FinalData(String id) {
		// TODO Auto-generated constructor stub
	this.id = id;

	}

	//����� ���� ����������� ������� ���������� 
	
	private final int valueOne = 9;
	private static final int valueTwo = 99;
	
	//�������� �������� ��������� 
	public static final int VALUE_TREE = 39;
	
	//�� ����� ���� ���������� ������� ����������
	
	private final int i4 = rand.nextInt(20);
	static final int INT_5 = rand.nextInt(20);
	private Value v1 = new Value(11);
	private final Value v2 = new Value(22);
	private static final Value VAL_3 = new Value(33);
	
	//�������
	
	private final int [] a = {1, 2, 3, 4, 5, 6};
    	
	public String toString() {
		return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
	}
	
	public static void main(String [] args) {
		FinalData fd1 = new FinalData("fd1");
		//!fd1.valueOne++;  ������ : �������� ������ ��������
		fd1.v2.i++;       // ������ �� ��������� �� ��������
		fd1.v1 = new Value(9); //OK - �� ��������� �� ��������
		
		for (int i = 0; i < fd1.a.length; i++) {
			fd1.a[i]++;  // ������ �� ��������� �� ��������
		}
		
		//fd1.v2 = new Value(0); // ������ ������ �������� 
		//fd1.VAL_3 = new Value(9); 
	    //fd1.a = new int[13];
		
	    System.out.println(fd1);
	    System.out.println("������� finalData");
	    FinalData fd2 = new FinalData("fd2");
	    System.out.println(fd1);
	    System.out.println(fd2);
	    FinalData fd3 = new FinalData("fd3");
	    System.out.println(fd1);
	    System.out.println(fd2);
	    System.out.println(fd3);
	
	}
	
	
	
	
}
