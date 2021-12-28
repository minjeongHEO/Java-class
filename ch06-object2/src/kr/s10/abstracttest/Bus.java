package kr.s10.abstracttest;

public class Bus extends Car {
	@Override
	public int getEnergy() {
		return 10;//자식쪽에서 구현
		
	}
	public void getPassinger() {
		System.out.println("승차합니다.");
	}
}
