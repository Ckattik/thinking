package thinkingJavaWeekend_07;

public class Line extends Shape{

	private int start;
	private int end;
	
	
	public Line(int start, int end) {
		// TODO Auto-generated constructor stub
	super(start);
	
	this.start = start;
	this.end = end;
	
	System.out.println("������ ����� Line: " + start + ", " + end);
	
	}
	
	public void dispose() {
		System.out.println("������� ����� Line"+ start + ", " + end);
		super.dispose();
	}

	
	
	
}
