package kr.s07.instanceoftest;

class Car{
	public void drive() {
		System.out.println("주행");
	}
	public void stop() {
		System.out.println("멈춤");
	}
}
//자식클래스
class FireEngine extends Car{
	public void getWater() {
		System.out.println("물 뿌리기");
	}
}

public class InstanceofMain02 {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		//객체				자료형
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		if(fe instanceof Car) {//부모타입으로 형변환
			System.out.println("This is a Car instance");
		}
		if(fe instanceof Object) {//오브젝트타입으로 형변환
			System.out.println("This is a FireEngine instance");
		}
	}
}
