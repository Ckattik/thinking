package thinkinginJavaWeekend_03;

import java.util.Random;

public class MathOps {

	
	// ������������ �������������� �������� 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random(100);
		
		int i, j ,k;
		
		// ����� �������� �� 1 �� 100
		
		j = rand.nextInt(100) + 1;
        System.out.println("j : " + j);
        
        k = rand.nextInt(100) + 1;
        System.out.println("k : " + k);
        
        
        i = j + k;
        System.out.println("i : " + i);
        
        i = j - k;
        System.out.println("i : " + i);
        
        i = j/k;
        System.out.println("i : " + i);
        
        i = j * k;
        System.out.println("i : " + i);
        
        j = j % k;
        System.out.println("i : " + i);
        
        
        
	}

}
