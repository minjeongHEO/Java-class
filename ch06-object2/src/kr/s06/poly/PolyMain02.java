package kr.s06.poly;

class A{
	public void make() {
		System.out.println("make �޼���");
	}
}

class B extends A{
	public void play() {
		System.out.println("play �޼���");
	}
}
public class PolyMain02 {
	public static void main(String[] args) {
		B bp = new B(); //B��ü�� ����,BŸ���� �Ἥ �������� ȣ�Ⱑ��
		bp.make();
		bp.play();
		
		A ap = bp; //make�� ȣ�� ����
					//�ڽ�Ŭ����Ÿ�� -> �θ�Ŭ����Ÿ�� ����ȯ
					//��ĳ����, �ڵ������� ����ȯ
		ap.make();
//		ap.play();//ȣ������� ��� ȣ�� �Ұ�
		
		B bp2 = (B)ap;//�θ�Ŭ����Ÿ�� -> �ڽ�Ŭ����Ÿ�� ����ȯ
					//�ٿ�ĳ����, ����� ����ȯ
		bp2.make(); 
		bp2.play();
		
	}
}
