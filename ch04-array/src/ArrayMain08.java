public class ArrayMain08 {
	public static void main(String[] args) {
		/*Ŭ������ ������ �� main�� ������ args�� ����Ű�� �迭�� 
		 *�����͸� �����ؼ� Ȱ���� �� ����
		 *�迭�� �ڷ��� String�̱� ������ ���ڸ� �����ص� ��� ���ڿ��� ��ȯ�ؼ� �����ϰԵ�
		 */
		System.out.println(args[0] + args[1]);//���ڿ�+���ڿ� = ����x ����o
		System.out.println("--------------");
		
		//���ڿ��� ���ڷ� ��ȯ
		//			String -> int
		int num = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println("�հ� : "+ (num+num2));
		
		}
}
