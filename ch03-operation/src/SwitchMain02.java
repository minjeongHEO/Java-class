public class SwitchMain02 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("���� �Է� : ");
		String season = input.next();
		
		switch(season) {
		case"��":
			System.out.println("���� �Ǵ� ����");
			break;
		case"����":
			System.out.println("�߰ſ� �¾��� ����");
			break;
		case"����":
			System.out.println("���ٶ��� �δ� ����");
			break;
		case"�ܿ�":
			System.out.println("���� ������ ����");
			break;
		default:
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
		
		
		input.close();
		
	}

}
