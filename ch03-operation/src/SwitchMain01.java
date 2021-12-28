public class SwitchMain01 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("정수형 데이터 입력: ");
		int a = input.nextInt();
		
		switch(a){//a=인자값, long형을 제외한 정수형(byte,short,int),char,문자열
		case 1:
			System.out.println("1입력");
			break;
		case 2:
			System.out.println("2입력");
			break;
		case 3:
			System.out.println("3입력");
			break;
		default://if문의 else역할 , break문 생략
			System.out.println("1,2,3이 아닌 숫자 입력");
		}
		
		input.close();
	}

}
