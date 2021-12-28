package kr.s04.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BufferedReaderMain02 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("file.txt");
			br = new BufferedReader(fr);//���ϸ������ٴ� ���� ���� �� ���۵帮���� ������ ������
										//���ϸ����� ����ص� �ǰ� ���۵帮���� �����ؼ� ����ϵ� ��
			
			//���ι��̶������� �о�ü������ϱ� ������ ���鼭 �Ѷ����� �����͸� �о�´�
			String msg;
			while((msg= br.readLine())!=null) {
				System.out.println(msg);
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();

		}finally {
			if(br!=null)try {br.close();} catch(IOException e) {}
			if(br!=null)try {fr.close();} catch(IOException e) {}
		}
	}
}
