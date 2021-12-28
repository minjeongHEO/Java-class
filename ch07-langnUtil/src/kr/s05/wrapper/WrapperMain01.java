package kr.s05.wrapper;

public class WrapperMain01 {
	public static void main(String[] args) {
		boolean b = true;//기본자료형 데이터
		//객체를 생성해보자 클래스기때문에 대문자로 생성
		//명시적 객체 생성
		Boolean wrap_b = new Boolean(b);//생성자가 디플리케이트가됬는데 
		//암시적 객체 생성
		Boolean wrap_b2 = b;//래퍼클래스는 암시적 객체생성으로 사용해야한다.
							//참조자료형 데이터
		//기본자료형데이터로 사용하거나 참조자료형데이터를 사용할 수있는데 후자는 데이ㅓ를 처리하는 메소드가 필요하기떄문에
		//후자도 필요하다.
		System.out.println(wrap_b2);
		
		//명시적 객체 생성
		Integer wrap_i = new Integer(200);
		//암시적 객체 생성
		Integer wrap_i2 = 200;
		System.out.println(wrap_i2);
	}
}
