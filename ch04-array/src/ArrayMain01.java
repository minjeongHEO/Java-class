public class ArrayMain01 {
	public static void main(String[] args) {
		//�迭 ���� (�����ؼ��� ��������Ծƴϴ�. ������ �ؾ��Ѵ�.)
		char[] ch;
		//�迭 ����
		ch = new char[4];
		//�迭�� �ʱ�ȭ
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		//�迭�� ���(�迭�� ����� ������) ���
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		System.out.println("----------------");
		
		//�ݺ����� �̿��� �迭�� ��� ���
					//�迭�� ����(4) �ε����� 0���� �����ϹǷ� length�� �����ϸ� �ȉ�
		for(int i=0;i<ch.length;i++) {
			System.out.println("ch[" +i+ "]:" + ch[i]);
		}
		System.out.println("-----------------");
		//�迭 ���� �� ����
//		int it[] = new int[6];// [] ��ġ�� �Ѵ� ��� �����ϴ�.
		int[] it = new int[6];//�ʱ갪���� ������ ��쿡 0�� �����ִ�
								//���� �⺻�ڷ����� ���� ����
		System.out.println(it[0]);
		System.out.println(it[1]);
		System.out.println(it[2]);
		System.out.println(it[3]);
		System.out.println(it[4]);
		System.out.println(it[5]);
		System.out.println("-----------------");
		
		//�迭 ���� �� ����(����� �迭 ����), �ʱ�ȭ
		char[]ch2 = new char[] {'J','A','V','A'};
//		char[]ch2 = new char[4] {'J','A','V','A'};// �ʱ�ȭ �ҋ��� �ڵ� ī�����ϹǷ� 4 ������ ��������
		
		//�迭 ���� �� ����(�Ͻ��� �迭 ����), �ʱ�ȭ
		char[] ch3 = {'��','��'};
		
		
	}

}
