package kr.s01.string;

public class StringBufferMain {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("���� ����!!");
		System.out.println("1: " + sb);//��������sb.toString���Ȱ������� �ٵ� ������ �Ǿ �������ȳ��´°�
		//���ϴ� �ε����� ���ڸ� �߰�
				//�ε���,�߰��ϴ¹���
		sb.insert(2, '��');//��ü���ƴ϶� �����ִ� ��
		System.out.println("2: "+sb);
		//���� ���ڿ� �ڿ� ���ڿ� �߰�
		sb.append("������ ");
		System.out.println("3: "+ sb);
		sb.append("�ÿ��ϴ� ");
		System.out.println("4: "+ sb);

		//�����ε������� ���ε��� ��(�̸�)������ ���ڿ��� ������ ��ü���ڿ��� �ٲ۴�
		sb.replace(0,3,"���డ��!!");//��ŸƮ�ε���, �����ε���, ��ü�ҹ��ڿ�
		System.out.println("5: "+sb);
		
		sb.deleteCharAt(0);//�ش��ε����� ���ڸ� ����
		System.out.println("6: "+ sb);
		
		sb.delete(0, 3);//��ŸƮ�ε���, �����ε���-1 ����
		System.out.println("7: "+ sb);
		
		//StringBuffer -> String ��ȯ
		//Ÿ�Ը� �ٲ��� ��°��� ����
		String str = sb.toString();
		System.out.println(str);
		
	}
}
