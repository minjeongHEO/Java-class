public class WhileMain04 {
	public static void main(String[] args) { //main trl space
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a, total=0;
		
		System.out.println("0������ �Է¹��� ������ �� ���ϱ�");
		System.out.print("������ ���� ������ �Է�:");
		
		while((a = input.nextInt()) != 0) {// 1.�Է°��� a�� �����ϰ�, 
											// 2. a�� ���� 0�� ��(a�� ���� 0�� �ƴϸ� true)
			
			//����
			total += a;
			System.out.print("������ ���� ������ �Է�:");//�� �־�� �Ѵ�.�׷��� ��� �Է��� ���ְ� �Ѵ�.
			
		}
			//������ ������ ���
			System.out.println("total="+total);
			
		input.close();
		/*
		 * whilemain04 -> 05 ��
		 * ������ ���� ������ �Է��� �Ѻκи� ���Եǰ�
		 * while���� ���ǽ��� ������
		 */
		
	
		
	}
}
