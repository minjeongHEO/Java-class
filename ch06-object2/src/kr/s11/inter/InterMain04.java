package kr.s11.inter;

interface I{
	//�߻�޼���
	public abstract void play();
	
}
//�������̽� I�� Ŭ������ ����
class B implements I{
	//�߻�޼��� ����
	@Override
	public void play() {
		System.out.println("�ǾƳ븦 �����մϴ�.");
	}
	public void study() {
		System.out.println("�ܱ�� �����մϴ�.");
	}
}

public class InterMain04 {
	public static void main(String[] args) {
		B bp = new B();
		bp.play();
		bp.study();
		
		I i = bp;//Ŭ����Ÿ�� => �������̽�Ÿ������ ����ȯ ������ �پ���
				//�ڵ��� ����ȯ(��ĳ������ �ƴ�)
		i.play();
		//ȣ�� ������ ����� ȣ�� �Ұ�
		//i.study();
		
		B bp2 = (B)i;//�������̽�Ÿ�� => Ŭ����Ÿ�� ����ȯ
					//����� ����ȯ
	}
}
