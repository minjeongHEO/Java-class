package kr.s01.file;

import java.io.File;
import java.io.IOException;

public class FileMain03 {
	public static void main(String[] args) {
		//절대경로(전체경로)
		String path = "C:\\javaWork\\sample.txt";
		
		//상대경로
//		String path = "sample.txt"; //특정경로에서 이걸 찾는다 자바는 이경우에 프로젝트에서 찾거나 만든다
		
		//파일객체만들기
		File f1 = new File(path);
		System.out.println("----파일생성----");
		
		try {
			//제공된 경로를 기반으로 파일생성, 파일이 생성되면 true반환, 생성되지 않으면 false반환,
			//경로가 잘못되면 IOExeption발생
			System.out.println(f1.createNewFile());//트라이캐치안하면 에러난다.파일을 생성할 수있으면 트루반환/없으면 펄스반환
 		}catch(IOException e) {
			e.printStackTrace();//예외문구출력
		}
		System.out.println("========파일 정보=======");
		System.out.println("절대 경로: "+ f1.getAbsolutePath());//절대경로구하는 메소드
		System.out.println("상대 경로: "+ f1.getPath());//상대경로구하는 메소드
		System.out.println("디렉토리명: "+ f1.getParent());//(디렉토리명은 상대경로에서 뽑아오는것이다)
		System.out.println("파일명: "+ f1.getName());
	}
}
/*실행하면 트루출력되고 패키이익스플로러 탭에서 프로젝트파일 누르고 리프레시 해줘야 파일생성된게 보인다
 * 생성되고 또 실행하면 펄스가 출력된다 이미 있으므로.
 * 삭제하고 실행하면 트루
 * 절대경로에서 경로를 정확하게 지정하지않으면 출력결과에러난다.
 */
