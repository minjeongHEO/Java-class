package kr.s01.p1;

//ȣ���ϰ��� �ϴ� Ŭ������ ��Ű�� ���
import kr.s01.p2.PackTwo;

public class PackMain {
	public static void main(String[] args) {
		
//	kr.s01.p1.PackOne p1 = new kr.s01.p1.PackOne(); ���� ��Ű���� �Ϲ������� �̷��� ��������ʴ´�
		//���� ��Ű���� �ִ� Ŭ�������� ȣ���ϱ� ������ ��Ű�� ���� ����!
		PackOne p1 = new PackOne();
		p1.study();
	
		kr.s01.p2.PackTwo p2 = new kr.s01.p2.PackTwo();//�ʹ��� import���
		p2.play();
		
		//ȣ���ϰ��� �ϴ� Ŭ������ ��Ű���� ����߱� ������ Ŭ������ ���
		PackTwo p3 = new PackTwo();
		p3.play();
	
	}
}
