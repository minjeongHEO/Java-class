public class Score {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int korean,english,math,sum;
		char grade; //string char����
		double avg;
		
		do {
			System.out.print("���� : ");
			korean = input.nextInt();
		}while(korean <0 || korean > 100); //0~100�Է½� ���ǹ� false��  do���� �������� 
											//���ǹ� true�� ������������.(-100,200���)		
		do {
			System.out.print("���� : ");
			english = input.nextInt();
		}while(english < 0 || english > 100);
		
		do {
			System.out.print("���� : ");
			math = input.nextInt();
		}while(math < 0 || math > 100);
		
		//���� ���ϱ�
		sum = korean + english + math;
		//��� ���ϱ�
		avg = sum/3.0; //float�������̹Ƿ� 3.0f�� ���
		
		//��� ���ϱ�
//		switch�������� �񱳿�����, �������� �� �� ����.
		switch((int)(avg/10)){//0~100������ 10���� ������ 10���θ���� float�����͸� int�� ��ȯ
		case 10://100	
//			grade = 'A';break; case 9�� ����� �����Ƿ� ����� �ۼ��� �� �ִ�.
		case 9://90~99	
			grade = 'A';break;
		case 8://80~89	
			grade = 'B';break;
		case 7://70~79	
			grade = 'C';break;
		case 6://60~69	
			grade = 'D';break;
		default:
			grade = 'F'; //������ ���� üũ�� �س��� �����ǰų� 100�� ���� �� ����.
		}
			
		System.out.println();//�ܼ� �ٹٲ�	
		System.out.printf("���� = %d\n", sum);//�ܼ� �ٹٲ�	
		System.out.printf("��� = %.2f\n", avg);//�ܼ� �ٹٲ�	
		System.out.printf("��� = %c\n", grade);//�ܼ� �ٹٲ�	
		
		
		input.close();
	}

}
