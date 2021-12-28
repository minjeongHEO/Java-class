package kr.s04.thistest;

class ThisTest{
	//은닉화
	private int a;
	
	//캡슐화
	public void setA(int a) { //int a는 지역변수로 블럭이 끝나면 소멸된다.
//							멤버변수명 지역변수명이 같으면 아래와같은 상활이 생기므로 this 사용한다.
//		a = a;//같은 블럭안에있는 같은명칭이므로 셋다 지역변수로 인식이된다
//		a = n;//그렇다고 int a를 n으로 바꾸고 a=n;하면 해결될 수있는데 안하는 이유는 java에서 캡슐화할때 인수는 멤벼변수의 변수명과 동일하게 쓰는 경우가 표준이기 때문에(명칭을 통해서 은닉화를 예상할 수있게끔 동일명칭을 준다.)
		//멤버변수명과 지역변수명으로 동일하게 명시했기 때문에
		//멤버변수와 지역변수를 구분하기 위해 this를 사용함
		this.a = a; //this.a는 멤버변수 
		
	}
	public int getA() {
		return a;
	}
}
public class ThisMain02 {
	
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		tt.setA(200);
		System.out.println(tt.getA());
	}
}
