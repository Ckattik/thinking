package thinkingJavaWeekend_09.interfaceFilter.interfaceProcess;

import java.util.Arrays;

public class Splitter extends StringProcessor {

	public Splitter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String process(Object input) {
		// TODO Auto-generated method stub
		// �������� split() ������������� ��� ���������� ������

		return Arrays.toString(((String) input).split(" "));

	}

}
