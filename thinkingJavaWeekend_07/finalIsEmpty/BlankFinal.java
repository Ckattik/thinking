package thinkingJavaWeekend_07.finalIsEmpty;

public class BlankFinal {

	private final int i = 0;
	private final int j;
	private final Poppet p;
	
	
	public BlankFinal() {
		// TODO Auto-generated constructor stub
	j = 1;
	p = new Poppet(1);
	
	
	}

	public BlankFinal(int x) {
		j = x;
		p = new Poppet(x);
	}
	
	public static void main(String [] args) {
		new BlankFinal();
		new BlankFinal(47);
		
	}
	
}
