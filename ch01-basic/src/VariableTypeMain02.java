public class VariableTypeMain02 {
	public static void main(String[] args) {
//		char single=''';//���� ����ǥ�� Ư�������̱� ������ �������ø� �ٿ��� �Ϲݹ��ڷ� �ٲ���� ����� �ȴ�
		char single='\'';// Ư������' -> �Ϲݹ���\'
		System.out.println(single);
		
//		String str = "������ "����"�� �� �Ϳ�!";//���￡ ū����ǥ�� ����ϰ��� �Ѵٸ� �տ� �������ø� �־� �Ϲݹ��ڷ� �ٲ��ش�
		String str = "������ \"����\"�� �� �Ϳ�!";
		System.out.println(str);
		
//		���ڿ� ���� Ư������ '�� �ڵ����� �Ϲݹ��ڷ� ��ȯ�ȴ�
		String str2 = "������ '�����'�Դϴ�.";//���� \ �ٿ��� �ʿ䰡 ����
		System.out.println(str2);
		
//		String root = "C:\javawork\";		
		String root = "C:\\javawork\\";// Ư������\ -> �Ϲݹ���\\
		System.out.println(root);
		
		String str3 = "������ �ݿ���\n�𷹴� �����";
		System.out.println(str3);
		
		String str4 = "�̸�\t����\t���";//�������� ���� tab���
		System.out.println(str4);
		
	}
	
}
