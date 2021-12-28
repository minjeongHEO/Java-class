public class DoWhileMain {
	public static void main(String[] args) {
		//while문의 조건을 do-while문의 조건에 넣을경우에 두번 실행될 수도 잇다.
		String str="Hello world";
		int su = 0;
		
		while(su++ < 5) { // 조건식 안에 증감식 사용 가능하다.
			System.out.println(str);
		}
		
		System.out.println("-----------");
		int su2=0;
		do {
			System.out.println(str);
		}while(su2++ <5); // do-while문에서 마지막에;필수!!!!
				
	}

}
