package kr.s02.mathtest;

import java.util.Scanner;
import java.util.Random;

public class RandomMain02 {
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

		Scanner input = new Scanner(System.in);
		Scanner inputGame = new Scanner(System.in);

		int s = input.nextInt();

		String[] game = {"����", "����", "��"};
		Random r2 = new Random();
		int index = r2.nextInt(3);

		if(s==1) {
			System.out.print("���������� �Է�(0:����, 1:����, 2:��) > ");
			int ig = inputGame.nextInt();
			
			if(0>ig || ig>2) {
				System.out.println("�ٽ� �Է��ϼ���.");	
			}else {
				System.out.println("�����: "+ game[index]+ ", ����: "+ game[ig]);
				System.out.print("��� : ");
				switch(ig) {

				case 0:
					if(index==0) {
						System.out.println("���º�");
					}else if(index==ig) {
						System.out.println("����Ͽ����ϴ�.");
					}else{
						System.out.println("�й��Ͽ����ϴ�.");
					}break;
				case 1:
					if(index==0) {
						System.out.println("����Ͽ����ϴ�.");
					}else if(index==ig) {
						System.out.println("�й�");
					}else{
						System.out.println("���º�");
					}break;
				case 2:
					if(index==0) {
						System.out.println("�й��Ͽ����ϴ�.");
					}else if(index==ig) {
						System.out.println("���º�");
					}else{
						System.out.println("����Ͽ����ϴ�.");
					}break;
				}
			}

		}else {
			System.out.println("������ �����մϴ�.");
		}


		input.close();
		inputGame.close();
	}
}
