package kr.s02.mathtest;

import java.util.Random;

public class RandomMain {
	public static void main(String[] args) {
		String[] gift = {"����Ʈ��", "TV", "�����", "��!"};
		
		//���� ���ϱ�
		double ran = Math.random(); //�ž��� �⺻�Լ��� ��ü�������ص���
		System.out.println("�߻��� ����: "+ ran);//0.0~0.9999999
		System.out.println("�߻��� ����: "+ ran*4);//0.0~3.9999999
//		int�� ����ȯ 0~3
		int index = (int)(ran*4);
		System.out.println("���������� ����: "+ index);
		System.out.println("������ ����: "+ gift[index]);
		
		System.out.println("----------------");
		
		String[] luck = {"������ ����","�ζǴ�÷","�ǰ���~","������ ��������"};
						//0			1			2			3
		
//		java.util.Random r1 = new java.util.Random(); //import java.util.Random;��� ���� �ÿ���
		Random r1 = new Random(); //�����Լ��� ��ü������ ������Ѵ�.
		index = r1.nextInt(4);//0���� ���ڿ� ���޵� ���� �������� ������ �����߻�
								//0~3
		System.out.println("�߻��� ����: "+index);
		System.out.println("������ �: "+luck[index]);
	}
}
