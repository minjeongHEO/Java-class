public class ArrayMain06 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
//		int score[] = {90,80,70};
		String course[] = {"����","����","����"};
		int[] score = new int[course.length]; //0:����, 1:����, 2:����
		int sum= 0; //���� 
		float avg = 0.0f; //���
		
		for(int i =0;i<course.length;i++) {
			do {
				System.out.print(course[i] + "=");
				score[i] = input.nextInt();
			}while(score[i]<0 || score[i]>100);
			//���� ���ϱ�
			sum += score[i];
		}
		
		//��� ���ϱ�
		avg = sum/(float)course.length;
//		avg = sum/3.0f;
		
		System.out.printf("���� : %d\n", sum);
		System.out.printf("��� : %.2f", avg);
		input.close();
	}
}
