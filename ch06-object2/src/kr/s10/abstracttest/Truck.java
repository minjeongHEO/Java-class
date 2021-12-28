package kr.s10.abstracttest;

public class Truck extends Car{
	@Override//
	public int getEnergy() {//
		return 20;// 메소드 쟂정의안하면 트럭에 에러문구뜸
	}
	
	public void getProduct() {
		System.out.println("상품을 적재합니다.");
	}
}
