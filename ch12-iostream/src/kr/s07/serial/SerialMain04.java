package kr.s07.serial;

import java.io.FileInputStream;//파일읽기
import java.io.ObjectInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.ArrayList;

public class SerialMain04 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("userInfo.ser");
			ois = new ObjectInputStream(fis);
			
			//역직렬화 작업 수행
			ArrayList<UserInfo> list = (ArrayList<UserInfo>)ois.readObject();
			
			//참조변수를 출력하면 리스트를 한번에 쭉 볼수있다 / UserInfo에서 투스트링을재정의해서 list만 불러도 볼수 있다.
			System.out.println(list);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {// import안해도 됨/ readobject할때 에러생김
			e.printStackTrace();
		}finally {
			if(ois!=null)try {ois.close();}catch(IOException e){}
			if(fis!=null)try {fis.close();}catch(IOException e){}
		}
	}
		
}
