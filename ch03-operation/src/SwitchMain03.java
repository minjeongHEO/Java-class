public class SwitchMain03 {
	public static void main(String[] args) {
		/* 정수 2개를 입력맏고 산술연산자(+,-,*,/,%)를 입력해서 연산을 수행한 결과를 출력
		 * 첫번쨰 수: 7
		 * 연산자 : +
		 * 두번쨰 수 :5
		 * 7+5=12
		 */
	
		java.util.Scanner input =  new java.util.Scanner(System.in);
		
		int result=0;
		
		System.out.print("첫번째 수: ");
		int first = input.nextInt();
		
		System.out.print("연산자: ");
		String operator = input.next();
		
		System.out.print("두번째 수: ");
		int second = input.nextInt();
		
		switch(operator) {
		case"+":
			result=first+second; break;//;이 줄바꿈으로 인식하기때문에 break문 윗줄에 올려도 무관
		case"-":
			result=first-second; 
			break;
		case"*":
			result=first*second; 
			break;
		case"/":
//			result=first/second; 
//			자바에서는 정수를 0으로 나누면 에러가 난다.그래서 알려주는 코드를 넣는다.
			if(second!=0) {
				result=first/second; 
			}else {//나누는 수가 0인 경우
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);//출력문 출력안돼게 프로그램 종료
			}
			break;	
		case"%":
//			result=first%second; 
//			자바에서는 정수를 0으로 나누면 에러가 난다.그래서 알려주는 코드를 넣는다.
			if(second!=0) {
				result=first%second;
			}else {//나누는 수가 0인 경우
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);//출력문 출력안돼게 프로그램 종료
			}
			break;
		default:
			System.out.println("다시 실행하세요");
			//**!!! 프로그램 종료를 넣으면 출력문 출력안돼게 할수 있따
			System.exit(0);

		}
		System.out.println();//단순 줄바꿈
//		System.out.println(first+operator+second+"="+result);	//내가작성한 코드
		System.out.printf("%d %s %d = %d", first, operator, second, result);
		input.close();
	}

}
