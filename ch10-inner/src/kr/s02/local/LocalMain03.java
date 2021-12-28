package kr.s02.local;

public class LocalMain03 {
	//멤버변수
	int a=100;
	//멤버 메서드
	public void innerTest() {
		//jdk7.0이하에서는 지역변수를 내부클래스에서 사용할 수 없기 떄문에 
		//final을 명시해서 상수화 해야 하지만 jdk8.0부터 자동으로 처리함.
		//fianl int b = 200;
		
		//지역변수
		int b = 200;
		//로컬내부클래스
		class Inner{
			//멤버메서드
			public void getData() {
				System.out.println("a: "+a);//LocalMain03 의 몜버변수
				//지역변수b가 로컬내부클래스내에서 자동으로 상수화됨
				System.out.println("b: "+b);//InnerTest의 지역변수
				System.out.println("----------------------------");
				
				//메서드 내에 지역변수가 로컬내부클래스에서 호출될 떄
				//상수화가 되기 떄문에 데이터 변경 불가능
//				b = 400;//지역변수가 로컬내부클래스에서 호출할때 자동으로final이 붙는다 상수화가 되어변경이 불가
			}
		}
		//객체생성
		Inner i = new Inner();
		i.getData();
	}
	public static void main(String[] args) {
		//실행하려면 객체를 생성해야한다
		LocalMain03 local = new LocalMain03();
		local.innerTest();
		
	}
}
