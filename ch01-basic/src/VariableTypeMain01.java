
public class VariableTypeMain01 {
//크기는 암기
	public static void main(String[] args) {
		System.out.println("====논리형====");
//		논리형(true, false) 크기: 1byte
	
		boolean b = true;
		System.out.println("b="+ b);
	
		System.out.println("====문자형====");
//		문자형, 크기: 2byte, (표현범위: 0~65,535)
//		다국어 처리를 위한 유니코드(unicole)방식
		char c1 = 'A';
		System.out.println("c1 : " + c1);
		
		char c2 = 65;//자료형이 문자형(char)이므로 A의 아스키 코드값 65를 대입 시, A 출력 
		System.out.println("c2 : " + c2);
		
		char c3 = '\u0041'; //A의 유니코드값, \ u(=유니코드 표시) + 16진수
		System.out.println("c3 : " + c3);
		
		char c4 = '자';
		System.out.println("c4 : " + c4);
		
		char c5 = '\uc790';//자의 유니코드값 / 한글은 오로지 유니코드값으로만 표현 가능 / 아스키코드x
		System.out.println("c5 : " + c5);
		
		System.out.println("====정수형====");
//		byte, 크기: 1byte, (표현범위: -128 ~ 127)
//		일반적인 연산시 사용적고 입출력,파일제어 시 많이 사용
		byte b1 = 127;
		System.out.println("b1 : " + b1);
		
//		short, 크기: 2byte, (표현범위: -32,768 ~ 32,767)
		short s1 = 32767;
		System.out.println("s1 : " + s1);
		
//		int, 크키: 4byte, (표현범위: -2,147,483,648 ~ 2,147,753,647)
		int n1 = 1000;
		System.out.println("n1 : " + n1);
		
//		long, 크기: 8byte, 은행프로그램 제작 시 (조, 경 단위) 
		long lg = 1000L;//int와 구별하기 위해 자료형L 명시한다.(에러는 나지 않지만 형식적으로 long형을 표기하기 위함)
		System.out.println("lg : " + lg);
		
		System.out.println("====실수형====");
//		byte가 높을수록 정밀도가 높다
//		실수형에서는 double이 기본형이다.
//		float, 크기: 4byte
		float f1 = 4.5f;
		//float f1 = 4.5; double로 인식하여 에러
		System.out.println("f1 : " + f1);
		
//		double, 크기: 8byte
		double d1 = 9.8;
		System.out.println("d1 : " + d1);
		
		System.out.println("====문자열 표시====");
//		문자열 표시(기본자료형이 아니라 참조자료형!)
//		기본자료형은 소문자로 시작
//		참조자료형은 대문자로 시작
		String str = "Hello world!";
		System.out.println("str : " + str);
		
	}
}
