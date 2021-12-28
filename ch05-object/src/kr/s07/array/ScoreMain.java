package kr.s07.array;

public class ScoreMain {
	public static void main(String[] args) {
		/*
		 * 배열 생성, 배열의 길이는 4
		 * int total, avg = 0 
		 * Score 객체를 4개 생성해서 배열에 저장
		 * 반복문을 이용해서 배열에 접근하고 객체의 데이터를 읽어온다 
		 */
		
		int total = 0; //반(4명) 전체의 총점
		int avg = 0; //반(4명) 전체의 과목 평균
		
		Score scoreArray[] = new Score[4];
		
		scoreArray[0] = new Score("철수",80,70,100);
		scoreArray[1] = new Score("영희",90,90,70);
		scoreArray[2] = new Score("민정",85,75,100);
		scoreArray[3] = new Score("영수",80,90,50);
		
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
		
//		System.out.println("전체의 총점: "+total);
//		System.out.println("전체의 평균: "+avg);
		System.out.printf("전체 총점: %d 전체 평균: %d",total, avg);
		
	}
	
}
