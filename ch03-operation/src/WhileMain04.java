public class WhileMain04 {
	public static void main(String[] args) { //main trl space
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a, total=0;
		
		System.out.println("0전까지 입력받은 정수로 합 구하기");
		System.out.print("누적할 정수 데이터 입력:");
		
		while((a = input.nextInt()) != 0) {// 1.입력값을 a에 저장하고, 
											// 2. a의 값과 0을 비교(a의 값이 0이 아니면 true)
			
			//누적
			total += a;
			System.out.print("누적할 정수 데이터 입력:");//가 있어야 한다.그래야 계속 입력할 수있게 한다.
			
		}
			//누적한 데이터 출력
			System.out.println("total="+total);
			
		input.close();
		/*
		 * whilemain04 -> 05 비교
		 * 누적할 정수 데이터 입력을 한부분만 쓰게되고
		 * while문의 조건식이 정리됨
		 */
		
	
		
	}
}
