package kr.s01.string;

public class StringMain01 {
	public static void main(String[] args) {
		String str1 = "abc";//�Ͻ������� ��ü ����
		String str2 = "abc";//�Ͻ������� ��ü ������ ���ڿ������� ������ ���ξȸ���� ����
//		�� ����� �޸𸮿� �����Ǵ°� �ٸ���.
		
 		//��ü ��(�񱳿����ڸ� ����ؼ� ��)
		if(str1 == str2) {
			System.out.println("str1�� str2�� ���� ��ü");
		}else {
			System.out.println("str1�� str2�� �ٸ� ��ü");
		}
		//���ڿ� ��
		if(str1.equals(str2)) {
			System.out.println("str1�� str2�� ����(���ڿ�)�� ����");
		}else {
			System.out.println("str1�� str2�� ����(���ڿ�)�� �ٸ���");
		}
		
		System.out.println("--------------------------");
		//��������� ��ü ����
		String str3 = new String("hello");//��Ģ�� ��������� ��ü ����
		String str4 = new String("hello");//��Ģ�� ��������� ��ü ������ ���� ���ڿ������̿��� ���� ����
		
		//��ü ��
		if(str3 == str4) {
			System.out.println("str3�� str4�� ���� ��ü");
		}else {
			System.out.println("str3�� str4�� �ٸ� ��ü");
		}
		//���ڿ� ��
		if(str3.equals(str4)) {
			System.out.println("str1�� str2�� ����(���ڿ�)�� ����");
		}else {
			System.out.println("str1�� str2�� ����(���ڿ�)�� �ٸ���");
		}
		
		System.out.println("--------------------------");
		String str5 = "bus";
		String str6 = "Bus"; //==�� ��ҹ��ڱ��� ��
		//���ڿ��� ��ҹ��ڸ� ���������ʰ� �ǹ̻� ��
		if(str5.equalsIgnoreCase(str6)) {
			System.out.println(
					"[��ҹ��� �������� ��]str5�� str6�� ����(���ڿ�)�� ����.");
		}else {
			System.out.println(
					"[��ҹ��� ���о��� ��]str5�� str6�� ����(���ڿ�)�� �ٸ���");
		}
		
	}
}
