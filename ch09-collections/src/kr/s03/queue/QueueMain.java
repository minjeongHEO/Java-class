package kr.s03.queue;

import java.util.LinkedList;

public class QueueMain {
	public static void main(String[] args) {
		//Queue: 선입 선출 FIFO(First In First Out)자료 구조
		
		String[] array = {"서울","부산","대구","인천"};
		
		LinkedList<String> list = new  LinkedList<String>();
		
		//데이터저장
		for(int i=0;i<array.length;i++) {
			list.offer(array[i]);
		}
		System.out.println(list);
		System.out.println("------------------------");
		
		while(list.peek()!=null) { //peek():저장된 첫번째 요소를 검색한다
			System.out.print(list.poll() + "\t"); //poll():저장된 첫번째 요소를 반환하고 제거하는 역할
		}
		System.out.println();//단순줄바꿈
		System.out.println(list);
	}
	
}
