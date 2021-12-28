package kr.s02.input;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			//덮어쓰기
			fos = new FileOutputStream("fileout.txt");
			
			//이어쓰기
//			fos = new FileOutputStream("fileout.txt",true);//기존에 있던 내용에서 이어쓰기 여부
			String message = "Hello File! 파일에 내용을 출력합니다.";
			
			//파일에 내용출력
			//getbytes() 스트링을 byte[]로 변환
			fos.write(message.getBytes());
			//write(int b)한글자만 출력됨 write(byte[] b)바이트배열로 변환만시키면 한글도 출력가능
			System.out.println("파일을 생성했습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fos!=null)try {fos.close();}catch(IOException e) {}
		}
	}
}
