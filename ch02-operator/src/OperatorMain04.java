public class OperatorMain04 {
	public static void main (String[] args) {
		System.out.println("=====비교연산자=====");
		boolean result;
		int a = 10;
		double b = 10.5;
		
		result = a < b; //a=10.0으로 자동형변환되어 연산
		System.out.println("a < b : " + result);
		
		result = a > b;
		System.out.println("a < b : " + result);
		
		result = a >= b;
		System.out.println("a >= b : " + result);
		
		result = a <= b;
		System.out.println("a <= b : " + result);
		
		result = a == b;//서로 같으면 true
		System.out.println("a == b : " + result);
		
		result = a != b;//서로 같지않으면 true
		System.out.println("a != b : " + result);
	}
}
