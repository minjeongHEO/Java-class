package kr.s04.overriding;

//�θ�Ŭ����
class Mother{
	public String getLunch() {
		return "��";
	}
}
//�ڽ�Ŭ����
class Son extends Mother{
	
}

class Daughter extends Mother{
	@Override//�������ϴ� �޼ҵ����� ����ؾ��Ѵ�.
	public String getLunch() {
		return "������";
	}
}
public class OverridingMain02 {
	public static void main(String[] args) {
		Son s = new Son();//������
		Daughter d = new Daughter();
		System.out.println("�Ƶ��� "+s.getLunch()+" �� �Դ´�");
		System.out.println("���� "+d.getLunch()+" �� �Դ´�");
		
	}
}
