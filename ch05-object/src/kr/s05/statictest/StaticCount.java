package kr.s05.statictest;

public class StaticCount {
	int c;//인스턴스 변수 객체가 생성되면 딸려올라가는
	static int count; //static 변수(클래스 변수) /힙영역이 아니라 스태택영역에 올라감
	
	//생성자
	public StaticCount() {
		c++;
		count++;
		
	}
	
}
