public class SwitchMain03 {
	public static void main(String[] args) {
		/* ���� 2���� �Է¸��� ���������(+,-,*,/,%)�� �Է��ؼ� ������ ������ ����� ���
		 * ù���� ��: 7
		 * ������ : +
		 * �ι��� �� :5
		 * 7+5=12
		 */
	
		java.util.Scanner input =  new java.util.Scanner(System.in);
		
		int result=0;
		
		System.out.print("ù��° ��: ");
		int first = input.nextInt();
		
		System.out.print("������: ");
		String operator = input.next();
		
		System.out.print("�ι�° ��: ");
		int second = input.nextInt();
		
		switch(operator) {
		case"+":
			result=first+second; break;//;�� �ٹٲ����� �ν��ϱ⶧���� break�� ���ٿ� �÷��� ����
		case"-":
			result=first-second; 
			break;
		case"*":
			result=first*second; 
			break;
		case"/":
//			result=first/second; 
//			�ڹٿ����� ������ 0���� ������ ������ ����.�׷��� �˷��ִ� �ڵ带 �ִ´�.
			if(second!=0) {
				result=first/second; 
			}else {//������ ���� 0�� ���
				System.out.println("0���� ���� �� �����ϴ�.");
				System.exit(0);//��¹� ��¾ȵŰ� ���α׷� ����
			}
			break;	
		case"%":
//			result=first%second; 
//			�ڹٿ����� ������ 0���� ������ ������ ����.�׷��� �˷��ִ� �ڵ带 �ִ´�.
			if(second!=0) {
				result=first%second;
			}else {//������ ���� 0�� ���
				System.out.println("0���� ���� �� �����ϴ�.");
				System.exit(0);//��¹� ��¾ȵŰ� ���α׷� ����
			}
			break;
		default:
			System.out.println("�ٽ� �����ϼ���");
			//**!!! ���α׷� ���Ḧ ������ ��¹� ��¾ȵŰ� �Ҽ� �ֵ�
			System.exit(0);

		}
		System.out.println();//�ܼ� �ٹٲ�
//		System.out.println(first+operator+second+"="+result);	//�����ۼ��� �ڵ�
		System.out.printf("%d %s %d = %d", first, operator, second, result);
		input.close();
	}

}
