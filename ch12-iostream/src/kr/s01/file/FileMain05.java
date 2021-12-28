package kr.s01.file;

import java.io.File;

public class FileMain05 {
	public static void main(String[] args) {
		String path = "example.txt";//삭제할 파일 경로
		
		File f1 = new File(path);//여기에 path를 넘기고
		
		System.out.println("===========파일 삭제 ============");
		
		//delete()메서드: 삭제할 수 있으면 삭제먼저하고 true반환
		//				삭제가 불가능하면  false반환	
		if(f1.delete()) {
			System.out.println(f1.getName()+"파일삭제");
			
		}else {
			System.out.println("삭제할 수 없습니ㅏㄷ");
		}
	}
}
