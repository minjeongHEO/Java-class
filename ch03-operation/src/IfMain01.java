public class IfMain01 {
	public static void main(String[] args) {
		int n = 10;
		//조건이 true이면 if블럭 안의 수행문을 실행
		if(n>5) {
			System.out.println("n은 5보다 크다");
		}
		
		System.out.println("-----------------");
		
		if(n<5) //if문 블럭내의 수행문이 한 줄이면 중괄호 블럭 생략 가능
			System.out.println("n은 5보다 크다");
		
		System.out.println("프로그램 종료");//else문
	}

}
