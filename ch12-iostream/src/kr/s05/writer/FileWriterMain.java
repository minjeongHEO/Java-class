package kr.s05.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			//�����
			fw = new FileWriter("fileWriter.txt");

			//�̾��
//			fw = new FileWriter("fileWriter.txt",true);
			
			String message = "�ȳ��ϼ��� FileWriter �׽�Ʈ�Դϴ�.";
			
			fw.write(message);
			//������ ������ ���� ������ ���Ͽ� �����
			fw.flush(); //flush���� close()�� ������ ���Ͽ� ������ ����������
			System.out.println("������ �����ϰ� ������ �Է�");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
//			if(fw!=null)try {fw.close();}catch(IOException e) {}
		}
	}
}
