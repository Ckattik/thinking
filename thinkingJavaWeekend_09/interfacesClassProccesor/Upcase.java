package thinkingJavaWeekend_09.interfacesClassProccesor;

public class Upcase extends Processor{

	public Upcase() {
		// TODO Auto-generated constructor stub
	}
	
	public String process(Object input) {     //������������ ������������ ��� 
		return ((String)input).toUpperCase();
	}

	
	
	
}
