package kr.s04.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderMain01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			//InputStreamReader : 바이트스트림 -> 문자스트림 변환시켜서 BufferedReader에 전달
			br = new BufferedReader(new InputStreamReader(System.in) );//바이트스트림이 기본 (1바이트입력하는 system.in)inputstreamreder가 바이트스트림을 인트스트림으로 변환시킴 
			
			System.out.print("당신의 이름> ");
			String name = br.readLine();//버퍼드리더가가지고있는 리드라인메소드는 아이오익셉션이 발생할 수 있으니까 트라이캐치를 해줘야한다
			System.out.println(name);
			
			//숫자로 입력받을 경우
			System.out.print("당신의 나이> ");
					//String -> int 변환 (파싱)
			int age = Integer.parseInt(br.readLine());
			System.out.println(age);
		}catch(NumberFormatException e) { //Integer.parseInt의 예외
			e.printStackTrace();			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(br!=null)try {br.close();} catch(IOException e) {}
		}
	}
}
