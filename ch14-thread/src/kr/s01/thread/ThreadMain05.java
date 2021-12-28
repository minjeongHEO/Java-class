package kr.s01.thread;

class MyRunnableTwo implements Runnable{
	@Override
	public void run() {
		System.out.println("run");
		first();
	}
	
	public void first() {
		System.out.println("first");
		second();
	}
	
	public void second() {
		System.out.println("second");
	}
	
}

public class ThreadMain05 {
	public static void main(String[] args) {
		System.out.println
				(Thread.currentThread().getName()+ " start");//메인이라는 스레드가만들어져서 메인을 실행시킴
		MyRunnableTwo mt = new MyRunnableTwo();
		//스레드 객체 생성
		Thread myThread = new Thread(mt);
		myThread.start();//MyRunnableTwo의 run메서드 실행
		
		//먼저 실행시키고 싶은 메소드가있다며 조인메서드동작시킨다
		//join(): join()메서드를 호출한 쓰레드가 먼저실행되고 현재 쓰레드는 종료 할 때까지 기다리게함
		try {
			myThread.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+ " end");
		
	}
}
