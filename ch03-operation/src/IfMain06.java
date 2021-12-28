public class IfMain06 {
	public static void main(String[] args) {
		/* 정수 두개를 입력 받아서
		 * 변수 저장하고 최댓값과 최솟값 구하여 출력한다
		 * 입력한 두 수가 같을 경우 "두 수는 같다."라고 출력한다.
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int A,B;
		
		/*System.out.println("A : ");
		A= input.nextInt();

		System.out.print("B : ");
		B= input.nextInt();
		
		if(A==B)
			System.out.println("두 수는 같다.");
		
		else
			System.out.println("두 수는 같지 않다."); */
		
		System.out.println("첫번째 정수 입력: ");
		A= input.nextInt();
		
		System.out.println("두번째 정수 입력: ");
		B= input.nextInt();
		
		if(A>B) {
			System.out.println("최댓값 = "+A);
			System.out.println("최솟값 = "+B);
			
		}else if(A<B) {
			System.out.println("최댓값 = "+B);
			System.out.println("최솟값 = "+A);
			
		}else { //A==B
			System.out.println("두 수는 같다.");
		}
		
		
		input.close();
	
	}

}
