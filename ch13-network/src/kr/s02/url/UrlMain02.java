package kr.s02.url;

import java.io.BufferedReader;//��Ʈ��ũ�κ��� �Է¹޾Ƽ� ������ �޴´�
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;

public class UrlMain02 {
	public static void main(String[] args) {
		URL url = null;
		BufferedReader br = null;
		String address = "https://www.naver.com/index.html";
		String line = "";
		
		try {
			url = new URL(address);
															//InputStream, ĳ���ͼ�
			br = new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));//url�ȿ� �޼ҵ尡�ִ� openStream()��� �ڷ����� ��ǲ��Ʈ��= ����Ʈ�ε� InputStreamReader�� ���ڽ�Ʈ������ ����
//					meta charset="utf-8"���ڵ������ �����ؾ� �ѱ��� �ȃ����� ����/ EUC-KR�� �ѱ�����
			
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			if(br!=null) try {br.close();}catch(IOException e) {}
		}
	}
}
