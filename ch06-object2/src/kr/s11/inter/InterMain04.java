package kr.s11.inter;

interface I{
	//추상메서드
	public abstract void play();
	
}
//인터페이스 I를 클래스에 구현
class B implements I{
	//추상메서드 구현
	@Override
	public void play() {
		System.out.println("피아노를 연주합니다.");
	}
	public void study() {
		System.out.println("외국어를 공부합니다.");
	}
}

public class InterMain04 {
	public static void main(String[] args) {
		B bp = new B();
		bp.play();
		bp.study();
		
		I i = bp;//클래스타입 => 인터페이스타입으로 형변환 영역이 줄어든것
				//자동적 형변환(업캐스팅은 아님)
		i.play();
		//호출 범위를 벗어나서 호출 불가
		//i.study();
		
		B bp2 = (B)i;//인터페이스타입 => 클래스타입 형변환
					//명시적 형변환
	}
}
