package thinkingJavaWeekend_09.interfacesClassProccesor;

import java.util.Arrays;

public class Splitter extends Processor {

	public Splitter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object process(Object input) {
		// TODO Auto-generated method stub
		// �������� split() ������������� ��� ���������� ������

		return Arrays.toString(((String) input).split(" "));

	}

}
