public class ArrayMain03 {
	public static void main(String[] args) {
		//배열의 선언 및 생성, 초기화
		int[] score = {79,88,91,33,100,55,95};//length=7
		
		int max = score[0];//배열의 첫번째 값으로 최댓값을 초기화
		int min = score[0];//배열의 첫번째 값으로 최솟값을 초기화
		
		for(int i=1; i<score.length; i++){//0번을 기준값으로 썼기때문에 1부터 비교 시작한다.
			//최댓값 구하기
			if(score[i]>max) {
				max = score[i];
			}
			//최솟값 구하기
			if(score[i]<min) {
				min=score[i];
			}
		}
			//최댓값과 최솟값 출력
		System.out.println("최댓값:" + max);
		System.out.println("최솟값:" + min);
		System.out.println();
	}
}
