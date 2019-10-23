import myClass.Ckatt;

public class Test {
	
	public static void main(String [] args) {
		
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		char[] mass = str.toCharArray(); 
		
		
		
		for(int i = 0; i < mass.length; i ++) {
			if(mass[i] == 0) {
				int temp = mass[i];
				mass[i] = mass[i + 1];
			//	mass[i + 1] = temp;
			}
			
			Ckatt.outConsole(mass[i]);
		}
		
		
		
		
		for(String s: args) {
			System.out.println(s);
		}
	}
	
	
	


}
