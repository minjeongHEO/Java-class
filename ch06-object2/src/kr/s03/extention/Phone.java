package kr.s03.extention;

public class Phone {
	protected String number;//일반적으로 멤버변수에 public쓰지 않는다.
	protected String model;
	protected String color;//(상속을 대비해서)패키지가 달라져도 protected면 상속이 가능하다
	
	public String getNumber() {
		return number;
		//set메소드는 생성자를 통해서 처리되게끔 만들지않아본다?
	}
	
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
}
