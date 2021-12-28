package kr.s07.instanceoftest;

class Parent{
	@Override
	public String toString() {
		return "Parent 클래스";
	}
}
class Child extends Parent{
	@Override
	public String toString() {
		return "Child 클래스";
	}
}
public class InstanceofMain01 {
	public static void main(String[] args) {
		Parent p = new Parent();
		//컴파일 시 오류는 없지만 실행 시 오류 발생
		//child가 메모리에 올라가있지않아서 사용못함
//		Child ch = (Child)p;
		
		// 객체 			자료형
		if(p instanceof Child) {
			Child ch2 = (Child)p;
			System.out.println(ch2);
		}else {
			System.out.println(p);
		}
	}
}
