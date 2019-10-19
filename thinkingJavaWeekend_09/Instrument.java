package thinkingJavaWeekend_09;

public abstract class Instrument {

	private int i;  // Память выделяется для каждого обьекта
	public abstract void play(Note n);
	
	public Instrument() {
		// TODO Auto-generated constructor stub
	}

}
