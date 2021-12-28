package kr.s02.local;
//멤버 메소드
public class LocalMain01 {
	public void innerTest() {
		//로컬내부 클래스
		class Inner{
			public void getData() {
				System.out.println("Local내부클래스");
			}	
		}
		//로컬 내부 클래스 객체 생성
		Inner i = new Inner();
		//메서드 호출
		i.getData();
	}

	public static void main(String[] args) {
		LocalMain01 local = new LocalMain01();
		local.innerTest();


	}
}


