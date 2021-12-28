package kr.s01.thread;
//원칙적으로 만드는 첫번째 방법

public class ThreadMain01 extends Thread { //스레드안엔 런메서드를 재정의해서 동시작업을 할수 있따.

	public ThreadMain01(String threadname) {
		super(threadname);// 이름을 부여안할때는 
		
	}

	//Thread의 run메서드 재정의
	@Override
	public void run() { //동시작업의 능력인 run()
		//현재 수행하는 스레드 객체를 반환
		Thread t = currentThread();
		System.out.println("실행 스레드: "+ t);
		
		for(int i=0;i<10;i++) {
			try {
					 //밀리세컨드(천분의 일초) 단위
				sleep(1000); //지정된 시간만큼 수행을 멈춤 1000이면 1초
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			//getName() : 스레드의 이름 반환 / ?currentThread(): run메서드가 실행한 객체가 어떤건지?
			System.out.printf("스레드 이름: %s ,", currentThread().getName());//sleep currenthread 메서드는 스태틱하고 원칙적으로는 
																			//앞에 thread. 을붙여야하지만 상속되어있기때문에 생략한다
			System.out.printf("temp value: %d \n",i);
		}

	}

	public static void main(String[] args) {
		//객체생성
		ThreadMain01 tm = new ThreadMain01("첫번째");
		tm.start();//start메서드를 실행하면 run메서드를 실행한다.

	}
}
