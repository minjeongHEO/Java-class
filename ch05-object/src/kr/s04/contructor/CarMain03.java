package kr.s04.contructor;

public class CarMain03 {
	
	//������ �����ε�
	public CarMain03(int n) { // ��ü�� �����ɋ� �� �ѹ��� �۾��� ����
		//�����ڳ����� �� �ٸ� �����ڸ� ȣ���� ���� �����ڸ��� �� �� ����
		//this��� ǥ���ؾ� �� /this():�����ڳ����� �Ǵٸ������ڸ� ȣ���Ҷ�.
	
		this(String.valueOf(n)); // this: �����ڳ����� �����ڸ��� ����Ѵ�
//		String s = String.valueOf(n); // int -> String
//		System.out.println(s + "�� ���� : "+s.length());
	}
	public CarMain03(float n){
		//�����ڳ����� �� �ٸ� �����ڸ� ȣ���ϱ� ���� ���๮�� ��ġ�ϸ� ���� �߻���
//		System.out.println("float�����ͺ�ȯ"); //�����ں��� ���� ���๮ ������ �����߻�
		this(String.valueOf(n)); // float -> String
		System.out.println("float�����ͺ�ȯ");//�ݵ�� ������ ���� ���� �� ���๮ ����(this������ �ִ´�)
		
//		String s = String.valueOf(n); // float -> String
//		System.out.println(s + "�� ���� : " + s.length());0
	}
	public CarMain03(String s) {
		System.out.println(s + "�� ���� : " + s.length());
	}
	
	public static void main(String[] args) {
		CarMain03 cm1 = new CarMain03(2000);
		CarMain03 cm2 = new CarMain03(3.141592f);//f�� �ڷ����̴ϱ� ���� ���� 8 ���
		CarMain03 cm3 = new CarMain03("World");
	}
}
