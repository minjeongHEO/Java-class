package kr.s10.abstracttest;

public class Truck extends Car{
	@Override//
	public int getEnergy() {//
		return 20;// �޼ҵ� �F���Ǿ��ϸ� Ʈ���� ����������
	}
	
	public void getProduct() {
		System.out.println("��ǰ�� �����մϴ�.");
	}
}
