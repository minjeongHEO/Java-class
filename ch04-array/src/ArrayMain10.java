public class ArrayMain10 {
	public static void main(String[] args) {
		//������ �����
		/*
		 * ���� �Է¹޾Ƽ� 1~9���� ���ؼ� ������� ���ϰ� �迭�� �װ��� ������ �� 
		 * ������ ��� ����(2*1=2)���� �迭���� ���� �ҷ��� ���.
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int[] array = new int[9];
		
		System.out.print("�� �Է�>");
		int dan = input.nextInt();
		
		for(int i=1;i<=array.length;i++) {
			array[i-1]= dan*i;
			System.out.println(dan +" * " + i + " = " + array[i-1]);
		}
		
		input.close();
	}
}
