package kr.s01.exception;

public class ExceptionMain04 {
	public static void main(String[] args) {
		//try~catch~finally
		System.out.println("---���ܰ� �߻����� �ʴ� ���");
		try {
			System.out.println("1");
			System.out.println("2");
		}catch(Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");//���� �߻� ���� ���������� ����������� finally�鸰��
		}
		System.out.println("--------------------");
		System.out.println("---���ܰ� �߻��ϴ� ���----");
		try {
			System.out.println("1");
			System.out.println(10/0);//ArithmaticException �߻�
			System.out.println("2");//���ܹ߻��� ����ȵǴ� ����
		}catch(Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		
	}
}
