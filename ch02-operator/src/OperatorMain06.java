public class OperatorMain06 {
	public static void main(String[] args) {
		//증감연산자, 비교연산자, 논리연산자
		int a,b;
		a=b=10;
		
		boolean c = a++ >= ++b && ++a > b++; 
//					10		11
//					false	
		System.out.println(a + ","+b);
		System.out.println("c =" + c);
		System.out.println(c);
//		선조건에서 false이므로 뒤에 후조건 실행하지않아도 바로 false결과값 출력
		
		System.out.println("-----------------");
		
		int d, e;
		
		d=e=10;
		boolean f = ++d > e++ || d++ >= ++e; // 두번째에서 헷갈림 새롭게 하는지 이어서 증감하는지?
//					11	  10      
//					true
		System.out.println(d + "," + e);//e 출력값이 11인것은 후조건을 실행하지않으므로 선조건의 e++의 결과인지? 
		System.out.println("f=" + f);

		d=e=10;
		
		boolean j = ++d > e++ && d++ >= ++e; // 후조건에서 d의값은 위에서 정의된 10에서 부터 다시 시작하는지 x
											//	선조건에서의 11에서부터 적용되는지? o
//					11	  10      11    12
//					true 	 && 	false 	-> false
		System.out.println(d + "," + e);//d=12 e=12
		System.out.println("f=" + j);
	}
}
