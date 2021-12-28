package kr.s06.poly;

class Parent2{
	public void make() {
		System.out.println("부모클래스의 make메서드");
	}
}
class Child2 extends Parent2{
	@Override
	public void make() {
		System.out.println("자식클래스의 make메서드");
	}
}
public class PolyMain03 {
	public static void main(String[] args) {
		Child2 ch = new Child2();
		ch.make();
		
		Parent2 p = ch;//자식클래스 타입 -> 부모클래스타입 형변환
						//업캐스팅, 자동적으로 형변환
		//★중요★ 부모클래스 타입으로 형변환을 해도 자식클래스쪽 메서드가 재정의가 되어있으면 재정의된 메서드 호출 
		p.make(); //형변환을 하더라도 재정의가 우선이라 예상과 달리 자식영역의 make가 출력된다.
					//유일한 방법은 super() 사용하는것
	}
}
