package kr.s05.supertest;

//�θ�Ŭ����
class Mother{
	public String getLunch() {
		return "��";
	}
}
//�ڽ�Ŭ����
class Daughter extends Mother{
	//�޼��� �������̵�(�޼��� ������)
	@Override
	public String getLunch() {
		return "��";
	}
	
	public String getRice() {
		//�θ�Ŭ���� ������ getLunch �޼��带 ȣ��
		return super.getLunch();
	}
}
public class SuperMain01 {
	public static void main(String[] args) {
		Daughter d = new Daughter();
		System.out.println("���� "+d.getLunch()+"�� �Խ��ϴ�.");
		System.out.println("���� �����Ͽ� "+d.getRice()+"�� �Խ��ϴ�.");
		
	}
	
}
