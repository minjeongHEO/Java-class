package kr.s04.contructor;

class Car{
	String color;//����
	String gearType;//���ӱ� ����
	int door;//���� ����
	
	//������, �⺻ �����ڴ� ���� ����
	//���ѹ��� ȣ�� 
	//������� �ʱ�ȭ
	public Car() {}
}


public class CarMain01 {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println("c1.color :"+ c1.color);
		System.out.println("c1.gearType :"+ c1.gearType);
		System.out.println("c1.door :"+ c1.door);
		System.out.println("------------------");
		
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		System.out.println(c1.color+", "+c1.gearType+", "+c1.door);
		
		//���Ӱ� ��ü�� ������
		Car c2 = new Car();
		c2.color ="red";
		c2.gearType="manual";
		c2.door=5;
		
	System.out.println(c2.color+", "+c2.gearType+", "+c2.door);
	
	}
}
