package thinkinginJavaWeekend_05;

import java.util.Iterator;

public class ArraysOfPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = {1, 2, 3, 4, 5 };
        int[] a2 ;
       
        a2 = a1;
        
        for (int i = 0; i < a2.length; i++) {
			
        	System.out.println(a2[i]);
        	a2[i] = a2[i] + 1;
			
		}
        
        
        for (int i = 0; i < a1.length; i++) {
           System.out.println(a1[i]);
			
		}
	}

}
