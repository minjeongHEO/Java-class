package kr.s04.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BufferedReaderMain02 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("file.txt");
			br = new BufferedReader(fr);//파일리더보다는 양이 많을 떄 버퍼드리더가 성능이 더좋음
										//파일리더만 사용해도 되고 버퍼드리더와 연계해서 사용하도 됌
			
			//라인바이라인으로 읽어올수있으니까 루프를 돌면서 한라인의 데이터를 읽어온다
			String msg;
			while((msg= br.readLine())!=null) {
				System.out.println(msg);
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();

		}finally {
			if(br!=null)try {br.close();} catch(IOException e) {}
			if(br!=null)try {fr.close();} catch(IOException e) {}
		}
	}
}
