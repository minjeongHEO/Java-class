public class OperatorMain12 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("상품명 입력: ");
		String a = input.next();
//		System.out.println(a);
		System.out.print("단가 입력: ");
		int b = input.nextInt();
//		System.out.println(b);
		System.out.print("판매 수량 입력: " );
		int c = input.nextInt();
//		System.out.print(c);
		
//		double s = b * 0.85 * c; //내작코
		int s = (int)(b * 0.85 * c);
		
//		System.out.printf("%s %d 대의 가격은 %,d원", a,c,(int)s); //내작코
		System.out.printf("%s %d 대의 가격은 %,d원", a,c,s);
		
		
		input.close();
		
		
	}

}
