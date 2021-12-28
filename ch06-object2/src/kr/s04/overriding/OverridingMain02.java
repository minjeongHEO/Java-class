package kr.s04.overriding;

//부모클래스
class Mother{
	public String getLunch() {
		return "밥";
	}
}
//자식클래스
class Son extends Mother{
	
}

class Daughter extends Mother{
	@Override//재정의하는 메소드위에 명시해야한다.
	public String getLunch() {
		return "빵으로";
	}
}
public class OverridingMain02 {
	public static void main(String[] args) {
		Son s = new Son();//생성자
		Daughter d = new Daughter();
		System.out.println("아들은 "+s.getLunch()+" 을 먹는다");
		System.out.println("딸은 "+d.getLunch()+" 을 먹는다");
		
	}
}
