package kr.s07.finaltest;

//2. Ŭ������ final�� ����ϸ� ����� �Ұ�����
//final class Me2{
//	int num=200;
//}

class Me2{
	int num = 200;
}
public class FinalMain03 extends Me2 {
	public static void main(String[] args) {
		FinalMain03 fm = new FinalMain03();
		System.out.println(fm.num);
	}
}
