package kr.s01.thread;
//두개의 동시쓰레드 사용해보기
//runnable사용해본다

public class ThreadMain03 implements Runnable{
	//Runnable의  run메서드 구현
	@Override
	public void run() {
		System.out.println
		("run 메서드, 스레드이름 : "+ Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		System.out.println
		("main 메서드, 스레드이름 : "+ Thread.currentThread().getName());
		
		//타겟객체생성
		ThreadMain03 tm = new ThreadMain03();
		
		//스레드 생성
		Thread t = new Thread(tm);//타겟객체 지정
		t.start();
	}
}
/*
 * main은 우리가 만든 스레드가 아니라
 * main스레드
 * 스태틱때문에 메인이 메모리에 올라가고 메인이 메인스레드였기때문에 동작을 한것
 */
