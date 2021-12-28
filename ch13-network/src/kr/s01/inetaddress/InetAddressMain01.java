package kr.s01.inetaddress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		String url = null;//여기서는 Try블럭에 넣어도 상관없다
		InetAddress iaddr = null;//여기서는 Try블럭에 넣어도 상관없다
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("웹사이트 도메인 입력: ");
			url = br.readLine();//bufferread에 스트링형 리드라인메서드있는거같음
			
			iaddr = InetAddress.getByName(url);//주소에 대한 정보를 가져온다 아이넷어드레스 객체로 변환 앞에 클래스가있어서 스태틱한 변수
			
			System.out.println("호스트 이름: "+ iaddr.getHostName());
			System.out.println("호스트 ip 주소: "+ iaddr.getHostAddress());
			
			System.out.println("--------------------------");
			
			//로컬 호스트 IP 주소 구하기
			iaddr = InetAddress.getLocalHost();
			
			System.out.println("로컬 호스트 이름: "+ iaddr.getHostName());
			System.out.println("로컬 호스트 ip주소 : "+ iaddr.getHostAddress());
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
}
