package kr.s01.string;

public class StringMain02 {
	public static void main(String[] args) {
		String s1 = "kwon sun ae";
				   //012345678910, ���� 11
		
		int index = s1.indexOf('n');
		System.out.println("�� ó�� ���� n�� ��ġ: "+index);
		
		index = s1.indexOf("sun");
		System.out.println("���� sun�� ��ġ: "+index); //567��ȯ �ƴ� �ϳ��� ��ȯ����
		
		index = s1.lastIndexOf("n");
		System.out.println("������ ���� sun�� ��ġ: "+index); 
		
		char c = s1.charAt(index);
		System.out.println("������ ����: "+c);
		
		index = s1.indexOf('s');//����ڴ¾�� -1���
		System.out.println(index);
		String str = s1.substring(index);//������ index���� ������index������ ���ڿ�����
		System.out.println("�ҹ���s���� ������ ���ڿ� ����: "+ str);
		
		//���� �ε������� �� �ε��� �������� ���ڿ� ����
		str = s1.substring(index,index+3);//5,8
		System.out.println("�ε���5���� �ε���8������ ���ڿ� ����: "+ str);
		
		int length = s1.length();
		System.out.println("s1�� ����: "+ length);
		
		String[] array = s1.split(" ");
		for(int i=0; i<array.length;i++) {
		System.out.println(("array["+i+"]:"+array[i]));
		}
		
		
	}
}
