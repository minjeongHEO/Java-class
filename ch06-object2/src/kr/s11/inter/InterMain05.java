package kr.s11.inter;

interface Inter{ //�������̽��� Ŭ�����ƴϰ�!! ��ü�����ȵŰ�!! Ŭ������ �����ִ� ����
	//�߻�޼���
	public abstract void play(); //���ĸ��ְ� ���븸�ִ� ����
}

class A implements Inter{
	@Override
	public void play() {
		System.out.println("�ǾƳ븦 �����մϴ�.");
	}
}

class C implements Inter{ //������ �ڷ������� ���� ���ؼ� �������̽��� ���ؼ� A��C�� ������ �θ𰡵Ǿ� ǥ��ȭ?�� �����ذ�
	@Override
	public void play() {
		System.out.println("ÿ�θ� �����մϴ�.");
	}
}
class Admin{
	public void autoPlay(Inter i) { //objectŸ�������ϸ� play()�� ȣ���� ���ϴϱ�interŸ�������Ѵ�
		//i�� ���� ��ü�� �����ؼ� �޼��带 ȣ���� (����ȯ���� ����Ÿ������ ��ü�� �����ؼ�)
		i.play();//
		
	}
}
public class InterMain05 {
	public static void main(String[] args) {
		 Admin ad = new Admin();
		 ad.autoPlay(new A());//i�� A��ü�� �ּҸ� ����
		 ad.autoPlay(new C());//i�� C��ü�� �ּҸ� ����
	}
}
