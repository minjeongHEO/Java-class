package kr.s01.extention;

//부모 클래스
class People{
	public void eat() {
		System.out.println("식사하다.");
	}
}
//자식 클래스
class Student extends People{
	public void study() {
		System.out.println("공부하다.");
	}
}
public class ExtentionMain02 {
	public static void main(String[] args) {
		Student s = new Student();
		s.eat();//People의 메서드를 상속 받아서 호출
		s.study();//Student의 메서드
		System.out.println(s.toString());//Object의 메서드를 상속 받아서 호출 //지난 참조값은 this 에서 참조변수 원래tt.toString 인데 tt만 써도 자동적으로 참조값나온다 ( kr.04.thistest )
		System.out.println(s);//toString안써도 자동적으로 참조값나온다.
		
		
	}
}
