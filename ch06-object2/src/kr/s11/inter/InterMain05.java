package kr.s11.inter;

interface Inter{ //인터페이스는 클래스아니고!! 객체생성안돼고!! 클래스를 도와주는 역할
	//추상메서드
	public abstract void play(); //형식만있고 내용만있는 상태
}

class A implements Inter{
	@Override
	public void play() {
		System.out.println("피아노를 연주합니다.");
	}
}

class C implements Inter{ //공통의 자료형으로 묶기 위해서 인터페이스를 통해서 A와C의 공통의 부모가되어 표준화?를 시켜준것
	@Override
	public void play() {
		System.out.println("첼로를 연주합니다.");
	}
}
class Admin{
	public void autoPlay(Inter i) { //object타입으로하면 play()를 호출을 못하니까inter타입으로한다
		//i를 통해 객체에 접근해서 메서드를 호출함 (형변환없이 인터타입으로 객체에 접근해서)
		i.play();//
		
	}
}
public class InterMain05 {
	public static void main(String[] args) {
		 Admin ad = new Admin();
		 ad.autoPlay(new A());//i에 A객체의 주소를 전달
		 ad.autoPlay(new C());//i에 C객체의 주소를 전달
	}
}
