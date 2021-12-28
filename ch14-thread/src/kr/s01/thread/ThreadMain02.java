package kr.s01.thread;
//상속을 못시켜서 우회시키는 두번째 방법
public class ThreadMain02 implements Runnable {
	
	//Runnable인터페이스의 추상메서드를 구현해야 한다.
	@Override
	public void run() {
		 for(int i=0;i<10;i++) {
			 try {
				 //스레드가 스태틱한메서드인데 상속되어있는게 아니니까 앞에 쓰레드를 붙여준다.
				 Thread.sleep(1000);
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
			 System.out.printf("스레드 이름: %s, ", Thread.currentThread().getName());//currentThread()도 스태틱한 메서드라 앞에 스레드 붙인다
			 System.out.printf("temp value: %d%n", i);
		 }
	}
	
	public static void main(String[] args) {
		//스타트메서드가 없다 스레드의 상속상태가아니라서
		//run메서드가 있는 객체를 생성하고
		ThreadMain02 tm = new ThreadMain02();
		
		
		//쓰레드 객체 생성
					  //Tread(타겟객체,(그안에)스레드이름)
		Thread t = new Thread(tm,"첫번째");//스레드는 런메서드를 실행시킬수있는 객체
		t.start(); //지정한 타겟객체의 run()메서드 호출
		
	}
}
