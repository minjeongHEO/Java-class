package kr.s01.file;

import java.io.File;

public class FileMain01 {
	public static void main(String[] args) {
		String path = "C:\\"; //Ư�����丮 ����
		
		File f  = new File(path); //���Ͽ� ������ ����
		
		if(!f.exists() || !f.isDirectory()) { //���������ʰų� ���丮���ƴ϶������̰ų�
			System.out.println("��ȿ���� �ʴ� ���丮�Դϴ�.");
			System.exit(0);//����
		}
		
		//������ ���丮�� �������丮 �� ���� ���� �б�
//		�ϳ��� ��ƾ��ؼ� �迭�� �����
		File[] files = f.listFiles(); 
		//���丮�� �ȉ�.���ϸ� �뷮�� ������ ���ֵ�.
		for(int i=0;i<files.length; i++) {
			//File�迭�κ��� File��ü ��ȯ�ؾ� Ȯ���� �� �ִ�.
			File f2 = files[i];
			if(f2.isDirectory()) {//if���� ���� ���丮�� �ǰ�
				System.out.println("["+f2.getName()+"]");//���丮��
			}else {//�������� ���� ������ �ȴ�.
				System.out.print(f2.getName());//���ϸ�
//				�����Ƿ����� �뷮�� ��ȯ ��Ʈ���� ������ ���̸� ��ȯ
				System.out.printf("(%,dbytes)\n",f2.length());//�뷮ǥ��
			}
		}
	}
}
//������� �������ϵ� ���´�
