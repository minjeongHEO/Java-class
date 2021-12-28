package kr.s04.thistest;

public class LocalVariable {//{:클래스 영역 시작
//멤버변수는 클래스영역에 만들어진다.
	//멤버 변수 //객체 생성을 해서 메모리에 딸려 올라간다.
	int b = 200;
	
	public void make() {
		//지역변수 : 클래스블럭을 제외하고 메서드,생성자,제어문 블럭 내에서 생성된 변수
		//			 				해당 블럭이 종료되면 변수는 소멸한다.
		int a = 100;
		System.out.println("a :"+ a );
		System.out.println("b :"+ b );
	}
	public void fun() {
		//fun 메서드 안에 a변수가 정의되지 않아서 호출 불가
//		System.out.println("a: "+ a);//a소멸되어 호출 불가능
		System.out.println("b: "+ b);//b는 멤버변수 이기 떄문에 호출가능
	}
	
	public static void main(String[] args) {
		for(int i =1;i<=5;i++) { //이때 int i는 제어문 블럭안에서의 지역변수
			System.out.println(i+"\t");
		}
		System.out.println("\n=================");
		//main블럭 안에 i 변수가 없어서 호출 오류
//		System.out.println(i+"\t");//i는 이미 소멸되서 호출 불가
		
		int a;//제어문 블럭안이아니라 main블럭 안에서 선언
		for (a=1;a<=5;a++) {
			System.out.println(a+"\t");
		}
		System.out.println();//단순 줄바꿈
		System.out.println(a);//반복문이 종료되어도 main블럭 안에서 생성되었기 때문에 호출가능
	}
}
