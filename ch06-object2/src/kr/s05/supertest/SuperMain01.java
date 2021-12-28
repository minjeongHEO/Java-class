package kr.s05.supertest;

//부모클래스
class Mother{
	public String getLunch() {
		return "밥";
	}
}
//자식클래스
class Daughter extends Mother{
	//메서드 오버라이딩(메서드 재정이)
	@Override
	public String getLunch() {
		return "빵";
	}
	
	public String getRice() {
		//부모클래스 영역의 getLunch 메서드를 호출
		return super.getLunch();
	}
}
public class SuperMain01 {
	public static void main(String[] args) {
		Daughter d = new Daughter();
		System.out.println("딸은 "+d.getLunch()+"을 먹습니다.");
		System.out.println("딸은 월요일엔 "+d.getRice()+"을 먹습니다.");
		
	}
	
}
