package kr.s02.url;

import java.net.URL;//urlŬ������ ��� 
import java.net.MalformedURLException;//url�� ������ ���Ŀ� �¾ƾ��Ѵ�. ���Ĵٸ��� ���ܰ� �߻�

public class UrlMain01 {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://java.sun.com/index.jsp?name=dragon#content");//������ �����ּҾƴϾ �ǰ� ���ĸ� ������ȴ�
			//MalformedURLException���߻��Ҽ��ֵ��� ���� �ǹ������� Ʈ����ĳġ�Ѵ�
			System.out.println("��������: "+ url.getProtocol());
			System.out.println("ȣ��Ʈ: "+ url.getHost());//�������� ������� ip�� �ٷ� �����ϸ� java.sun.com��� ex)192.168.0.1
			System.out.println("�⺻ ��Ʈ: "+ url.getDefaultPort());//��ð� �ȵ��־ (http)���������� �⺻��Ʈ�� �˼��ֵ�
			System.out.println("��Ʈ: "+ url.getPort());//��Ʈ�� ��� ���Ұ�� -1 ��ȯ
			System.out.println("�н�: "+ url.getPath());
			System.out.println("����: "+ url.getQuery());//Ű�� ����� ��/ ������ ���ؼ� �巡���� ȣ��
			System.out.println("ref: "+ url.getRef());//#�ڿ� ����
			
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		
		
	}
}
