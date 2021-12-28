public class ForMain04 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("단을 입력하세요: ");
		int dan = input.nextInt();
		
		System.out.println(dan+"단");
		System.out.println("-------------");
//		int i;
		for(int i=1;i<10;i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
//			System.out.printf("%d * %d = %d\n", dan,i, dan * i);
			
		}
		
		input.close();

	}

}
