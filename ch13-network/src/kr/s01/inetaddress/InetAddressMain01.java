package kr.s01.inetaddress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		String url = null;//���⼭�� Try���� �־ �������
		InetAddress iaddr = null;//���⼭�� Try���� �־ �������
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("������Ʈ ������ �Է�: ");
			url = br.readLine();//bufferread�� ��Ʈ���� ������θ޼����ִ°Ű���
			
			iaddr = InetAddress.getByName(url);//�ּҿ� ���� ������ �����´� ���̳ݾ�巹�� ��ü�� ��ȯ �տ� Ŭ�������־ ����ƽ�� ����
			
			System.out.println("ȣ��Ʈ �̸�: "+ iaddr.getHostName());
			System.out.println("ȣ��Ʈ ip �ּ�: "+ iaddr.getHostAddress());
			
			System.out.println("--------------------------");
			
			//���� ȣ��Ʈ IP �ּ� ���ϱ�
			iaddr = InetAddress.getLocalHost();
			
			System.out.println("���� ȣ��Ʈ �̸�: "+ iaddr.getHostName());
			System.out.println("���� ȣ��Ʈ ip�ּ� : "+ iaddr.getHostAddress());
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
}
