package ch04_array;
public class ArrayMain03 {
	public static void main(String[] args) { 
		int[] score = {79,88,91,33,100,55,95};

		//�ִ� �ּڰ� ���ϱ� ����

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
		int max = score[0];//�迭�� ù��° ������ �ִ��� �ʱ�ȭ
		int min = score[0];//�迭�� ù��° ������ �ּڰ��� �ʱ�ȭ


		for(int i=1; i<score.length; i++){//0���� ���ذ����� ��⶧���� 1���� �� �����Ѵ�.
			//�ִ� ���ϱ�
			if(score[i]>max) { score1>score0 / max = score1 / score2>score1/ max=score2/ score3>score2/ score4> 
				max = score[i];
			}
			//�ּڰ� ���ϱ�
			if(score[i]<min) { score1<score0/min=score1/
				min=score[i];



			} 
		}
