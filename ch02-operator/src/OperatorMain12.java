public class OperatorMain12 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("��ǰ�� �Է�: ");
		String a = input.next();
//		System.out.println(a);
		System.out.print("�ܰ� �Է�: ");
		int b = input.nextInt();
//		System.out.println(b);
		System.out.print("�Ǹ� ���� �Է�: " );
		int c = input.nextInt();
//		System.out.print(c);
		
//		double s = b * 0.85 * c; //������
		int s = (int)(b * 0.85 * c);
		
//		System.out.printf("%s %d ���� ������ %,d��", a,c,(int)s); //������
		System.out.printf("%s %d ���� ������ %,d��", a,c,s);
		
		
		input.close();
		
		
	}

}
