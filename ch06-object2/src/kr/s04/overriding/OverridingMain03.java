package kr.s04.overriding;

class People{
	
}//�������ִ� ������Ʈ Ŭ������ ����Ʈ���� �ִ�.

class Animal{
	//�޼��� �������̵�(�޼��� ������)\t
	@Override
	public String toString() {//����Ʈ���� �������� ��ȯ�ϴ� ���
		return "Animal";
	}
}

public class OverridingMain03 {
	public static void main(String[] args) {
		People p = new People();
		System.out.println(p.toString());//PeopleŬ������ ��������Ƿ� �ڵ����� ��ӵǴ� object�� toString()
		
		Animal a = new Animal();
		System.out.println(a.toString());//object�� toString()�� ������
		System.out.println(a);//�����ǵ� toString() �ڵ����� ����
	}
}
