package kr.s02.method;

public class MethodMain02 {
	//인자 전달 방식: 참조 호출(Call by reference)
	//메서드 호출 시 인자에 참조자료형(객체) 데이터를 전달->주소(reference)를 복사하여 전달
	
	public void increase (int[] n) { //int[]은 배열(객체)/ n은 인자이면서 배열명
		for(int i=0;i<n.length;i++) {
			n[i]++;//배열의 요소를 1 증가시킴
		}
	}
	
	public static void main(String[] args) {
		//배열의 선언 및 생성, 초기화
		int[] ref1 = {100,200,300};
		System.out.println("===메서드 호출 전");
		for(int i=0;i<ref1.length;i++) {
			System.out.println("ref1["+i+"]:"+ref1[i]);
		}
		System.out.println("===메서드 호출 후");
		MethodMain02 me = new MethodMain02();
		me.increase(ref1);
		
		for(int i=0;i<ref1.length;i++) {
			System.out.println("ref1["+i+"]:"+ref1[i]);
		}
	}
}
