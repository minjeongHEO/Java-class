package kr.s02.packtwo;

import kr.s02.packone.People;

class Student extends People{
	public void print() {
//		System.out.println("a="+ a);//private,���� Ŭ������ �ƴ� 
//		System.out.println("b="+ b);//default,���� ��Ű���� �ƴ�
		System.out.println("c="+ c);//protected,���� ��Ű���� �ƴ����� ��Ӱ���
		System.out.println("d="+ d);//public,���� ������ ����
		
	}
}

public class AccessMain02 {
	

}
