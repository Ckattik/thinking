package thinkingJavaWeekend_09.interfaces;

public class Music5 {

	public Music5() {
		// TODO Auto-generated constructor stub
	}
	
	// –абота метода не зависит от фактического типа обьекта,
	// поэтому типы, добавленые в систему будут работать правильно 
	

	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument [] e) {
		for(Instrument i : e) {
			tune(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //¬осход€щее преобразование при добавлении в масив :
		
		Instrument [] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind() };
		
		tuneAll(orchestra);
	}

}
