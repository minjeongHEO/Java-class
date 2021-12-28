package kr.s02.url;

import java.net.URL;//url클래스를 사용 
import java.net.MalformedURLException;//url을 쓰려면 형식에 맞아야한다. 형식다르면 예외가 발생

public class UrlMain01 {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://java.sun.com/index.jsp?name=dragon#content");//지금은 실제주소아니어도 되고 형식만 맞으면된다
			//MalformedURLException가발생할수있따고 떠서 의무적으로 트라이캐치한다
			System.out.println("프로토콜: "+ url.getProtocol());
			System.out.println("호스트: "+ url.getHost());//도메인이 없을경우 ip로 바로 접근하면 java.sun.com대신 ex)192.168.0.1
			System.out.println("기본 포트: "+ url.getDefaultPort());//명시가 안돼있어도 (http)프토토콜의 기본포트로 알수있따
			System.out.println("포트: "+ url.getPort());//포트를 명시 안할경우 -1 반환
			System.out.println("패스: "+ url.getPath());
			System.out.println("쿼리: "+ url.getQuery());//키와 밸류의 쌍/ 네임을 통해서 드래곤을 호출
			System.out.println("ref: "+ url.getRef());//#뒤에 값만
			
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		
		
	}
}
