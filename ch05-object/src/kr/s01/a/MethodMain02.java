package kr.s01.a;
import java.util.Scanner;

public class MethodMain02 {
	// ������ �����͸� ��ȯ�ϴ� ����޼���
	public int signOf(int a) { //��
		int sign = 0;
		
		if(a>0) {
			sign = 1;
		}else if(a<0) {
			sign = -1;
		}
		return sign;
	}
	/*public int B(0) {
	return 0;}
	public float A(float -a) {
	return -1;}*/
	
	public static void main(String[] args) {
		/*
		 * �Է��� int�� ������ �����̸� -1��
		 * 0�̸� 0��
		 * ����̸� 1�� ��ȯ�ϴ�
		 * signOf �޼��带 �ۼ��Ͻÿ�.
		 * ���� �Է�>5
		 * ������� ?
		 */
//		java.util.Scanner input = new java.util.Scanner(System.in);
		Scanner input = new Scanner(System.in);//import����Ͽ� ���ϼ� �ִ�
		
		System.out.print("���� �Է�> ");
		int b = input.nextInt();
		
		//��ü ���� �� ���� �����ڸ� �����ؼ� ��ü�� ȣ���� �� �ֵ��� ����
		MethodMain02 method = new MethodMain02();
	
		int result = method.signOf(b);
		
		System.out.println("������� "+ result);
		
		
		
		
	}
}
