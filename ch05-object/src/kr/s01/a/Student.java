package kr.s01.a;
public class Student {
	
	//필드 (멤버변수)
	String name;
	int age;
	
	public static void main(String[] args) {
		//객체 선언
		Student s;
		//객체 생성 new클래스명();
		s = new Student();// student객체가 메모리의 힙이라는 곳에 만들어지고 s가 객체를 가리킨다
		//객체의 필드의 기본값이 출력
		System.out.println(s.name + ","+s.age);
		System.out.println("----------------");
		
		//객체의 필드에 데이터 저장 //필드는 변수와 상수로 구성
		s.name="홍길동";
		s.age=20;
		
		//객체의 필드에 저장된 데이터 읽기
		System.out.println(s.name+","+s.age);
		
		
	}
}
