public class WhileMain07 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
	
		int price = 4000;
		int quantity;//수량
		int balance;//거스름돈
		int payment;//지불한돈
		int total=0;//총 지불해야 할 금액
		
		while(true) {
			
		
		System.out.print("구매 수량 입력> ");
		quantity = input.nextInt();
//		System.out.println(quantity);
		
		System.out.print("지불한 금액> ");
		payment = input.nextInt();
//		System.out.println(payment);
		
		total= quantity*price;
		
		balance= payment-total; //거스름돈
	
			/*if(payment < total) {
				System.out.println((total-payment)+"원이 부족합니다 다시 구매 하세요");
				}
			else {
				System.out.printf("거스름 돈> %,d원",balance);
				break; 내작코*/
				
				
				
			if(balance >= 0) {
				break;//while문을 빠져나감
			}
			System.out.printf(",%d원이 부족합니다 다시 구매 하세요\n", -balance);
				}
		
		System.out.printf("거스름돈> %,d원", balance);
		

		
		input.close();
		
	}
		
	
}

