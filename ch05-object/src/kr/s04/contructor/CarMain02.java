package kr.s04.contructor;

class Car2{
	String color;//����
	String gearType;//���ӱ� ����
	int door;//���� ����
	
	//������ �����ε�
	public Car2() {}//�� �⺻������. �������������� Car2 c2 = new Car2();(����Ʈ������) ����� �Ұ�
	
	public Car2(String c, String g) {
		//������ ���ȿ��� ���๮�� ���� ���ִ�
		color = c;
		gearType = g;
		door = 4;
	}
	public Car2(String c, String g, int d) {
		//���๮
		color = c;
		gearType = g;
		door = d;
	}
}
public class CarMain02 {
	public static void main(String[] args) {
		Car2 c2 = new Car2(); //�⺻ ������(���ڰ����� ������)�� public Car2() {}�ʱ�ȭ?�ϴ°���?
							// �����ڸ� ����ϴ� ����????��
		System.out.println(c2.color+","+c2.gearType+","+c2.door);
		
		Car2 c22 = new Car2("blue","auto");
		System.out.println(c22.color+","+c22.gearType+","+c22.door);
		System.out.println("-----------");
		
		Car2 c3 = new Car2("black","auto",2);
		System.out.println(c3.color+","+c3.gearType+","+c3.door);
		
	}
}
