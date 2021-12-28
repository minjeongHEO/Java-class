package ch06;

class A{
	int price;
	int bonusPoint;
	
	public A(int price) { //생성자 public과 생성자명 사이에 (int/void)리턴타입없음
						  //생성자명은 클래스명과 일치시켜야한다.
		this.price = price; //this.멤버변수 = 지역변수;
		
	}
	
	public void make() {
		
	}
	public String getName() {//메서드
		return "상품";
	}
}
public class Supertest {

}
