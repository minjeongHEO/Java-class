package kr.s01.file;

import java.io.File;

public class FileMain01 {
	public static void main(String[] args) {
		String path = "C:\\"; //특정디렉토리 선정
		
		File f  = new File(path); //파일에 생성과 전달
		
		if(!f.exists() || !f.isDirectory()) { //존재하지않거나 디렉토리가아니라파일이거나
			System.out.println("유효하지 않는 디렉토리입니다.");
			System.exit(0);//종료
		}
		
		//지정한 디렉토리의 하위디렉토리 및 파일 정보 읽기
//		하나씩 담아야해서 배열로 만든다
		File[] files = f.listFiles(); 
		//디렉토리는 안됌.파일만 용량을 측정할 수있따.
		for(int i=0;i<files.length; i++) {
			//File배열로부터 File객체 반환해야 확인할 수 있다.
			File f2 = files[i];
			if(f2.isDirectory()) {//if문을 돌면 디렉토리가 되고
				System.out.println("["+f2.getName()+"]");//디렉토리명
			}else {//엘스문을 돌면 파일이 된다.
				System.out.print(f2.getName());//파일명
//				파일의랭쓰는 용량을 반환 스트링의 랭쓰는 길이를 반환
				System.out.printf("(%,dbytes)\n",f2.length());//용량표시
			}
		}
	}
}
//결과값에 숨김파일도 나온다
