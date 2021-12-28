public class ArrayMain13 {
	public static void main(String[] args) {
		//2차원 배열 선언 및 생성
		int[][]score = {{98,99,80},{97,85,70},{84,88,95},{79,95,90},{88,85,80}}; //5행(인원수)3열(과목수)
		
		System.out.println("번호 국어 영어 수학 총점  평균");
		System.out.println("-----------------------");
		for(int i=0;i<score.length;i++) { //행
			int sum = 0;
			System.out.print(" "+ (i + 1) + "  ");
			for(int j=0;j<score[i].length;j++) { //열
				//누적
				sum += score[i][j];
				System.out.print(score[i][j] + "  ");
			}
			//평균을 구하고 총점과 평균을 출력   sum/열의 길이(과목수)
			System.out.println(sum+" "+sum/score[i].length);
		}
	}
}
