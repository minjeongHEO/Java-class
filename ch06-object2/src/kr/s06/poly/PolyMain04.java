package kr.s06.poly;

class Car{
	public void drive() {
		System.out.println("주행");
	}
	public void stop() {
		System.out.println("멈춤");
	}
	public void getPower() {
		System.out.println("일반 자동차");
	}
}

class FireEngine extends Car{
	public void getWater() {
		System.out.println("물 뿌리기");
	}
	@Override
	public void getPower() {
		System.out.println("소방 설비를 갖춘 자동차");
	}
}
public class PolyMain04 {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		fe.drive();
		fe.stop();
		fe.getWater();
		fe.getPower();
		System.out.println("--------------");
		
		//부모클래스 타입으로 FireEngine객체를 생성
		Car ca = new FireEngine();
		ca.drive();
		ca.stop();
		//호출 범위를 벗어나 호출 불가
//		ca.getWater();
		//재정의된 메서드는 부모클래스타입객체라도 자식클래스에 정의된 메서드가 호출
		ca.getPower();
		
	}
}
