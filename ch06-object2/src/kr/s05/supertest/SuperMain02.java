package kr.s05.supertest;

//부모 클래스
class People{
	int a = 100;
	
	public People() {
		super();//people의 부모클래스object 의 기본생성자르 암묵적으로 명시안해도 자동으로 들어감
	}
}
//자식 클래스
class Students extends People{
	int b = 200;

	public Students() {
		super();//부모클래스의 기본생성자 암묵적으로 명시안해도 자동으로 들어감
	}
}


public class SuperMain02 {
	public static void main(String[] args) {
		Students s = new Students(); //객체 생성
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println(s.toString());//toString메소드는 object영역ㅇ에있음
	}
}
