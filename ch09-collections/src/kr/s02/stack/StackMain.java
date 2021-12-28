package kr.s02.stack;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		//Stack: ���Լ��� Last In First Out
//		���׸����� �Ⱦ��� ������Ʈ Ÿ������ �ٲ��� ���ð��� ��쿡�� ������ ������ Ÿ���� �������ش�
		
		String[] array = {"���޷�","����","������","����","���"};
		
		Stack<String> stk = new Stack<String>();
		
		//������ ����
		for(int i=0; i<array.length;i++) {
			stk.push(array[i]); //push�� ������ �־��ش�
			
		}
		System.out.println(stk);
		System.out.println("---------------------");
		
		while(!stk.isEmpty()) {//Stack�� ����ִ��� ����
			System.out.print(stk.pop() + "\t");//Stack�� ����� �����͸� ���� => ���þ��� �������
		}
		System.out.println();//�ܼ� �ٹٲ�
		System.out.println("��="+stk);
//		for(int i<=array.length-1;i==0;i--) {
//			stk.push(array[i]); //push�� ������ �־��ش�		
	}
}