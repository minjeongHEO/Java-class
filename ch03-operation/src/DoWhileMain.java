public class DoWhileMain {
	public static void main(String[] args) {
		//while���� ������ do-while���� ���ǿ� ������쿡 �ι� ����� ���� �մ�.
		String str="Hello world";
		int su = 0;
		
		while(su++ < 5) { // ���ǽ� �ȿ� ������ ��� �����ϴ�.
			System.out.println(str);
		}
		
		System.out.println("-----------");
		int su2=0;
		do {
			System.out.println(str);
		}while(su2++ <5); // do-while������ ��������;�ʼ�!!!!
				
	}

}
