public class BreakMain02 {
	public static void main(String[] args) {
//		���� �ݺ���
		for(int i =0;i<3;i++) {
			for(int j=0;j<5;j++) {
				if(j == 3)
					break;
				
				/*
				 * break�� Ư�� ������ �� �ݺ����� ��������
				 * ���� �ݺ����� �� ��ü �ݺ����� ���������� ���� �ƴ϶�
				 * break�� ���ԵǾ� �ִ� �ݺ����� ��������
				 */
			
				System.out.println("i= "+ i + ", j =" + j);
			}
		}	
	}

}
