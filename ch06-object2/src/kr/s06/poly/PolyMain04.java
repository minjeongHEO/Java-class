package kr.s06.poly;

class Car{
	public void drive() {
		System.out.println("����");
	}
	public void stop() {
		System.out.println("����");
	}
	public void getPower() {
		System.out.println("�Ϲ� �ڵ���");
	}
}

class FireEngine extends Car{
	public void getWater() {
		System.out.println("�� �Ѹ���");
	}
	@Override
	public void getPower() {
		System.out.println("�ҹ� ���� ���� �ڵ���");
	}
}
public class PolyMain04 {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		fe.drive();
		fe.stop();
		fe.getWater();
		fe.getPower();
		System.out.println("--------------");
		
		//�θ�Ŭ���� Ÿ������ FireEngine��ü�� ����
		Car ca = new FireEngine();
		ca.drive();
		ca.stop();
		//ȣ�� ������ ��� ȣ�� �Ұ�
//		ca.getWater();
		//�����ǵ� �޼���� �θ�Ŭ����Ÿ�԰�ü�� �ڽ�Ŭ������ ���ǵ� �޼��尡 ȣ��
		ca.getPower();
		
	}
}
