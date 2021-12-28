package kr.s01.extention;

//부모클래스 =super클래스
//class Parents extends Object{ //기본적으로 생략, 자동적으로 object가 상속됨(강제성띈다, 안받을수없음)
class Parents{
	int a = 100;
	int b = 200;
}
//자식클래스
class Child extends Parents{
	
}
public class ExtentionMain01 {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
	}
}
