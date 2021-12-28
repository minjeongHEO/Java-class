package kr.s06.poly;

class Parent{
	int a = 100;
}
class Child extends Parent{
	int b = 200;
}
public class PolyMain01 {
	public static void main(String[] args) {
		Child ch = new Child(); //차일드 객채만들어지고 ch에 주소가 보관 그걸 차일드 타입
		//차일드 타입 ch=차일드 객채만
		//자료형은 멤버호출범위를 지정
		//child객체를 생성했을 때는 전체를 호출가능
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		Parent p = ch;//ch객체의 주소를 Parent타입인p에 넘겨준다
					//자식클래스타입 -> 부모클래스타입으로 형변환
					//= 업캐스팅, 자동적으로 형변환
		System.out.println(p.a);
//		System.out.println(p.b);//parent타입은 부모클래스 영역만 호출가능/ 
								//메모리에는 있으나호출할수있는 영역밖에있어서 호출불가 에러남
		
		Child ch2 = (Child)p; //범위를 줄였는데 child로 범위를 강제로 늘리는 경우기에 강제 형변환
						//부모클래스타입->자식클래스타입 형변환
						//= 다운캐스팅, 명시적 형변환
		System.out.println(ch2.a);
		System.out.println(ch2.b);
		
		//(참조자료형에서의형변환)이모든게 상속관계에 있어야 할 수 있다. 
	}
}
