
public class PrintMain05 {
	public static void main(String[] args) {
//		System.out.printf(포맷문자, 데이터);를 이용한 출력 (데이터의 종류를 표시할 수 있는 포맷 문자 지원)
		
		System.out.printf("%c\n",'a');//(줄바꿈\n) printf, ln 전부 줄바꿈 할 수 있는 특수문자
		System.out.printf("%c%n",'b');//(줄바꿈%n) printf에서만 줄바꿀 시 쓸 수 있는 포맷문자
		System.out.printf("%6c%n",'c');//(6자리 확보 후 오른쪽 정렬)
		System.out.printf("%6c\n",'c');//(6자리 확보 후 오른쪽 정렬)
		System.out.printf("%-6c\n",'c');//(6자리 확보 후 왼쪽 정렬)
		System.out.printf("%c",'d');//(포맷문자,데이터)
		
		//정수
		System.out.printf("%d\n",60);
		System.out.printf("%,d\n",60000);//3자리 단위로 쉼표 표시
		System.out.printf("%,d원\n",60000);//3자리 단위로 쉼표 표시, 원을 붙인다
		System.out.printf("%,5d\n",20);//5자리를 잡고 오른쪽부터 표시
		System.out.printf("%-5d\n",20);//5자리를 잡고 왼쪽부터 표시
		
		System.out.println("============================");
		
		//실수
		System.out.printf("%f\n",35.896);//기본적으로 소수점 자리 6자리 출력
		System.out.printf("%.2f\n",35.896);//반올림 후 소수점 둘째자리까지 출력 
		System.out.printf("%.3f\n",35.896);//반올림 후 소수점 셋째자리까지 출력 
		System.out.printf("%10.2f\n",35.896);//10자리를 잡고 오른쪽부터 표시 후, 소숫점 둘쨰자리까지 출력
		
		System.out.println("============================");
		
		//문자열
		System.out.printf("%s%n", "우주");

		System.out.printf("%s는 %d점 입니다.\n", "점수",98);//포맷문자가 순서대로 들어간다. 순서중요
		
		//논리값
		System.out.printf("%b", true);
		
//	숫자를 명시할 때는 f 대부분은 ln	
	}
	

}
