package kr.s04.anony;
//부모클래스(일반클래스)
class Inner7{
	int y = 200;
	public void disp() {
		System.out.println("부모클래스의 disp메서드");
	}
}

public class AnonyMain02 {
	
	public void fun() {
		//로컬내부클래스
		//익명내부클래스의 객체 생성
//		class 지움 extends Inner7{ //이름이 없다보니 에러나고 객체생성을 위해 이름을 빌려다쓴다 ->(inner7)부모의 이름 
		Inner7 i = new Inner7() //{뒤를 한라인으로 인식한다 (익명내부클래스의 클래스블럭) //이름이 갇혀있어서 이름만드는게 무의미(지역적인 이름)
		{
			//Inner7의 disp를 재정의
			@Override
			public void disp() {
				System.out.println("자식클래스의 disp메서드");
			}
			
			//익명내부클래스에 정의한 메서드는 호출이 불가하다 재정의한 메서드만 호출이 가능하다 왜냐 형변환이 되었기떄문에
			//만들필요가 없다 무의미하다
			public void make() {
				System.out.println("make 메서드");
			}
		}; //여기서 ; 으로 마무리
		
		//메서드호출
		i.disp();
//		i.make();//Inner7타입으로 부모영역으로 호출범위가 줄어들어서 호출할 수 없다
	}
	
		//객체 생성
//		InnerTest i = new InnerTest();
//		i.disp();
//		i.make();
//	}
	
	public static void main(String[] args) {
		AnonyMain02 an = new AnonyMain02();
		an.fun();
	}
	
}
/*
 * 내부클래싀 이름이 별로 중요하지아 ㄶ아서 생략하는데 
 * 타입
 * 생성자뒤에 {};있으면 내부클래스이다
 * 안드로이드에서 많이쓰이고 web에선느 잘안쓰인다(스프링에서 일부분)
 */
