public class ArrayMain03 {
	public static void main(String[] args) {
		//�迭�� ���� �� ����, �ʱ�ȭ
		int[] score = {79,88,91,33,100,55,95};//length=7
		
		int max = score[0];//�迭�� ù��° ������ �ִ��� �ʱ�ȭ
		int min = score[0];//�迭�� ù��° ������ �ּڰ��� �ʱ�ȭ
		
		for(int i=1; i<score.length; i++){//0���� ���ذ����� ��⶧���� 1���� �� �����Ѵ�.
			//�ִ� ���ϱ�
			if(score[i]>max) {
				max = score[i];
			}
			//�ּڰ� ���ϱ�
			if(score[i]<min) {
				min=score[i];
			}
		}
			//�ִ񰪰� �ּڰ� ���
		System.out.println("�ִ�:" + max);
		System.out.println("�ּڰ�:" + min);
		System.out.println();
	}
}
