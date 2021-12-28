package kr.s01.extention;

//부모 클래스
class A{
	int x =100;//생략되어있는 default는 같은 패키지에잉르떄가그 호출가능하고 다른패지에 있으면 호출불가
	private int y = 200; //은닉화
	
	public int getY(){//대신해 줄수 있는 요소가 있다면 접근제한이있더라도 상속도 되어지고 호출도 된다.
		return y;
	}
}
//자식 클래스
class B extends A{
	int z = 300;
}

public class ExtentionMain03 {
	public static void main(String[] args) {
		B bp = new B();
		System.out.println(bp.x);
		//private멤버변수는 상속관계를 맺어도 같은 클래스가 아니기 떄문에 호출이 불가
//		System.out.println(bp.y);//상속관계보다 private가 우선이므로 상속이안됌
		System.out.println(bp.getY());
		System.out.println(bp.z);
		
	}
}
