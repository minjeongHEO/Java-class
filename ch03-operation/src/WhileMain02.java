public class WhileMain02 {
	public static void main(String args[]) {
		int sum= 0, su = 1;
		
		//조건식
		while(su <= 100) {
			sum += su;//누적
			su++;//증감식 (증감식을 빼먹는 경우가 많음 그럴 경우 무한루프에 빠질 수 있음)
		}
		
		System.out.println("1부터 100까지의 합 : "+ sum);
		
		/*while(true): 무한반복
		 * 
		 */
		
		
		
	}
	
}
