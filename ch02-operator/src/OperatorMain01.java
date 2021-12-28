public class OperatorMain01 {
	public static void main (String[] args) {
		System.out.println("=====증감 연산자=====");
		//증가 연산자
		int i = 5;
		System.out.println(++i);//6 1을 먼저 증가시키고 증가된 데이터를 읽어옴
		
		System.out.println(i++);//6 데이터를 먼저 읽어오고 1을 나중에 증가시킴
		
		System.out.println(i);//7
		
		
		System.out.println("------------");

		//감소 연산자
		int j = 10;
		System.out.println(--j);//9
		System.out.println(j--);//9 메모리 공간에는 이미 감소되어 있지만 미처 읽어오지 못한상태
		System.out.println(j);//8 
		
	}
}
