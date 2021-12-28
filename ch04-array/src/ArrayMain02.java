public class ArrayMain02 {
	public static void main(String[] args) {
		//배열 선언 및 생성(암시적 배열 생성), 초기화
		int[] score = {100,88,88,100,90}; //length=5
		int sum = 0; //총점
		float avg = 0.0f; //평균
		
		//반복문을 이용한 총점구하기
						//배열의 길이(5)
		for(int i=0;i<score.length;i++) {
			//누적 (+= 대입연산자)
			sum += score[i];
		}
		
		//반복문을 이용한 평균구하기
//		avg  = sum/5.0f;
		avg  = sum/(float)score.length; //과목수를 나중에 추가/삭제 할 경우 코드 변경안해도 되는 장점
		
		System.out.printf("총점: %d\n", sum);
		System.out.printf("평균: %.2f\n", avg);
		
	}

}
