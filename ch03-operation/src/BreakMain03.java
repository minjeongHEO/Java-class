public class BreakMain03 {
	public static void main(String[] args) {
		//		���� �ݺ������� break���̺� ���
		
		exit_for: //break ���̺� ������ �� ; �ƴ϶� :���� ����ģ��.
		for(int i =0;i<3;i++) {
			for(int j=0;j<5;j++) {
				if(j == 3)
					break exit_for; //break�ڿ� ���̺��� ����ϸ�
									//���̺��� ������ for���� ��������

				/*
				 * break�� Ư�� ������ �� �ݺ����� ��������\
				 * ���� �ݺ����� �� ��ü �ݺ����� ���������� ���� �ƴ϶�
				 * break�� ���ԵǾ� �ִ� �ݺ����� ��������
				 */

				System.out.println("i= "+ i + ", j =" + j);
			}
		}	
	}
}
