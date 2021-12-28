package kr.s03.statictest;

public class InnerMain {
	
	//����Ŭ����
	public static class StaticInner{
		//����Ŭ�����ȿ� static ����(�Ǵ� �޼���)�� ���ǵǾ� �ִ°�� ����Ŭ������ �ݵ�� static����Ŭ������ �����ؾ��Ѵ�.
//		����Ŭ������ ����ƽ�� ��õǾ������� �ٷ� ����ƽ���θ� �����Ѵ� �̳ʸ��ΰ�ü�� ���������ʰ�
		int iv = 200;
		static int cv = 300;
		public void fun() {
			System.out.println("fun �޼���");
		}
		public static void make() {
			System.out.println("make ����ƽ �޼���");
		}
	}
	
	public static void main(String[] args) {
		//static�� ��ü�����ϴ°� �ƴϱ� ������ ���԰��踸 ����ϸ� ȣ���� ����
		System.out.println(InnerMain.StaticInner.cv);
		InnerMain.StaticInner.make();
		
//		����Ŭ������ ����ƽ�� ��õǾ������� �ٷ� ����ƽ���θ� �����Ѵ� �̳ʸ��ΰ�ü�� ���������ʰ�
		//����ƽ ����Ŭ������ ����ƽ����Ŭ������ �ܵ����� ��ü �����ؼ� �����

		InnerMain.StaticInner is = new InnerMain.StaticInner();
		System.out.println(is.iv);
		is.fun();
		
		
	}
}
