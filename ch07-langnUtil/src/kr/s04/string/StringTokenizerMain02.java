package kr.s04.string;

import java.util.StringTokenizer;

public class StringTokenizerMain02 {
	public static void main(String[] args) {
		String source = "2021-11-10 11:21:50";
												//������ ������ ����
		StringTokenizer st = new StringTokenizer(source,"- :");//������ ���� �ݷ�
		
		//�����ڸ� ���� ������� ���ڿ��� �ִ��� ����
		while(st.hasMoreTokens()) {
								//�����ڸ� ���� ������� ���ڿ��� ��ȯ
			System.out.println(st.nextToken());
			
		}
	}
}
