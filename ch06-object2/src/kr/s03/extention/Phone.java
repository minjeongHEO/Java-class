package kr.s03.extention;

public class Phone {
	protected String number;//�Ϲ������� ��������� public���� �ʴ´�.
	protected String model;
	protected String color;//(����� ����ؼ�)��Ű���� �޶����� protected�� ����� �����ϴ�
	
	public String getNumber() {
		return number;
		//set�޼ҵ�� �����ڸ� ���ؼ� ó���ǰԲ� �������ʾƺ���?
	}
	
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
}
