public class BreakMain01 {
	public static void main(String[] args) {
//		단일 반복문
		int n = 1;
		while(n<=10) {
			System.out.println(n);
			n++;
			if(n == 8){//(중괄호 생략)
				break;//while문을 빠져나감
			}
			
		}
			
	}

}
