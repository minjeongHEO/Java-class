package kr.s04.overriding;

class People{
	
}//숨겨져있는 오브젝트 클래스에 투스트링이 있다.

class Animal{
	//메서드 오버라이딩(메서드 재정의)\t
	@Override
	public String toString() {//투스트링은 참조값을 반환하는 기능
		return "Animal";
	}
}

public class OverridingMain03 {
	public static void main(String[] args) {
		People p = new People();
		System.out.println(p.toString());//People클래스가 비어있으므로 자동으로 상속되는 object의 toString()
		
		Animal a = new Animal();
		System.out.println(a.toString());//object의 toString()을 재정의
		System.out.println(a);//생략되도 toString() 자동으로 동작
	}
}
