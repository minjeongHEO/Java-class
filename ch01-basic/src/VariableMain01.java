
public class VariableMain01 {
	public static void main (String[] args) {
		//변수(Variable)는 값을 저장할 수 있는 메모리의 공간
		//변수 선언
		int num; //변수의 초기화
		
		//변수의 초기화
		num=17;// = 을 대입연산자라고 한다.
		
		//출력
		System.out.println(num);
		
		//변수 선언과 초기화를 동시에
		int number =20;
		
		//출력
		System.out.println(number);
	
		//*주의사항*
//		int number=30; 동일한 변수명 선언 시 오류
		
		System.out.println("==========");
		
		
		/*동일한 자료형을 사용하기 때문에 두번째 변수명 앞의 자료형은 생략 가능
		int a = 10;
		int b = 20;
		*/
		
		int a=10,b=20;
		int result = a+b; //연산
		System.out.printf("result = %d%n", result);
		
		System.out.println(a+b);
		
		//*주의사항*
		System.out.println("result = " + a + b); //연결
		System.out.println("result = " + (a + b)); //연산
		
//		연산 우선순위 괄~이시대 == 비논할 (실기출제)
		
		//변수선언
		int no;
		
//		System.out.println(no);  에러발생: 출력이나 연산하기전에 변수 선언 후 초기화를 안함
		
		
	}
}
