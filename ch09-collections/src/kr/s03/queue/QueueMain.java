package kr.s03.queue;

import java.util.LinkedList;

public class QueueMain {
	public static void main(String[] args) {
		//Queue: ���� ���� FIFO(First In First Out)�ڷ� ����
		
		String[] array = {"����","�λ�","�뱸","��õ"};
		
		LinkedList<String> list = new  LinkedList<String>();
		
		//����������
		for(int i=0;i<array.length;i++) {
			list.offer(array[i]);
		}
		System.out.println(list);
		System.out.println("------------------------");
		
		while(list.peek()!=null) { //peek():����� ù��° ��Ҹ� �˻��Ѵ�
			System.out.print(list.poll() + "\t"); //poll():����� ù��° ��Ҹ� ��ȯ�ϰ� �����ϴ� ����
		}
		System.out.println();//�ܼ��ٹٲ�
		System.out.println(list);
	}
	
}
