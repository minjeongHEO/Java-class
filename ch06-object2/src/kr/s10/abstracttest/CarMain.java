package kr.s10.abstracttest;

public class CarMain {
	public static void main(String[] args) {
		//추상클래스는 객체 생성 불가능
//		Car car = new Car();
		Bus b = new Bus();
		b.drive();
		b.getPassinger();
		System.out.println(b.getEnergy());
		System.out.println("-----------------");
		Truck t = new Truck();
		t.drive();
		t.getProduct();
		System.out.println(t.getEnergy());
		System.out.println("-----------------");
		FireEngine f = new FireEngine();
		f.drive();
		f.getWater();
		System.out.println(f.getEnergy());
		
	}
}
