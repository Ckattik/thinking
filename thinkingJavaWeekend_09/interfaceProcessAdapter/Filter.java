package thinkingJavaWeekend_09.interfaceProcessAdapter;

public class Filter {

	public String name() {
		return getClass().getSimpleName();
	}
	
	public Waveform2 process(Waveform2 input) {
		return input;
	}
	
	public Waveform3 sys(Waveform3 input) {
		return input;
	}
	
	
}
