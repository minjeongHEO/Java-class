package kr.s01.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain02 {
	public static void main(String[] args) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd a hh:mm");
		String path = "C:\\"; //��Ģ�� �����ηγ־���Ѵ�.ex)C:\\javaWork\\sample.txt
		File f = new File(path);
	
	//������ ����� �������丮 �� ���� ���� File[]�� ��ȯ
		File[] files = f.listFiles();
		
		String attribute ="";//�̰� ���ι�ȯ�Ѵ��ſ���?
		
		String size ="";
		String name ="";
		
		for(int i=0;i<files.length;i++) {
			//File�迭���� File�� ��ȯ
			File f2 = files[i];
			name = f2.getName();//�����ϼ��� ���丮�ϼ����ִ�
			
//			���丮�����ƴ��� �˾Ƴ����� ���丮�� �뷮������ ���� ���丮=����
			if(f2.isDirectory()) {//���丮��
				size = "0";
				attribute = "DIR";
			}else {//�����̸�
				size = f2.length() + "";//������long���� ��ȯ�ؼ� size ��Ʈ��(��ܿ� ��Ʈ��������������)�� �ȵ��� ���ڿ��� ��ȯ
				attribute = f2.canRead() ? "R" : " ";
				attribute += f2.canWrite() ? "W" : " ";
				attribute += f2.isHidden() ? "H" : " ";
			}
			
			System.out.printf("%s %3s %6s %s\n", sf.format(new Date(f2.lastModified())),//������ ���� ���� �ð��� longŸ������ ��ȯ �׷��� �װ��� ����ƮŬ�������� ��ȯ�� ��Ų��.
//					(��ܿ� ������)���õ���Ʈ�������� ����������µǴ��Ÿ� ������߽����� �ѱ۷� �ٲ��ش� sf.format
															attribute,size, name);
			
		}
		
		}
	


}
