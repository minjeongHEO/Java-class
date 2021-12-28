package kr.s10.abstracttest;

//부모클래스이면서 추상클래스
public abstract class Car {
	public void drive() {
		System.out.println("달리다");
	}
	public void stop() {
		System.out.println("멈추다");
	}
	//추상메서드
	public abstract int getEnergy(); //자식클래스에서 추상메서드 강요하기우ㅏㅣ해서
									//반환을 안해서 자식클래스에서 반환해줘야한다
									//{ 말고 ;으로 끝맺음
}
