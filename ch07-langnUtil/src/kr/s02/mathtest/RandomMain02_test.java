package kr.s02.mathtest;

import java.util.Scanner;
import java.util.Random;

public class RandomMain02_test {
	public static void main(String[] args) {
		/*
		 * pinos71@daum.net
		 * ��������������
		 * ��ǻ�� ���� �߻� -> 0 ����, 1 ����, 2 ��
		 * �޴�>1 �����ϱ�, 2 ����
		 * (��¿���)
		 * ���������� �Է�(0:����, 1:����, 2:��)
		 * 1���) ���º�(��ǻ��:����, ���:����)
		 * 2���) ��ǻ�� ��(��ǻ��:����, ���:��)
		 * 3���) ��� ��(��ǻ��:����, ���:����)
		 * if���� �̿��� ����üũ
		 * �����߻����Ѽ� ����
		 * Math.random() �Ǵ� Random() nextInt() ����ϱ�
		 */

		System.out.println("�޴�> 1:�����ϱ� | 2:�����ϱ�");
		System.out.print("�����ϼ��� > ");

		Scanner inputGame = new Scanner(System.in);


		String[] game = {"����", "����", "��"};
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("-------------------");
			System.out.println("1.�����ϱ�|2.�����ϱ�");
			System.out.println("-------------------");
			System.out.print("�޴�>");
			int user = input.nextInt();
		
//		Random r2 = new Random();
//		int index = r2.nextInt(3);
		int computer = (int)(Math.random()*3);
		
		/*
		 * ��ǻ�� - ����� ��� ����
		 * 0		0	0	���º�
		 * 0		1	-1	����� ��
		 * 0		2	-2	��ǻ�� ��
		 * 1		0	1	��ǻ�� ��
		 * 1		1	0	���º�
		 * 1		2	-1	����� ��
		 * 2		0	2	����� ��
		 * 2		1	1	��ǻ�� ��
		 * 2		2	0	���º�
		 */
		int result = computer - user;
		if(result == 0) {
			System.out.println(
					"���º� -> ��ǻ��"+item[computer]+", ���:"+item[user]);
		}else if(result == -1 || result == 2) {
			System.out.println(
					"��� �� -> ��ǻ��"+item[computer]+", ���:"+item[user]);
		}else{//result == -2 || result ==1
			System.out.println(
					"��ǻ�� �� -> ��ǻ��"+item[computer]+", ���:"+item[user]);
		}
		

		

	


		input.close();
		inputGame.close();
	}
}
}
