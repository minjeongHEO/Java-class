package kr.s01.enumtest;

//열거형 상수
enum Lesson{
	JAVA,JSP,SERVLET //값대입이 없고 문자열로 데이터 인식 (숫자가 아니라 문자형 상수를 만들어준다)
					//각각 메소드들도 가지고 있다.
}
//디폴트는 문자형 상수이고 숫자형 상수를 만들고 싶다면 그방법은 따로 있음enummain04참고

public class EnumMain02 {
	public static void main(String[] args) {
		//열거형 상수 호출하기	
		System.out.println("-----열거형 상수 호출-----");
		System.out.println(Lesson.JAVA);
		System.out.println(Lesson.JSP);
		System.out.println(Lesson.SERVLET);
		System.out.println("-----열거 객체의 문자열 반환-----");
		//열거 객체의 문자열 반환 .name()
		System.out.println(Lesson.JAVA.name());
		System.out.println(Lesson.JSP.name());
		System.out.println(Lesson.SERVLET.name());
		System.out.println("-----열거 객체의 순번 반환-----");
		//열거 객체의 순번(0부터 시작) 반환 .ordinal()
		System.out.println(Lesson.JAVA.ordinal());
		System.out.println(Lesson.JSP.ordinal());
		System.out.println(Lesson.SERVLET.ordinal());
	}

}
