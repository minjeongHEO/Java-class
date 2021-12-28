package kr.s04.overriding;

//부모 클래스
class GrandParent{
	public String getCar() {
		return "구형 자동차";
	}
}
//자식 클래스
class Father extends GrandParent{
	//메서드 오버라이딩(메서드 재정의)
	@Override 
	//@Override 어노테이션은 메서드 재정의 문법에 맞게 재정의가 됐는지 검증해준다
	//문법에 맞게 재정의 되지 않으면 컴파일 오류가 발생하므로 권장사항!
	public String getCar() {
		return "신형 자동차";
	}
}

//자식 클래스
class Uncle extends GrandParent{
	
}

public class OverridingMain01 {
	public static void main(String[] args) {
		Father ft = new Father();
		System.out.println(ft.getCar());
		
		Uncle oc = new Uncle();
				System.out.println(oc.getCar());
	}
}
