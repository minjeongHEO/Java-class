public class WhileMain03 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("�� �Է�: ");

		int dan = input.nextInt();
		System.out.println(dan + "��");
		System.out.println("--------------");
		int i = 1;
		while(i<=9) {
			System.out.println(dan + "*" + i + "=" + dan*1);
			i++;
			
		}
		
		input.close();
		
	}

}
