package kr.s04.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {
	public static void main(String[] args) {
		FileReader fr = null;
		int readChar;
		try {
			//���� �Է� ��Ʈ�� //2����Ʈ�� ó���ؾߵǴϱ� �����ڵ�� ��ȯ���Ѽ� ó����
			fr = new FileReader("file.txt"); //���ϸ����� ���۵帮���� ������Ȯ���غ��� BufferedReaderMain02
			//���Ϸκ��� �����͸� �� ���ھ� �о�鿩 �����ڵ�� ��ȯ
			while((readChar = fr.read())!=-1) {
				System.out.print((char)readChar);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fr!=null) try { fr.close();} catch(IOException e) { }
		}
}
}
