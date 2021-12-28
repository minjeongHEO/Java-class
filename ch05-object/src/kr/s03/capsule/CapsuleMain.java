package kr.s03.capsule;

class Capsule{
	//은닉화
	//private은 같은 클래스에서만 접근 가능
	private int a;//ex)숨겨놓은 금고 멤버변수가 중요한요소
	
	//캡슐화 .직접적으로 멤버변수 엑세스 못하게하는 것이 권장사항
	public void setA(int n) {//데이터를 받는 메소드 ex)돈을 받는 은행원
		if(n>=0) {
			a = n;
			
		}else {//음수
			System.out.println("음수는 허용되지 않습니다.");
		}
	}
	public int getA() { //ex)돈을 출금해주는 은행원
		return a;
	}
	
}

public class CapsuleMain {
	public static void main(String[] args) {
		Capsule cap = new Capsule();
		//변수 a의 접근지정자(제한자)가 private이기 때문에 같은 클래스 내에서는 호출 가능
		//그러나 다른 클래스에서는 호출 불가능
//		cap.a = -10;
		
		cap.setA(100);//데이터저장
		System.out.println(cap.getA());//데이터 호출
		System.out.println("-------------------");
		
		cap.setA(-100);
		System.out.println(cap.getA());//데이터 호출
		System.out.println("-------------------");
		
	}
}
