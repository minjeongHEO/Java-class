package kr.s01.exception;

import java.util.Scanner;

//사용자 정의 예외클래스
class NegativeNumberUseException extends Exception{//예시로 클래스명 작성
	//^ (네거티브넘버~)이게 중요한거기때문에 익셉션에 대해 추가적ㅇ로 지정해 줄 필요없다
	//예외문구를 지정할 수 있도록 인자를 ㄹ명시하고 전달받은 데이터를 Exception에전달
	public NegativeNumberUseException(String str) {
		super(str);
	}
}

public class ExceptionMain07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("0이상만 입력: ");
		try {
			int a = input.nextInt();
			if(a >= 0) {
				System.out.println("입력한 숫자: "+ a);
			}else {
				//사용자가 정의한 예외를 인위적으로 발생
				throw new NegativeNumberUseException("음수를 사용할 수 없습니다.");
			}
		}catch(NegativeNumberUseException e){ //음수 예외
			System.out.println(e.getMessage());
		}catch(Exception e) { //그 외의 예외
			System.out.println("예외가 발생했습니다.");
		}finally {
			if(input!=null)input.close(); //null이 아니면 클로즈하겠다
		}
		
		
		
		
		

	}
}
