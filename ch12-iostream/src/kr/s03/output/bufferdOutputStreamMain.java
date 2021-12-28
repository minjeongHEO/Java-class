package kr.s03.output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferdOutputStreamMain {
	public static void main(String[] args) {
//		FileOutputStream fos = new FileOutputStream();//예외가 발생할 수있어서 new FileOutputStream()생성은 트라이쪽에 넣어준다
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("buffeOut.txt");
			bos = new BufferedOutputStream(fos);//파일~객체를 버퍼드~객체로 넘겨줌
			
			String str = "BufferedOutputStream Test 입니다.";//데이터를 저장하기 위해서 문자열을 만든다
					//String -> byte[]
			bos.write(str.getBytes());//버퍼에다 출력한것 그래서 버퍼르 비우면서 전송(플러시)해야한다
			bos.flush();//버퍼를 비우고 버퍼에 있는 데이터를 파일에 출력 안했을경우에 생성된txt.파일에 아무것도 안떠있다.
			
			System.out.println("파일을 생성하고 파일에 내용을 출력합니다.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//BufferedOutputStream의 close메서드는 자원정리하기전에 -
			//- buffer를 체크해서 플러시가안됀게 남아있으면 flush처리한다(플러시누락 방지 기능)
			if(bos!=null)try {bos.close();} catch(IOException e){}//나중에 만든걸 먼저 정리해준다
			if(fos!=null)try {fos.close();} catch(IOException e){}//나중에 만든걸 먼저 정리해준다
			
		}
		
	}
}
