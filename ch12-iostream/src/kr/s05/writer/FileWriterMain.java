package kr.s05.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			//덮어쓰기
			fw = new FileWriter("fileWriter.txt");

			//이어쓰기
//			fw = new FileWriter("fileWriter.txt",true);
			
			String message = "안녕하세요 FileWriter 테스트입니다.";
			
			fw.write(message);
			//버퍼의 내용을 비우고 내용을 파일에 출력함
			fw.flush(); //flush없고 close()도 없으면 파일에 내용이 생기지않음
			System.out.println("파일을 생성하고 내용을 입력");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
//			if(fw!=null)try {fw.close();}catch(IOException e) {}
		}
	}
}
