package kr.s07.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList; //어레이이스트로 시리얼라이즈 임플리먼트해야 직렬화가능

public class SerialMain03 {
	public static void main(String[] args) {
		FileOutputStream fos = null; //fos:주소가저장되는 변수=> 참조변수 FileOutputStream:변수를 사용하게되면 반드시 자료형을 붙인다 => 참조자료형(클래스명을 사용)
		ObjectOutputStream oos = null;//null:객체가 생성안돼서 주소가 없다 초기화할떄 null사용가능
		
		//직렬화 할 객체 생성
		UserInfo u1 = new UserInfo("John",20,"서울시");
		UserInfo u2 = new UserInfo("Sunny",18,"부산시");
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		
		list.add(u1);
		list.add(u2);
		
		try {
			fos = new FileOutputStream("userInfo.ser");
			oos = new ObjectOutputStream(fos);
			
			//객체 직렬화 수행
			oos.writeObject(list);
			
			System.out.println("객체 직렬화가 성공적으로 완료되었습니다.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(oos!=null)try {oos.close();}catch(IOException e) {}
			if(fos!=null)try {fos.close();}catch(IOException e) {}
		}
		
	}
}
