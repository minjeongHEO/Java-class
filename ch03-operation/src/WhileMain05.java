public class WhileMain05 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a =0, total=0;
		
		System.out.println("0 전까지 입력받은 정수로 합 구하기");
		
		while(true) {
			System.out.println("누적할 정수 입력:");//가이드 문자가 있어야 입력할 수 있으므로
			a=input.nextInt();
			if(a==0) {
				//while문 탈출
				break; //switch문이던 반복문 탈출 시 사용
			}
			//누적
			total += a;
		}
		System.out.println("총 누적 된 정수의 합:"+total);
		
		input.close();
		
		
		
		
	}
}
