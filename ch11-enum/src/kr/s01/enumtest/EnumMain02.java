package kr.s01.enumtest;

//������ ���
enum Lesson{
	JAVA,JSP,SERVLET //�������� ���� ���ڿ��� ������ �ν� (���ڰ� �ƴ϶� ������ ����� ������ش�)
					//���� �޼ҵ�鵵 ������ �ִ�.
}
//����Ʈ�� ������ ����̰� ������ ����� ����� �ʹٸ� �׹���� ���� ����enummain04����

public class EnumMain02 {
	public static void main(String[] args) {
		//������ ��� ȣ���ϱ�	
		System.out.println("-----������ ��� ȣ��-----");
		System.out.println(Lesson.JAVA);
		System.out.println(Lesson.JSP);
		System.out.println(Lesson.SERVLET);
		System.out.println("-----���� ��ü�� ���ڿ� ��ȯ-----");
		//���� ��ü�� ���ڿ� ��ȯ .name()
		System.out.println(Lesson.JAVA.name());
		System.out.println(Lesson.JSP.name());
		System.out.println(Lesson.SERVLET.name());
		System.out.println("-----���� ��ü�� ���� ��ȯ-----");
		//���� ��ü�� ����(0���� ����) ��ȯ .ordinal()
		System.out.println(Lesson.JAVA.ordinal());
		System.out.println(Lesson.JSP.ordinal());
		System.out.println(Lesson.SERVLET.ordinal());
	}

}
