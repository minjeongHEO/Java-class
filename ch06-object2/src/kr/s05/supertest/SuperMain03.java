package kr.s05.supertest;
//부모클래스
class People2{
	int a;
	//부모클래스에 기본 생성자(인자가 없는 생성자)는 없고
	//인자가 있는 생성자만 정의가 된 상태이기 때문에
	//자식클래스를 객체 생성할 때는 명식적로 부모클래스의 인자가 있는 생성자를 호출해야 객체 생성이 가능하다.
	public People2(int a) {
		//멤버변수 = 지역변수
		this.a = a;
	}
}
//자식클래스
class Student2 extends People2{
	public Student2() {
		//부모클래스의 인자의 타입이 int인 생성자를 호출
		//인자가 있는 생성자가 있으면 super(인자)를명시적으로 호출해줘야한다.
//		super(); //부모클래스의 기본 생성자/ 부모클래스에 인자가 없는 생성자가 없어서 에러가 난다.
		super(100);
	}
}
public class SuperMain03 {
	public static void main(String[] args) {
		
	}
}
