package kr.s02.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException; //파일로부터 데이터읽어들일때 파일없을때
import java.io.IOException;//필수적명시


public class FileInputStreamMain {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int readbyte = 0;
		byte[] readbyte2;
		
		try {
			fis = new FileInputStream("file.txt");
			
			//파일의 정보를 한 문자씩 읽어들여 아스키 코드로 반환
			//1바이트씩 읽어와서 영문이외의 문자는 다 깨짐 한글은 2byte
			/*while((readbyte = fis.read()) != -1) { //read()가 데이터를 읽어서 리드바이트에넣는다 데이터가없으면 -1이다
				System.out.print((char)readbyte);
			}*/
			
			//영문이외의 문자도 처리가능하게배열을 생성
			readbyte2 = new byte[fis.available()];//available(): 데이터를 바이트형태로 바꿔서환산 int로 바꿔줌
			//파일로부터 입력받은 데이터를 byte[]에 저장
			fis.read(readbyte2);
			//byte배열[]을 String으로 변환작업 
			System.out.println(new String(readbyte2));
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			//자원정리
			if(fis!=null)try {fis.close();}catch(IOException e) {}
		}
	}
//파일을 엑세스할때는 반드시 생략하지 않는다 클로즈를
}
