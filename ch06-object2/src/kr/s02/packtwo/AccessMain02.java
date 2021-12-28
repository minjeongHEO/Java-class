package kr.s02.packtwo;

import kr.s02.packone.People;

class Student extends People{
	public void print() {
//		System.out.println("a="+ a);//private,같은 클래스가 아님 
//		System.out.println("b="+ b);//default,같은 패키지가 아님
		System.out.println("c="+ c);//protected,같은 패키지가 아니지만 상속관계
		System.out.println("d="+ d);//public,접근 제한이 없음
		
	}
}

public class AccessMain02 {
	

}
