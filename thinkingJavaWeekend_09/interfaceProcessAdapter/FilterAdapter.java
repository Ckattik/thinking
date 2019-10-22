package thinkingJavaWeekend_09.interfaceProcessAdapter;

public class FilterAdapter implements Processor{
	Filter filter;
	
	public FilterAdapter(Filter filter) {
		// TODO Auto-generated constructor stub
	
	 this.filter = filter;
	}
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return filter.name();
	}
	
	@Override
	public Object process(Object input) {
		// TODO Auto-generated method stub
		return filter.process((Waveform2)input);
	}
	
	@Override
	public Object sys(Object input) {
		// TODO Auto-generated method stub
		return filter.sys((Waveform3)input);
	}
	

}
