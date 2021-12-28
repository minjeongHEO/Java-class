package kr.s07.array;

public class ScoreMain {
	public static void main(String[] args) {
		/*
		 * �迭 ����, �迭�� ���̴� 4
		 * int total, avg = 0 
		 * Score ��ü�� 4�� �����ؼ� �迭�� ����
		 * �ݺ����� �̿��ؼ� �迭�� �����ϰ� ��ü�� �����͸� �о�´� 
		 */
		
		int total = 0; //��(4��) ��ü�� ����
		int avg = 0; //��(4��) ��ü�� ���� ���
		
		Score scoreArray[] = new Score[4];
		
		scoreArray[0] = new Score("ö��",80,70,100);
		scoreArray[1] = new Score("����",90,90,70);
		scoreArray[2] = new Score("����",85,75,100);
		scoreArray[3] = new Score("����",80,90,50);
		
//		for(Score ary : scoreArray) {
		for(int i=0;i<scoreArray.length;i++) {
			System.out.printf("%s\t",scoreArray[i].getName());
			System.out.printf("%d\t",scoreArray[i].getKorean());
			System.out.printf("%d\t",scoreArray[i].getEnglish());
			System.out.printf("%d\t",scoreArray[i].getMath());
			System.out.printf("%d\t",scoreArray[i].makeSum());
			System.out.printf("%d\t",scoreArray[i].makeAvg());
			System.out.printf("%s\n",scoreArray[i].makeGrade());
//			System.out.print(scoreArray[i]+"\t");
//			total += makeSum();
			total += scoreArray[i].makeSum();
			
		}
//		avg = total/4;
		avg = total / (scoreArray.length * 3);
		
//		System.out.println("��ü�� ����: "+total);
//		System.out.println("��ü�� ���: "+avg);
		System.out.printf("��ü ����: %d ��ü ���: %d",total, avg);
		
	}
	
}
