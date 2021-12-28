public class IfMain05 {
	public static void main(String[] args) {
		int a = 10;
		float b = 10.0f;
		
		if(a==b) { //a가 float으로 자동 형변환된다
			System.out.println("10과 10.0f는 같다!");
		}
		
		char c = '0';//문자0의 아스키코드는 48
		int d = 0;
		
		if(c != d) {
			System.out.println("'0'과 0은 같지 않다.");
		}
		
		char e = 'A';//A의 아스키코드 값은65
		int f = 65;
		
		if(e == f) {
			System.out.println("'A'는 65와 같다.");
		}
	}
}
