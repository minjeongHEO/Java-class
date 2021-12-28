package kr.s05.statictest;

class StaticMethod{
	String s1 = "스태틱";
	static String s2 = "static";
	
	public static String getString() {
//		return s1; //s2는 호출만으로도 데이터 올라가지만 s1은 객체생성해야한다
		return s2; //StaticMethod 안에 s2 있기때문에 클래스명 생략 가능
	}
}

public class StaticMain03 {
	public static void main(String[] args) {
		//인스턴스 변수는 객체를 생성해야 사용할 수 있으나
		//static변수와 static메서드는 호출하며 바로 사용 가능
		System.out.println(StaticMethod.getString());//클래스 다르기때문에 생략하면안됌
		
		
	}
}
