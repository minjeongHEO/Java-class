public class OperatorMain11 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);//�Է��� ���� �� �ִ� ���°� ��
		
		System.out.print("���� :");
		int Korean = input.nextInt();//������ �Է¹���
		
		System.out.print("���� :");
		int English = input.nextInt();//������ �Է¹���
		
		System.out.print("���� :");
		int Math = input.nextInt();//������ �Է¹���
		
		int sum= Korean+English+Math;
		
//		double avg= sum/3; //double�����ͷ� �ٲ�� �Ҽ����ڿ��� ����� ���´�.
		
		double avg= sum/3.0;/* �Ǵ� (double)sum/3;
							sum�� �ڷ����� int->double�� ����ȯ�Ǿ� �Ǽ�/�Ǽ�=>�Ǽ�*/
		
		System.out.println("���� = "+Korean);
		System.out.println("���� = "+English);
		System.out.println("���� = "+Math);
		System.out.println("���� = "+sum);
		System.out.printf("��� = %.2f",avg);//s��f�򰥸�
		
		
		input.close();//�Է��� �������� �ǹ��Ѵ�.
		
		
	}

}
