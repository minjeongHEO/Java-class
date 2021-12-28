package kr.s03.output;

import java.io.IOException;

public class StandardInput01 {
	public static void main(String[] args) {
		//자바의 기본 입력
		try {
			System.out.print("영문자 1개 입력> ");
			int a = System.in.read(); //System.in을 이용하 인풋스트림을 반환하는데 인풋스트림이 가지고있는 리드메소드를 이요해서 작업을한다 근데 트리이캐치하라고 하니 한다.
									//int 한문자씩 읽어들여서 아스키코드로 반환시킨다-> 영문만처리할수있다는것
									//문자 하나를 입력받아서 아스키코드로 반환
//									불편해서 안씀
			System.out.println(a+","+(char)a);
			
			System.in.read();//enter 처리 \r =13
			System.in.read();//enter 처리 \r =10
			//입력만받고 출력을안해벼러서 없애버린다
			System.out.println("---------------------");
			
			System.out.print("숫자 1개 입력>");
			int b= System.in.read() -48;
			System.out.println(b); // \r\n=엔터
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
