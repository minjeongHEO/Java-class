package kr.s07.serial;

import java.io.FileOutputStream; //���ϸ���¿���
import java.io.IOException;
import java.io.ObjectOutputStream; //����ȭ���ִ¿���

public class SerialMain01 {
	public static void main(String[] args) {
		System.out.println("======��ü ����ȭ ����=====");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		//����ȭ�� ��ü ����
		Customer c = new Customer("ȫ�浿");
		
		//�۾� ����
		try {
			fos = new FileOutputStream("object.ser");//�Ǵ� object.dat
			oos = new ObjectOutputStream(fos);
			//��ü ����ȭ����
			oos.writeObject(c);
			
			System.out.println("��ü ����ȭ�� �Ϸ�Ǿ����ϴ�.");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(oos!=null) try {oos.close();}catch(IOException e) {}
			if(fos!=null) try {fos.close();}catch(IOException e) {}
		}
	}
}
