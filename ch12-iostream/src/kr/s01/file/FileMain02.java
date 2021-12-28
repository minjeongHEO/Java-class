package kr.s01.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain02 {
	public static void main(String[] args) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd a hh:mm");
		String path = "C:\\"; //원칙은 절대경로로넣어야한다.ex)C:\\javaWork\\sample.txt
		File f = new File(path);
	
	//지정한 경로의 하위디렉토리 및 파일 정보 File[]로 반환
		File[] files = f.listFiles();
		
		String attribute ="";//이게 뭐로반환한느거였지?
		
		String size ="";
		String name ="";
		
		for(int i=0;i<files.length;i++) {
			//File배열에서 File를 반환
			File f2 = files[i];
			name = f2.getName();//파일일수도 디렉토리일수도있다
			
//			디렉토리인지아닌지 알아내보자 디렉토리는 용량개념이 없다 디렉토리=폴더
			if(f2.isDirectory()) {//디렉토리면
				size = "0";
				attribute = "DIR";
			}else {//파일이면
				size = f2.length() + "";//랭쓰가long으로 반환해서 size 스트링(상단에 스트링으로지정했음)에 안들어가서 문자열로 변환
				attribute = f2.canRead() ? "R" : " ";
				attribute += f2.canWrite() ? "W" : " ";
				attribute += f2.isHidden() ? "H" : " ";
			}
			
			System.out.printf("%s %3s %6s %s\n", sf.format(new Date(f2.lastModified())),//마지막 생성 수정 시간을 long타입으로 반환 그래서 그것을 데이트클래스에게 변환을 시킨다.
//					(상단에 생선한)심플데이트포맷으로 영문으로출력되던거를 사용자중심으로 한글로 바꿔준다 sf.format
															attribute,size, name);
			
		}
		
		}
	


}
