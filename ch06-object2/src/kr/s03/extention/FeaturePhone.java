package kr.s03.extention;

public class FeaturePhone extends Phone{
	private int pixel;//���� ȭ�Ҽ�

	public FeaturePhone(String number, String model, String color, int pixel) {
		/*�����ڿ��� ���������ڸ� ������, �������, ����޼��� ������ �װ��������ְ�
�������������� ���������ڸ� ����� ������(�̹� ���� �޼��忡 ������ �Ǿ��ֱ⶧���̴�)*/
		this.number = number;
		this.model = model;
		this.color = color;
		this.pixel = pixel;
	}

	public int getPixel() { //private���� �о���ְԲ� public
		return pixel;
	}

}
