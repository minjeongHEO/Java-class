package kr.s02.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException; //���Ϸκ��� �������о���϶� ���Ͼ�����
import java.io.IOException;//�ʼ������


public class FileInputStreamMain {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int readbyte = 0;
		byte[] readbyte2;
		
		try {
			fis = new FileInputStream("file.txt");
			
			//������ ������ �� ���ھ� �о�鿩 �ƽ�Ű �ڵ�� ��ȯ
			//1����Ʈ�� �о�ͼ� �����̿��� ���ڴ� �� ���� �ѱ��� 2byte
			/*while((readbyte = fis.read()) != -1) { //read()�� �����͸� �о �������Ʈ���ִ´� �����Ͱ������� -1�̴�
				System.out.print((char)readbyte);
			}*/
			
			//�����̿��� ���ڵ� ó�������ϰԹ迭�� ����
			readbyte2 = new byte[fis.available()];//available(): �����͸� ����Ʈ���·� �ٲ㼭ȯ�� int�� �ٲ���
			//���Ϸκ��� �Է¹��� �����͸� byte[]�� ����
			fis.read(readbyte2);
			//byte�迭[]�� String���� ��ȯ�۾� 
			System.out.println(new String(readbyte2));
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			//�ڿ�����
			if(fis!=null)try {fis.close();}catch(IOException e) {}
		}
	}
//������ �������Ҷ��� �ݵ�� �������� �ʴ´� Ŭ���
}
