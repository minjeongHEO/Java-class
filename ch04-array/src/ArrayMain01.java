public class ArrayMain01 {
	public static void main(String[] args) {
		//배열 선언 (선언만해서는 만들어진게아니다. 생성을 해야한다.)
		char[] ch;
		//배열 생성
		ch = new char[4];
		//배열의 초기화
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		//배열의 요소(배열에 저장된 데이터) 출력
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		System.out.println("----------------");
		
		//반복문을 이용한 배열의 요소 출력
					//배열의 길이(4) 인덱스가 0부터 시작하므로 length를 포함하면 안됌
		for(int i=0;i<ch.length;i++) {
			System.out.println("ch[" +i+ "]:" + ch[i]);
		}
		System.out.println("-----------------");
		//배열 선언 및 생성
//		int it[] = new int[6];// [] 위치는 둘다 사용 가능하다.
		int[] it = new int[6];//초깃값에는 정수일 경우에 0이 들어가져있다
								//문서 기본자료형의 종류 참고
		System.out.println(it[0]);
		System.out.println(it[1]);
		System.out.println(it[2]);
		System.out.println(it[3]);
		System.out.println(it[4]);
		System.out.println(it[5]);
		System.out.println("-----------------");
		
		//배열 선언 및 생성(명시적 배열 생성), 초기화
		char[]ch2 = new char[] {'J','A','V','A'};
//		char[]ch2 = new char[4] {'J','A','V','A'};// 초기화 할떄는 자동 카운팅하므로 4 넣으면 에러난다
		
		//배열 선언 및 생성(암시적 배열 생성), 초기화
		char[] ch3 = {'자','바'};
		
		
	}

}
