package kr.s02.packtwo;

import kr.s02.packone.People; //���� ��Ű���� �ƴϹǷ� import���ش�

public class AccessMain {
	public static void main(String[] args) {
		People p = new People();
//		���� ��Ű���� �ƴϹǷ� import���ش�
		
//		System.out.println(p.a); //private, ���� Ŭ������ �ƴ�
//		System.out.println(p.b); //default, ���� ��Ű���� �ƴ�
//		System.out.println(p.c); //protected, �ٸ� ��Ű�������� ��Ӱ��赵 �ƴ�
		
		System.out.println(p.d); //public, ���� ������ ����
		
		
	}
}
