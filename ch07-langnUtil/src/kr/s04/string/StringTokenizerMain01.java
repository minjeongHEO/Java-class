package kr.s04.string;

import java.util.StringTokenizer;

public class StringTokenizerMain01 {
	public static void main(String[] args) {
		String source = "100,200,300,400";
												//���ڿ�, ������
		StringTokenizer st = new StringTokenizer(source,",");
		
		//�����ڸ� ���ؼ� ������� ���ڿ��� �ִ��� ����
		while(st.hasMoreTokens()) {
								//�����ڸ� ���ؼ� ������� ���ڿ��� ��ȯ
			System.out.println(st.nextToken());
	
	/*���ø� ��Ʈ������ū������ ���� ���̾�����
	 * (������, ����, �ݷ��� ������)
	 * 2021-11-10 11:21:50
	 * ���ø����� �۾��ϸ� �۾��� �����Ѵ� �����ѹ� �������ѹ� �ݷ��ѹ�
	 * ��Ʈ����ū�������� �������� �����ڸ� �ѹ��� �����Ҽ��־ �ѹ��� �۾�����
	 */
			
		}
	}
}
