public class OperatorMain08 {

	public static void main(String[] args) {
		System.out.println("======조건연산자(삼항연산자)======");
		int a = 5, b = 10;
		int max;//최댓값을 저장할 변수 선언
		int min;//최솟값을 저장할 변수 선언
		
//		최댓값 구하기
		max = a > b ? a : b;
		System.out.println("max = " + max);
		
//		최솟값 구하기
		min = a < b ? a : b;
		System.out.println("min = " + min);
		
	}

}
