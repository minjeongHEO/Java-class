package kr.s04.reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterMain {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("bufferedWriter2.txt");
			bw = new BufferedWriter(fw);
			bw.write("BufferedWriter 테스트입니다");
			bw.newLine();//범용적인(모든os환경에서 사용가능한) 줄바꿈 
			bw.write("안녕하세요"+ 
				System.getProperty("line.separator")+"하하하");//line.separator:줄바꿈해주는 문자를 os에 맞게 불러옴
			//버퍼에 내용을 비우고 내용을 파일에 출력
			bw.flush();
			
			System.out.println("파일을 생성하고 파일에 내용을 출력합니다");
			
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			//자원정리
			if(bw!=null) try { bw.close();} catch(IOException e) {}
			if(bw!=null) try { fw.close();} catch(IOException e) {}
		}
	}
}
