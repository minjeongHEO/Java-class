
public class PrintMain05 {
	public static void main(String[] args) {
//		System.out.printf(���˹���, ������);�� �̿��� ��� (�������� ������ ǥ���� �� �ִ� ���� ���� ����)
		
		System.out.printf("%c\n",'a');//(�ٹٲ�\n) printf, ln ���� �ٹٲ� �� �� �ִ� Ư������
		System.out.printf("%c%n",'b');//(�ٹٲ�%n) printf������ �ٹٲ� �� �� �� �ִ� ���˹���
		System.out.printf("%6c%n",'c');//(6�ڸ� Ȯ�� �� ������ ����)
		System.out.printf("%6c\n",'c');//(6�ڸ� Ȯ�� �� ������ ����)
		System.out.printf("%-6c\n",'c');//(6�ڸ� Ȯ�� �� ���� ����)
		System.out.printf("%c",'d');//(���˹���,������)
		
		//����
		System.out.printf("%d\n",60);
		System.out.printf("%,d\n",60000);//3�ڸ� ������ ��ǥ ǥ��
		System.out.printf("%,d��\n",60000);//3�ڸ� ������ ��ǥ ǥ��, ���� ���δ�
		System.out.printf("%,5d\n",20);//5�ڸ��� ��� �����ʺ��� ǥ��
		System.out.printf("%-5d\n",20);//5�ڸ��� ��� ���ʺ��� ǥ��
		
		System.out.println("============================");
		
		//�Ǽ�
		System.out.printf("%f\n",35.896);//�⺻������ �Ҽ��� �ڸ� 6�ڸ� ���
		System.out.printf("%.2f\n",35.896);//�ݿø� �� �Ҽ��� ��°�ڸ����� ��� 
		System.out.printf("%.3f\n",35.896);//�ݿø� �� �Ҽ��� ��°�ڸ����� ��� 
		System.out.printf("%10.2f\n",35.896);//10�ڸ��� ��� �����ʺ��� ǥ�� ��, �Ҽ��� �Ѥ��ڸ����� ���
		
		System.out.println("============================");
		
		//���ڿ�
		System.out.printf("%s%n", "����");

		System.out.printf("%s�� %d�� �Դϴ�.\n", "����",98);//���˹��ڰ� ������� ����. �����߿�
		
		//����
		System.out.printf("%b", true);
		
//	���ڸ� ����� ���� f ��κ��� ln	
	}
	

}
