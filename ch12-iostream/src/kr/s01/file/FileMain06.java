package kr.s01.file;

import java.io.File;

public class FileMain06 {
	public static void main(String[] args) {
		System.out.println("===========���丮 ����===========");
		File f1 = new File("C:\\javaWork\\javaSample");
		System.out.println(f1.mkdir());//makedirectory //�ǻ����ϸ� �������־ �޽���ȯ��
		
		System.out.println("===========���丮 ����===========");
		if(f1.delete()) {
			System.out.println(f1.getName()+"���丮�� ������!");
		}else {
			System.out.println(f1.getName()+"���丮�� ������ �� �����ϴ�!");
		}
		
	}
}
