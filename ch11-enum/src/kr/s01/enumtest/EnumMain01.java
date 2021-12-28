package kr.s01.enumtest;

public class EnumMain01 {
	//enum을 사용하지 않고 static상수를 사용한경우
	public static final String JAVA = "JAVA";//문자열 상수
	public static final String JSP = "JSP";
	public static final String SERVELT = "SERVLET"; //일반적으로 상수는 다 대문자로
	//드래그 후 ctrl shift x 대문자로 / ctrl shift y 소문자로
	
	public static void main(String[] args) {
		System.out.println(JAVA);
		System.out.println(JSP);
		System.out.println(SERVELT);
		
		/*enum으로 묶어서 그룹으로 사용(열거형)은 (이점이 없을 수도 있어서 선택의 문제)
		 * 쓰임이 그닥 많지않음
		*/
	}
	
}
