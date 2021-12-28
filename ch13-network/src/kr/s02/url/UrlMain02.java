package kr.s02.url;

import java.io.BufferedReader;//네트워크로부터 입력받아서 정보를 받는다
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
															//InputStream, 캐릭터셋
			br = new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));//url안에 메소드가있는 openStream()사용 자료형이 인풋스트림= 바이트인데 InputStreamReader가 문자스트림으로 가공
//					meta charset="utf-8"인코딩방식을 지정해야 한글이 안꺠져서 나옴/ EUC-KR은 한글전용
			
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(br!=null) try {br.close();}catch(IOException e) {}
		}
	}
}
