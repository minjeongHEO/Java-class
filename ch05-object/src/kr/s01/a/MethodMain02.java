package kr.s01.a;
import java.util.Scanner;

public class MethodMain02 {
	// 정수형 데이터를 반환하는 멤버메서드
	public int signOf(int a) { //★
		int sign = 0;
		
		if(a>0) {
			sign = 1;
		}else if(a<0) {
			sign = -1;
		}
		return sign;
	}
	/*public int B(0) {
	return 0;}
	public float A(float -a) {
	return -1;}*/
	
	public static void main(String[] args) {
		/*
		 * 입력한 int형 정수가 음수이면 -1을
		 * 0이면 0을
		 * 양수이면 1을 반환하는
		 * signOf 메서드를 작성하시오.
		 * 정수 입력>5
		 * 결과값은 ?
		 */
//		java.util.Scanner input = new java.util.Scanner(System.in);
		Scanner input = new Scanner(System.in);//import사용하여 줄일수 있다
		
		System.out.print("정수 입력> ");
		int b = input.nextInt();
		
		//객체 선언 및 생성 생성자를 생성해서 객체를 호출할 수 있도록 유도
		MethodMain02 method = new MethodMain02();
	
		int result = method.signOf(b);
		
		System.out.println("결과값은 "+ result);
		
		
		
		
	}
}
