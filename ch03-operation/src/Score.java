public class Score {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int korean,english,math,sum;
		char grade; //string char차이
		double avg;
		
		do {
			System.out.print("국어 : ");
			korean = input.nextInt();
		}while(korean <0 || korean > 100); //0~100입력시 조건문 false로  do블럭을 빠져나감 
											//조건문 true시 못빠져나간다.(-100,200등등)		
		do {
			System.out.print("영어 : ");
			english = input.nextInt();
		}while(english < 0 || english > 100);
		
		do {
			System.out.print("수학 : ");
			math = input.nextInt();
		}while(math < 0 || math > 100);
		
		//총점 구하기
		sum = korean + english + math;
		//평균 구하기
		avg = sum/3.0; //float데이터이므로 3.0f로 명시
		
		//등급 구하기
//		switch문에서는 비교연산자, 논리연산자 쓸 수 없다.
		switch((int)(avg/10)){//0~100범위를 10으로 나눠서 10개로만든다 float데이터를 int로 변환
		case 10://100	
//			grade = 'A';break; case 9와 결과값 같으므로 지우고 작성할 수 있다.
		case 9://90~99	
			grade = 'A';break;
		case 8://80~89	
			grade = 'B';break;
		case 7://70~79	
			grade = 'C';break;
		case 6://60~69	
			grade = 'D';break;
		default:
			grade = 'F'; //위에서 조건 체크를 해놔서 음수되거나 100을 넘을 수 없다.
		}
			
		System.out.println();//단순 줄바꿈	
		System.out.printf("총점 = %d\n", sum);//단순 줄바꿈	
		System.out.printf("평균 = %.2f\n", avg);//단순 줄바꿈	
		System.out.printf("등급 = %c\n", grade);//단순 줄바꿈	
		
		
		input.close();
	}

}
