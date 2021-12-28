package kr.s02.local;

public class LocalMain02 {
	//멤버변수
	int a = 100;
	//멤버메서드
	public void innerTest() {
		//로컬내부클래스
		class Inner{
			public void getData() {
				System.out.println("변경 전: " + a);
				System.out.println("-----------------");
				a = 200;
				System.out.println("변경 후: " + a);
			}
		}
		//로컬내부클래스 객체 생성
		Inner i = new Inner();
		//메서드호출
		i.getData();// 내부클래스는 드러나있지않아서 아래에 코드내리면 에러난다
	}
	
	public static void main(String[] args) {
		LocalMain02 local = new LocalMain02();
		local.innerTest();
		
	}
	
}
