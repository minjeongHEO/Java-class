package kr.s01.file;

import java.io.File;

public class FileMain04 {
	public static void main(String[] args) {
		//현재 파일명
		String path = "Sample.txt";
		//바꿀 새 파일명
		String path2 = "example.txt";
		
//		File객체를 생성하려며 임포트를해야한다
		File f1 = new File(path);
		
		System.out.println("===========파일명 변경=============");
		
		//새 파일명을 전달받아서 File객체 생성
		File f2 = new File(path2);
		
		System.out.println(f1.renameTo(f2));//변경할수있으면 트루반환 없으면 펄스반환
		
		
		
	}
}
