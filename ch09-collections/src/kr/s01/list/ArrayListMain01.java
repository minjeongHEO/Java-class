package kr.s01.list;

import java.util.ArrayList;
//import java.util.*;

class A{
	//Object�� toString������
	@Override
	public String toString() {
		return "A"; //�ʱ�ȭ�����Ѱ�
	}
}
class B{
	
}//�߰�ȣ�� ������ Ŭ������ ���ǵ� ��
public class ArrayListMain01 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();//ArrayList�� �⺻�ڷ��������͸� �����Ҽ����� 
		//(ex-int�������Ѵ��Ծƴ϶� Integer�� ����)�����ڷ��������͸�(��ü�� �ּҷ�)�����Ҽ��ֵ�.
		//�ٵ� int�� �־ �ڵ����� Integer�� �ٲ��ش�.
		
		//����������
		al.add(new A());//A��ü�� �ּҰ� ���޵ȴ�
		al.add(new B());//A��ü�� �ּҰ� ���޵ȴ�
//		al.add(new Integer());//��Ģ�� �̷����� ���Ը��ϴ¹������ ����
		al.add(10);//���ڸ� �����Ѵ� �������
//		al.add(new String("�ϴ�"));//���ڿ�������쵵 ��������� �������ʿ����
		al.add("�ϴ�");//�Ͻ������� �����Ѵ�
//		�������� Ÿ���� ���޹������� �ϳ���Ÿ���� �Ǿ���ϰ�
//		int integer stirng�� ����и� objcect�ϱ�
//		�װ���A,B,Integer,Object ���� Object�� ��ĳ���� ����ȯ�ؼ� �����
//		���÷� �� ������ Ȱ��ÿ� �Ϲ������δ� Ÿ���� �ٸ��Ÿ� ���������ʴ´�. �ٽ� ������ �ٿ�ĳ�����ؾ��ϰ� ���������ϱ�
		
		System.out.println(al);//al.toString
		
	}
}
