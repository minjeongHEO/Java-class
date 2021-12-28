package kr.s02.overloading;

public class OverloadingMain02 {
	//���޵Ǵ� ������ Ÿ���� ��� String���� ��ȯ�ؼ� ���ڿ��� ������ ���ϴ� �޼��常���
	public void getLength(int n) {
		String s= String.valueOf(n); //�� valueOf�� ���� int -> String��ȯ
//		System.out.println(s+"�� ����: "+s.length());
		getLength(s);//����Ȱ�뼺�� �ø���.
	}
	void getLength(float n){//���������ڴ� �޶� �������
		String s = String.valueOf(n);//valueOf�� ���� float -> String��ȯ
//		System.out.println(s+"�� ����: "+s.length());		
		getLength(s);
	}
	
	private void getLength(String s) {
		System.out.println(s+"�� ����: "+s.length());
	}
	
	public static void main(String[] args) {
		OverloadingMain02 om = new OverloadingMain02();
		om.getLength(1000);
		om.getLength(3.14f);
		om.getLength("Hello");
		
	}
}
