package kr.s02.input;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			//�����
			fos = new FileOutputStream("fileout.txt");
			
			//�̾��
//			fos = new FileOutputStream("fileout.txt",true);//������ �ִ� ���뿡�� �̾�� ����
			String message = "Hello File! ���Ͽ� ������ ����մϴ�.";
			
			//���Ͽ� �������
			//getbytes() ��Ʈ���� byte[]�� ��ȯ
			fos.write(message.getBytes());
			//write(int b)�ѱ��ڸ� ��µ� write(byte[] b)����Ʈ�迭�� ��ȯ����Ű�� �ѱ۵� ��°���
			System.out.println("������ �����߽��ϴ�.");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fos!=null)try {fos.close();}catch(IOException e) {}
		}
	}
}
