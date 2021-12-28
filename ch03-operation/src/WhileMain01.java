public class WhileMain01 {
	public static void main(String[] args) {
		//while 문은 조건식이 조건문 밖에 있음
		int i=1;
		
		while(i<=10) {
			//i값을 1증가(없으면 무한루프에 빠짐)
			System.out.println(i++);
		}
		
		System.out.println("------------");
		
		int j=10;
		while(j>=0) {
			System.out.println(j--);
		}
		

	}
}
