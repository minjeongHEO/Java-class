package kr.s07.instanceoftest;

class Car{
	public void drive() {
		System.out.println("����");
	}
	public void stop() {
		System.out.println("����");
	}
}
//�ڽ�Ŭ����
class FireEngine extends Car{
	public void getWater() {
		System.out.println("�� �Ѹ���");
	}
}

public class InstanceofMain02 {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		//��ü				�ڷ���
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		if(fe instanceof Car) {//�θ�Ÿ������ ����ȯ
			System.out.println("This is a Car instance");
		}
		if(fe instanceof Object) {//������ƮŸ������ ����ȯ
			System.out.println("This is a FireEngine instance");
		}
	}
}
