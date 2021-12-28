package kr.s02.packtwo;

import kr.s02.packone.People; //같은 패키지가 아니므로 import해준다

public class AccessMain {
	public static void main(String[] args) {
		People p = new People();
//		같은 패키지가 아니므로 import해준다
		
//		System.out.println(p.a); //private, 같은 클래스가 아님
//		System.out.println(p.b); //default, 같은 패키지가 아님
//		System.out.println(p.c); //protected, 다른 패키지이지만 상속관계도 아님
		
		System.out.println(p.d); //public, 접근 제한이 없음
		
		
	}
}
