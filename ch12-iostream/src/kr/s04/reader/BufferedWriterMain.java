package kr.s04.reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterMain {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("bufferedWriter2.txt");
			bw = new BufferedWriter(fw);
			bw.write("BufferedWriter �׽�Ʈ�Դϴ�");
			bw.newLine();//��������(���osȯ�濡�� ��밡����) �ٹٲ� 
			bw.write("�ȳ��ϼ���"+ 
				System.getProperty("line.separator")+"������");//line.separator:�ٹٲ����ִ� ���ڸ� os�� �°� �ҷ���
			//���ۿ� ������ ���� ������ ���Ͽ� ���
			bw.flush();
			
			System.out.println("������ �����ϰ� ���Ͽ� ������ ����մϴ�");
			
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			//�ڿ�����
			if(bw!=null) try { bw.close();} catch(IOException e) {}
			if(bw!=null) try { fw.close();} catch(IOException e) {}
		}
	}
}
