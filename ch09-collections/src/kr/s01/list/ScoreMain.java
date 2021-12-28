package kr.s01.list;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;


public class ScoreMain {
	/*
	 *  메뉴:1.성적입력, 2.성적출력, 3.종료 >
	 *  조건체크하는 메소드
	 *  0~100사이로 입력 체크(int parseInputData(String title)) memebermain참고
	 */
	ArrayList<Score> list;//★
	BufferedReader br;

	
	public ScoreMain() {
		list = new ArrayList<Score>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			if(br!=null)try { br.close();} catch(IOException e) {}
		}
	}
	//메뉴
	public void callMenu() throws IOException{
		while(true) {
		
				System.out.print("메뉴: 1.성적입력 | 2.성적출력 | 3.종료 > ");
				try {
					int num = Integer.parseInt(br.readLine());
					if(num==1) {
						input();
					}else if(num==2) {
						output();
					}else if(num==3) {
						System.out.println("프로그램을 종료합니다.");
						break;
					}else {
						System.out.println("다시 입력하세요");
					}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요");
			}
			
		}
	}
	//성적입력
	public void input() throws IOException{
		Score s = new Score();
		System.out.print("이름 입력: ");
		s.setName(br.readLine());
		
		s.setKorean(parseInputData("국어 입력: "));
		s.setKorean(parseInputData("영어 입력: "));
		s.setKorean(parseInputData("수학 입력: "));
//		System.out.print("국어 점수: ");
//		s.setKorean(Integer.parseInt(br.readLine()));

		//score를 array에 저장
		list.add(s);
	}
	
	//0~100사이 입력값 체크
	public int parseInputData(String title)throws IOException{
		while(true) {
			System.out.print(title);
			try {
				int num = Integer.parseInt(br.readLine());
				
				if(num<0 || num>100) {
					throw new ScoreValueException("0~100사이의 값만 인정ddd");//ScoreValueException객체르 생성하고 예외발생을 인식하고 트라이쪾으로 던진다는 의미
//					new ScoreValueException//객체만생성
				}
				return num;
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요");
			}catch(ScoreValueException e) { //여기로 던져진다
//				System.out.println("ddddd");
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	//성적출력
//	public void output() throws IOException{
	
	public void output() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
//		 tostring();투스트링은 안넣어도 자동생성된다.
//		https://backback.tistory.com/68
		for(Score s : list) {
			System.out.print(s.getName()+ "\t");
			System.out.print(s.getKorean()+ "\t");
			System.out.print(s.getEnglish()+ "\t");
			System.out.print(s.getMath()+ "\t");
			System.out.print(s.makeSum()+ "\t");
			System.out.printf("%.2f\t",s.makeAvg());
			System.out.println(s.makeGrade());
		}
		
	}
	public static void main(String[] args) {
		new ScoreMain();
		
		
	}
}
