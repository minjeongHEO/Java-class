package kr.s04.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {
	public static void main(String[] args) {
		FileReader fr = null;
		int readChar;
		try {
			//문자 입력 스트림 //2바이트씩 처리해야되니까 유니코드로 변환시켜서 처리됨
			fr = new FileReader("file.txt"); //파일리더와 버퍼드리더의 차이점확인해보기 BufferedReaderMain02
			//파일로부터 데이터를 한 문자씩 읽어들여 유니코드로 반환
			while((readChar = fr.read())!=-1) {
				System.out.print((char)readChar);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fr!=null) try { fr.close();} catch(IOException e) { }
		}
}
}
