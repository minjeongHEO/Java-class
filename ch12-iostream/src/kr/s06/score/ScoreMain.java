package kr.s06.score;
/*
 * 메뉴: 1.성적입력 2.성적출력 3.파일생성 4.파일읽기 5.종료
 * 파일 생성 -> FileOutputStream or FileWriter
 * 파일 읽기 -> FileInputStream or FileReader
 */

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.BufferedOutputStream;


public class ScoreMain {

	ArrayList<Score> list;
	BufferedReader br;
	
	/*String filename; 으로 변수설정하고 fw = new FileWriter("score.txt");여기에
	 * fw = new FileWriter(filename);넣어줄수있고
	 * String filename = "score.txt"라고 지정하는게 더 좋다 생성이 안됐는데출력되서수있어서?
	*/
	public ScoreMain() {
		
		list = new ArrayList<Score>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(IOException e) {
			e.printStackTrace();
		}finally { if(br!=null)try {br.close();}catch(IOException e) {}
			
		}
	}
	
	public void callMenu() throws IOException{
		while(true) {
			System.out.print("1.성적입력 2.성적출력 3.파일생성 4.파일읽기 5.종료");
			try {

				int num = Integer.parseInt(br.readLine());

				if(num==1) {
					input();
				}else if(num==2) {
					output();
				}else if(num==3) {
					createFile();
				}else if(num==4) {
					readFile();
				}else if(num==5) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}else {
					System.out.println("다시 입력하세요");
				}

			}catch(NumberFormatException e) {
				System.out.println("정수만 입력하세요");
			}
			/*finally{if(br!=null)try {br.close();}catch(IOException e) {}
			}*/
		}
	}
	
	public void input() throws IOException{ //성적입력
		Score s = new Score();
		System.out.print("이름> ");
		s.setName(br.readLine());
		s.setKorean(parseInputData("국어 점수> "));
		s.setEnglish(parseInputData("영어 점수> "));
		s.setMath(parseInputData("수학 점수> "));

		//score객체를 arraylist에 저장
		list.add(s);
	}
	
	public int parseInputData(String course)throws IOException{ //성적범위체크
		while(true) {
			System.out.print(course);//
			try {
				int num = Integer.parseInt(br.readLine());
				if(num<0 || num>100) {
					throw new ScoreValueException("0~100 사이");
				}
				return num;//안넣으면 다음구문으로 안넘어감
				
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
			}catch(ScoreValueException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public void output() { //성적출력
//		System.out.println(list);
		if(list.size()>0) {
			System.out.println("-----------------------------------");
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
			System.out.println("-----------------------------------");
			
			for(Score s : list) {
				System.out.print(s); //s만 넣으면 투스트링 호출
			}
			
		}else {
			System.out.println("출력할 성적이 없습니다.");
		}
		
	}
	public void createFile() { //파일생성
		//		System.out.print("생성할 파일> ");파일명 입력받아서는 어떻게?
		//		br = new BufferedReader(new InputStreamReader(System.in));
		//		String createFile;
		//		createFile = (String)br.readLine();
		
		FileWriter fw = null;
//		BufferedWriter bw = null;
		try {
			fw = new FileWriter("score.txt");
			
			fw.write("이름\t국어\t영어\t수학\t총점\t평균\t등급\n");
			fw.write("------------------------------------------\n");
			
			for(Score s:list) {
				fw.write(s.toString());
			}
			
			fw.flush();
			System.out.println("파일 생성 완료");
			
		}catch(IOException e) {
			System.out.println("파일 생성 오류");
		}finally {
			if(fw!=null)try {fw.close();}catch(IOException e) {}
		}
	
	}
	public void readFile() { //파일읽기
		FileReader fr = null;
//		BufferedReader bfr = null;
		int readChar;
		try {
			fr = new FileReader("score.txt");
//			bfr = new BufferedReader(fr);
			
//			String msg;
			while((readChar = fr.read())!=-1){
				System.out.println((char)readChar);
			}
		}catch(FileNotFoundException e) {
			System.out.println("생성된 파일이 없습니다");
		}catch(IOException e) {
			System.out.println("파일 읽기 오류");
		}finally {
//			if(bfr!=null)try {bfr.close();} catch(IOException e) {}
			if(fr!=null)try {fr.close();} catch(IOException e) {}
		}	

	}
	
//			for(int i=0;i<list.size();i++) {
//				Score s = list.get(i);
//				System.out.println(s.);
//			}
	public static void main(String[] args) {
		new ScoreMain();
		
	}
}
