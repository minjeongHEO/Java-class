package kr.s02.stack;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		//Stack: 후입선출 Last In First Out
//		제네릭형을 안쓰면 오브젝트 타입으로 바껴서 스택같은 경우에도 저장할 데이터 타입을 명시해준다
		
		String[] array = {"진달래","백합","개나리","벚꽃","장미"};
		
		Stack<String> stk = new Stack<String>();
		
		//데이터 저장
		for(int i=0; i<array.length;i++) {
			stk.push(array[i]); //push로 데이터 넣어준다
			
		}
		System.out.println(stk);
		System.out.println("---------------------");
		
		while(!stk.isEmpty()) {//Stack이 비어있는지 검증
			System.out.print(stk.pop() + "\t");//Stack에 저장된 데이터를 꺼냄 => 스택안은 비어진다
		}
		System.out.println();//단순 줄바꿈
		System.out.println("끝="+stk);
//		for(int i<=array.length-1;i==0;i--) {
//			stk.push(array[i]); //push로 데이터 넣어준다		
	}
}
