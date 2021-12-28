package kr.s04.contructor;

class Car2{
	String color;//색상
	String gearType;//변속기 종류
	int door;//문의 갯수
	
	//생성자 오버로딩
	public Car2() {}//★ 기본생성자. 생략가능하지만 Car2 c2 = new Car2();(디폴트생성자) 사용이 불가
	
	public Car2(String c, String g) {
		//생성자 블럭안에는 수행문을 넣을 수있다
		color = c;
		gearType = g;
		door = 4;
	}
	public Car2(String c, String g, int d) {
		//수행문
		color = c;
		gearType = g;
		door = d;
	}
}
public class CarMain02 {
	public static void main(String[] args) {
		Car2 c2 = new Car2(); //기본 생성자(인자가없는 생성자)는 public Car2() {}초기화?하는건지?
							// 생성자를 명시하는 순간????★
		System.out.println(c2.color+","+c2.gearType+","+c2.door);
		
		Car2 c22 = new Car2("blue","auto");
		System.out.println(c22.color+","+c22.gearType+","+c22.door);
		System.out.println("-----------");
		
		Car2 c3 = new Car2("black","auto",2);
		System.out.println(c3.color+","+c3.gearType+","+c3.door);
		
	}
}
