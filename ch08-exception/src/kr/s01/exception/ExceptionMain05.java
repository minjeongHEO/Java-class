package kr.s01.exception;
//throws예약어 예제
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;//BufferedReader를쓰려면 필요함 IO=INPUTOUTPUT

public class ExceptionMain05 {
	//멤버메서드
	//throws예약어의 사용
	//메서드에 throws예외클래스를 명시하면 메서드내에 try~catch블럭을 생략하고
	//예외가 발생하면 예외를 보관하고 메서드를 호출하는 곳에서 try~catch블럭을 만들고 그곳으로 예외를 양도
	//엄밀하게 말하면 처리하는게아니고 전달역할
	public void printData()throws NumberFormatException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("단 입력:");
		int dan = Integer.parseInt(br.readLine());//readLine():엔터치면 한라인의 데이터를 스트링으로 반환해줌
		//그래서 Integer.parseInt:스트링을 인트로 변경
		System.out.println(dan+"단");
		System.out.println("-------------");
		for(int i=1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
	
	public static void main(String[] args) {
		ExceptionMain05	ex = new ExceptionMain05();
		try {
			ex.printData();
		}catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
		}
	}
}
