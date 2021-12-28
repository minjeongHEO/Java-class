package kr.s01.a;
class Car{ //부 클래스 에서는 public 쓸 수 없다,//같은파일에만 명시되어있고 bin경로에 보면 따로 클래스가 만들어져있다
	//멤버변수
	String company = "현대자동차";
	String model = "아이오닉5";
	String color = "은색";
	int maxSpeed = 350;
	int speed;
//	int korean, english, math; //객체에서 명시할때는 한번에 나열하는 방법은 써도 되지만 실제로 쓰는 빈도가 낮다
}
public class CarMain { //주 클래스
	public static void main(String[] args) {
		//객체 선언 및 생성
		Car myCar = new Car();
		
		//객체의 멤버 변수에 저장된 데이터 읽기
		System.out.println("제작 회사: "+ myCar.company);
		System.out.println("모델명 : "+ myCar.model);
		System.out.println("색깔 : "+ myCar.color);
		System.out.println("최고 속도 : "+ myCar.maxSpeed);
		
		System.out.println("현재 속도 : "+ myCar.speed);// 객체가 생성만되고 초기화가 안된 speed는 0으로 기본값으로 초기화되어있다.
													 // 자료 29페이지 기본자료형 참조
		
		//멤버변수의 값 변경
		myCar.speed =  60;
		System.out.println("수정된 속도 : "+myCar.speed);
		
	}
}
