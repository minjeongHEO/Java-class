package kr.s04.overriding;

//�θ� Ŭ����
class GrandParent{
	public String getCar() {
		return "���� �ڵ���";
	}
}
//�ڽ� Ŭ����
class Father extends GrandParent{
	//�޼��� �������̵�(�޼��� ������)
	@Override 
	//@Override ������̼��� �޼��� ������ ������ �°� �����ǰ� �ƴ��� �������ش�
	//������ �°� ������ ���� ������ ������ ������ �߻��ϹǷ� �������!
	public String getCar() {
		return "���� �ڵ���";
	}
}

//�ڽ� Ŭ����
class Uncle extends GrandParent{
	
}

public class OverridingMain01 {
	public static void main(String[] args) {
		Father ft = new Father();
		System.out.println(ft.getCar());
		
		Uncle oc = new Uncle();
				System.out.println(oc.getCar());
	}
}
