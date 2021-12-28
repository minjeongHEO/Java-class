package kr.s01.inetaddress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain02 {
	public static void main(String[] args) {
		BufferedReader br= null;
		String url = null;
		InetAddress[] addresses;//�������� ������ �ޱ����ؼ� �迭�� 
		
		try {
			//�Է����޾ƺ���
			br= new BufferedReader(new InputStreamReader(System.in));
			System.out.print("������Ʈ ������ �Է�: ");
			url = br.readLine();
			
			//�ش� �����ΰ� ���εǾ��ִ� ��� �ּ������� InetAddress[]�� ��ȯ
			addresses = InetAddress.getAllByName(url);
			for(int i=0;i<addresses.length;i++) {
				System.out.println("ȣ��Ʈ �̸�: "+ addresses[i].getHostName()
								+ ", IP�ּ�: "+ addresses[i].getHostAddress());//�����ȸ���� �ٷ������ؼ� ȣ��
				
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
}
