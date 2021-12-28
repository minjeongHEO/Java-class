package kr.s10.abstracttest;

public class FireEngine extends Car {
	@Override
	public int getEnergy() {
		return 15;
	}
	
	public void getWater() {
		System.out.println("ºÒÀ» ²ü´Ï´Ù.");
	}
}
