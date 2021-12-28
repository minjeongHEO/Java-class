package kr.s07.finaltest;

public class FinalMain01 {
	//필드
	//상수
	final int NUM = 10;
	//static 상수
	public static final int NUMBER = 20;//static: 공유의 개념 (호출만하며사용)
	
	public static void main(String[] args) {
//		int no = 30; //변수
		final int NO = 30; //(지역적인)상수, 이름은 대문자로,길면 첫글자만 값은 못바꾼다
		System.out.println(NO);
		
		//상수는 변경 불가능
		//NO = 100;
	
		//클래스 영역에 명시한 상수는 객체를 생성 후에 사용이 가능
//		System.out.println(NUM);
		FinalMain01 fm = new FinalMain01(); //객체 생성
		System.out.println(fm.NUM); //상수 호출
		
		//static 상수 호출
		System.out.println(FinalMain01.NUMBER);
		System.out.println(NUMBER);//같은 클래스 아래에 있어서 생략가능
	}
}
