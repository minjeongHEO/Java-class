package kr.s04.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderMain01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			//InputStreamReader : ����Ʈ��Ʈ�� -> ���ڽ�Ʈ�� ��ȯ���Ѽ� BufferedReader�� ����
			br = new BufferedReader(new InputStreamReader(System.in) );//����Ʈ��Ʈ���� �⺻ (1����Ʈ�Է��ϴ� system.in)inputstreamreder�� ����Ʈ��Ʈ���� ��Ʈ��Ʈ������ ��ȯ��Ŵ 
			
			System.out.print("����� �̸�> ");
			String name = br.readLine();//���۵帮�����������ִ� ������θ޼ҵ�� ���̿��ͼ����� �߻��� �� �����ϱ� Ʈ����ĳġ�� ������Ѵ�
			System.out.println(name);
			
			//���ڷ� �Է¹��� ���
			System.out.print("����� ����> ");
					//String -> int ��ȯ (�Ľ�)
			int age = Integer.parseInt(br.readLine());
			System.out.println(age);
		}catch(NumberFormatException e) { //Integer.parseInt�� ����
			e.printStackTrace();			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			if(br!=null)try {br.close();} catch(IOException e) {}
		}
	}
}
