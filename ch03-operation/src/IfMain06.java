public class IfMain06 {
	public static void main(String[] args) {
		/* ���� �ΰ��� �Է� �޾Ƽ�
		 * ���� �����ϰ� �ִ񰪰� �ּڰ� ���Ͽ� ����Ѵ�
		 * �Է��� �� ���� ���� ��� "�� ���� ����."��� ����Ѵ�.
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int A,B;
		
		/*System.out.println("A : ");
		A= input.nextInt();

		System.out.print("B : ");
		B= input.nextInt();
		
		if(A==B)
			System.out.println("�� ���� ����.");
		
		else
			System.out.println("�� ���� ���� �ʴ�."); */
		
		System.out.println("ù��° ���� �Է�: ");
		A= input.nextInt();
		
		System.out.println("�ι�° ���� �Է�: ");
		B= input.nextInt();
		
		if(A>B) {
			System.out.println("�ִ� = "+A);
			System.out.println("�ּڰ� = "+B);
			
		}else if(A<B) {
			System.out.println("�ִ� = "+B);
			System.out.println("�ּڰ� = "+A);
			
		}else { //A==B
			System.out.println("�� ���� ����.");
		}
		
		
		input.close();
	
	}

}
