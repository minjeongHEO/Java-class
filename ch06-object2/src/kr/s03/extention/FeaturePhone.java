package kr.s03.extention;

public class FeaturePhone extends Phone{
	private int pixel;//사진 화소수

	public FeaturePhone(String number, String model, String color, int pixel) {
		/*생성자에는 접근지정자를 생성자, 멤버변수, 멤버메서드 에서는 네가지쓸수있고
지역변수에서는 접근지정자를 사용할 수없다(이미 위에 메서드에 지정이 되어있기때문이다)*/
		this.number = number;
		this.model = model;
		this.color = color;
		this.pixel = pixel;
	}

	public int getPixel() { //private값을 읽어갈수있게끔 public
		return pixel;
	}

}
