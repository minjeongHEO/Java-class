package kr.s03.output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferdOutputStreamMain {
	public static void main(String[] args) {
//		FileOutputStream fos = new FileOutputStream();//���ܰ� �߻��� ���־ new FileOutputStream()������ Ʈ�����ʿ� �־��ش�
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("buffeOut.txt");
			bos = new BufferedOutputStream(fos);//����~��ü�� ���۵�~��ü�� �Ѱ���
			
			String str = "BufferedOutputStream Test �Դϴ�.";//�����͸� �����ϱ� ���ؼ� ���ڿ��� �����
					//String -> byte[]
			bos.write(str.getBytes());//���ۿ��� ����Ѱ� �׷��� ���۸� ���鼭 ����(�÷���)�ؾ��Ѵ�
			bos.flush();//���۸� ���� ���ۿ� �ִ� �����͸� ���Ͽ� ��� ��������쿡 ������txt.���Ͽ� �ƹ��͵� �ȶ��ִ�.
			
			System.out.println("������ �����ϰ� ���Ͽ� ������ ����մϴ�.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//BufferedOutputStream�� close�޼���� �ڿ������ϱ����� -
			//- buffer�� üũ�ؼ� �÷��ð��ȉ°� ���������� flushó���Ѵ�(�÷��ô��� ���� ���)
			if(bos!=null)try {bos.close();} catch(IOException e){}//���߿� ����� ���� �������ش�
			if(fos!=null)try {fos.close();} catch(IOException e){}//���߿� ����� ���� �������ش�
			
		}
		
	}
}
