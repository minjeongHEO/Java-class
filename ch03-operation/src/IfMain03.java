public class IfMain03 {
	public static void main (String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("���� �� �� �Է�:");
		int a = input.nextInt();
		if(a>0)//a�� 0���� ũ��	
			System.out.println(a + "�� ����Դϴ�.");
		else if(a<0)//a�� 0���� ������
			System.out.println(a + "�� �����Դϴ�.");
		else
			System.out.println("0 �Դϴ�.");
			
		input.close();
	}
}
