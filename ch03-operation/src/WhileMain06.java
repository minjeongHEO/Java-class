public class WhileMain06 {
	public static void main(String[] args) {
//		console ���α׷� ���� �� while���� ���� ���� �̿�
//		======���� ���α׷�======
		java.util.Scanner input = new java. util.Scanner(System.in);
		
		int balance = 0; //�ܰ�
		
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			
			System.out.println("�޴� ����>");
			int num = input.nextInt();
			
			if(num == 1) {
				//������ ����
				System.out.print("���ݾ� > ");
				balance += input.nextInt(); //�����̹Ƿ� '='�ƴ�
				System.out.printf("�ܰ�: %,d��\n",balance);
				
			}else if(num==2) {
				//����� ����
				System.out.print("��ݾ� > ");
				balance -= input.nextInt();
				System.out.printf("�ܰ�: %,d��\n",balance);
				
			}else if(num==3) {
				System.out.printf("�ܰ�: %,d��\n",balance);
				
			}else if(num==4) {
				System.out.println("���α׷� ����");
				break;
				
			}else {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				//break;
			}
		}
		
		input.close();
		
		
}
}