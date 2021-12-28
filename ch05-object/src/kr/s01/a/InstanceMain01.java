package kr.s01.a;
public class InstanceMain01 {
	//클래스의 기본 구조
	//필드
	int var1; //멤버변수
	String var2;//멤버변수

	//생성자
	public InstanceMain01 () {} //생성자는 필수 아니고 생략가능
	
	//멤버메서드
	public int sum(int a, int b) {
		return a+b;
	}
	
	//객체를 생성하면 멤버~라고 쓰여있는게 들어간다.(생성자는 들어가지않는다. 객체를 생성할수있도록 유도하는역할)
	public static void main(String[] args) {
		//객체 선언
		InstanceMain01 me; //me=참조변수 주소값, 주소가 들어간다
		//객체 생성
		me =  new InstanceMain01();//클래스 명과 동일하게 만든 생성자를 호출
		
		//객체의 멤버변수에 데이터 저장(초기화)
		me.var1 = 10;
		me.var2 = "가을";
		//객체의 멤버변수에 저장된 데이터 읽기
		System.out.println(me.var1+","+me.var2);
		
		//객체의 멤버메서드에 데이터 전달하고 결과값을 변수에 저장
		int result = me.sum(10, 20);
		System.out.println("result = "+ result);
	}
}
