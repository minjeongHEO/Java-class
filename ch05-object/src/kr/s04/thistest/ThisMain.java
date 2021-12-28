package kr.s04.thistest;

public class ThisMain {
	
	public ThisMain() {//생성자
		System.out.println("객체 생성: "+this);//this: 참조값을 가지고 있기에 객체내부에서 사용할 수있는 참조변수의 역할
//													객체같은 경우에도 이름말고 자기자신을 지칭한다.
//													객체내부에서 객체를 가리킬 때(지칭)
//													ex)내가 나를 지칭할때 이름써서 3인칭화법 쓰지 않듯이, myself라고 생각
	}
	
	public static void main(String[] args) {
		ThisMain tt = new ThisMain(); // tt:참조변수(객체의 주소가 들어가있다)
		System.out.println("객체 생성 후 : "+ tt); //주소가 저장되는건 맞지만 출력되는건 참조값이다.@숫자 = 유니크한숫자 = (16진수)해시값
//													같은 객체인지 다른객체인지만 비교,참조만 하는 용도
	}
}
