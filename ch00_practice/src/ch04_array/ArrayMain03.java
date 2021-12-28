package ch04_array;
public class ArrayMain03 {
	public static void main(String[] args) { 
		int[] score = {79,88,91,33,100,55,95};

		//최댓값 최솟값 구하기 연습

		int max = score[0];
		int min = score[0];
		int tmpt = 0;

		for(int i=1; i<score.length;i++) {
			if(max<score[i]) {
				max=score[i];
			}else {
				tmpt = max;
				max = score[i];
				score[i] = tmpt;
			}
		}

		System.out.println(score[0]+score[1]+score[2]+score[3]);
		System.out.println(max);
					  0	  1   2  3  4   5  6
		int[] score = {79,88,91,33,100,55,95};
		int max = score[0];//배열의 첫번째 값으로 최댓값을 초기화
		int min = score[0];//배열의 첫번째 값으로 최솟값을 초기화


		for(int i=1; i<score.length; i++){//0번을 기준값으로 썼기때문에 1부터 비교 시작한다.
			//최댓값 구하기
			if(score[i]>max) { score1>score0 / max = score1 / score2>score1/ max=score2/ score3>score2/ score4> 
				max = score[i];
			}
			//최솟값 구하기
			if(score[i]<min) { score1<score0/min=score1/
				min=score[i];



			} 
		}
