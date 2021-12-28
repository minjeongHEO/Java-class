package kr.s01.a;
class Worker {
	/*
	 * worker
	 * 1)멤버변수: 직원이름(name) 급여(money) 계좌 잔고(balance)
	 * 2)멤버메서드 : work(실행하면 money에 1000 누적),
	 * 			  deposite(실행하면 money의 돈을 balance에 누적시키고 money는 0)
	 * MethodMain04
	 * 1)Worker객체 생성
	 * 2)직원의 이름 지정
	 * 3)10번 일한느데 번 돈이 3000원일 때마다 계좌에 저출
	 * 4)직원이름, 현재 계좌에 입금되지 않고 남아 있는 급여(money),
	 *   계좌잔고(balance)를 출력
	 */
	String name;
	int money;
	int balance;
	
	//일하는 메서드
	public void work() { //반환이 아니라 누적이라 void사용해야함 void는 return안씀
		 money += 1000;
	}
	public void deposite() {
		balance += money;
		money = 0;
	}
}

public class MethodMain04 {
	public static void main(String[] args) {
		//객체 선언및 생성 먼저!
		Worker worker = new Worker();
		worker.name = "홍길동";
		
		//10번 일하는데 번 돈이 3000원 일때 마다 저축
		for(int i=1;i<=10;i++) {
			worker.work();
			if(worker.money>=3000) {
				worker.deposite();
			}
		}
		
		System.out.println("직원 이름: "+ worker.name);
		System.out.printf("현재 입금되지 않은 급여: %,d\n",worker.money);
		System.out.printf("통장의 잔고 : %,d원",worker.balance);
		
		/*int i=1;
		while(i<=10) {
			if(worker.balance<3000) {
				worker.deposite();
			}else {
				worker.work();
			}
		}*/
			
		
		
		
	}
}
