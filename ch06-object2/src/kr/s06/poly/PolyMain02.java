package kr.s06.poly;

class A{
	public void make() {
		System.out.println("make 메서드");
	}
}

class B extends A{
	public void play() {
		System.out.println("play 메서드");
	}
}
public class PolyMain02 {
	public static void main(String[] args) {
		B bp = new B(); //B객체를 생성,B타입을 써서 전영역을 호출가능
		bp.make();
		bp.play();
		
		A ap = bp; //make만 호출 가능
					//자식클래스타입 -> 부모클래스타입 형변환
					//업캐스팅, 자동적으로 형변환
		ap.make();
//		ap.play();//호출범위를 벗어나 호출 불가
		
		B bp2 = (B)ap;//부모클래스타입 -> 자식클래스타입 형변환
					//다운캐스팅, 명시적 형변환
		bp2.make(); 
		bp2.play();
		
	}
}
