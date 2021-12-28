public class OperatorMain11 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);//입력을 받을 수 있는 상태가 됨
		
		System.out.print("국어 :");
		int Korean = input.nextInt();//정수를 입력받음
		
		System.out.print("영어 :");
		int English = input.nextInt();//정수를 입력받음
		
		System.out.print("수학 :");
		int Math = input.nextInt();//정수를 입력받음
		
		int sum= Korean+English+Math;
		
//		double avg= sum/3; //double데이터로 바꿔야 소숫점뒤에가 제대로 나온다.
		
		double avg= sum/3.0;/* 또는 (double)sum/3;
							sum의 자료형이 int->double로 형변환되어 실수/실수=>실수*/
		
		System.out.println("국어 = "+Korean);
		System.out.println("영어 = "+English);
		System.out.println("수학 = "+Math);
		System.out.println("총점 = "+sum);
		System.out.printf("평균 = %.2f",avg);//s와f헷갈림
		
		
		input.close();//입력이 끝났음을 의미한다.
		
		
	}

}
