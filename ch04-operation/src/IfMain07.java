public class IfMain07 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ��������� �Է��ϰ� �� ���̸� ����ϴ� ���α׷��ۼ�
		 * �� ���� = (����⵵ - ����) - (������ �������� 0/����������1)
		 * 
		 * [��¿���]
		 * ���� �Է�: 2001
		 * �� �Է� : 10
		 * �� �Է�: 20
		 * �� ���̴� ? �Դϴ�.
		 * < pinos71@daum.net >
		 */
		int thisYear = 2021;
		int thisMonth = 11;
		int thisDate = 3;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		int year,month,date;
		
		do{
			System.out.print("���� �Է�: ");
			year = input.nextInt();
		}while(year<1 || year>9999);
		
		do {
			System.out.print("�� �Է�: ");
			month = input.nextInt();
		}while(1>month || month>12); 
			
		do {
			System.out.print("�� �Է�: ");
			date = input.nextInt();
		}while(date>31);
		
		int age = thisYear-year;
		if(thisMonth <= month) {
			if(thisDate < date) {
				age -= 1;
			}
		}
		/*if(thisMonth < month) {
			age--;
		}else if (thisMonth == month){
			if(thisDate < date) {
				age -= 1;
			}
		}*/
		
		System.out.printf("�� ���̴� %d�� �Դϴ�.", age);
		
		input.close();
		
	}

}
