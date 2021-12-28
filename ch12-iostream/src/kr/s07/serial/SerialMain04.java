package kr.s07.serial;

import java.io.FileInputStream;//�����б�
import java.io.ObjectInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.ArrayList;

public class SerialMain04 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("userInfo.ser");
			ois = new ObjectInputStream(fis);
			
			//������ȭ �۾� ����
			ArrayList<UserInfo> list = (ArrayList<UserInfo>)ois.readObject();
			
			//���������� ����ϸ� ����Ʈ�� �ѹ��� �� �����ִ� / UserInfo���� ����Ʈ�����������ؼ� list�� �ҷ��� ���� �ִ�.
			System.out.println(list);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {// import���ص� ��/ readobject�Ҷ� ��������
			e.printStackTrace();
		}finally {
			if(ois!=null)try {ois.close();}catch(IOException e){}
			if(fis!=null)try {fis.close();}catch(IOException e){}
		}
	}
		
}
