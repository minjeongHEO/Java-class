package kr.s01.string;

public class StringMain03 {
	public static void main(String[] args) {
		String s1 = "  aBa  ";
		String s2 = "abc";
		int a = 100;
		String msg = null;
		
		msg = s1.toUpperCase();//�ҹ��� -> �빮��
		System.out.println("msg:"+msg);
		
		msg = s1.toLowerCase();//�빮�� -> �ҹ���
		System.out.println("msg:"+msg);
		
		//Ư�� ���ڿ��� ���ο� ���ڿ��� ��ü
		msg = s1.replace("aB", "b"); //old���ڸ� new���ڷ� �ٲ��ش�
		System.out.println("msg: "+msg);
		
		msg = s1.trim();
		System.out.println("msg: "+msg);//�����̶�°��� �����ͷ� �����Ǵµ�� �װ� �����ϰ������
		
		//�˻��ϴ� ���ڿ����� ���ڿ� ���޵� ���ڿ��� ������ true
		boolean f = s1.contains("aB");
		System.out.println("f: "+f);
		//���ڿ��� ���ڿ� ���޵� ���ڿ��� �����ϸ� true
		f = s2.startsWith("ab");
		System.out.println("f: "+f);
		//���ڿ��� ���ڿ� ���޵� ���ڿ��� ������ true
		f = s2.endsWith("ab");
		System.out.println("f: "+f);
		
		//int->String ��ȯ(parsing)
		String msg2 = String.valueOf(a);
		String msg3 = a+""; //"":���ڿ�: ���ڿ���ü�� �ʱ�ȭ�Ҷ�, ���ڿ��� ��ȯ��ų��
		

	}
}
