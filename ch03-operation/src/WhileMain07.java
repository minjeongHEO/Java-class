public class WhileMain07 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
	
		int price = 4000;
		int quantity;//����
		int balance;//�Ž�����
		int payment;//�����ѵ�
		int total=0;//�� �����ؾ� �� �ݾ�
		
		while(true) {
			
		
		System.out.print("���� ���� �Է�> ");
		quantity = input.nextInt();
//		System.out.println(quantity);
		
		System.out.print("������ �ݾ�> ");
		payment = input.nextInt();
//		System.out.println(payment);
		
		total= quantity*price;
		
		balance= payment-total; //�Ž�����
	
			/*if(payment < total) {
				System.out.println((total-payment)+"���� �����մϴ� �ٽ� ���� �ϼ���");
				}
			else {
				System.out.printf("�Ž��� ��> %,d��",balance);
				break; ������*/
				
				
				
			if(balance >= 0) {
				break;//while���� ��������
			}
			System.out.printf(",%d���� �����մϴ� �ٽ� ���� �ϼ���\n", -balance);
				}
		
		System.out.printf("�Ž�����> %,d��", balance);
		

		
		input.close();
		
	}
		
	
}

