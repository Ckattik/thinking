package thinkingJavaWeekend_08.inheritanceAndCompletion;

import myClass.Ckatt;

//����� ��������
public class LivingCreature {

	private Characteristic p = new Characteristic("����� ��������");
	private Description d = new Description("������� ����� ��������");
	
	public LivingCreature() {
		// TODO Auto-generated constructor stub
	
	   Ckatt.outConsole("LivingCreature()");
	
	}
	
	protected void dispose() {
		Ckatt.outConsole("dispose() � LivingCreature");
		p.dispose();
		d.dispose();
	}

}
