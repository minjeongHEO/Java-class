package kr.s08.score;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.s03.preparedstatement.DBUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import kr.s08.score.*;


public class ScoreMain {
	private BufferedReader br;
	private ScoreDAO dao;
	
	public ScoreMain() {
		dao = new ScoreDAO();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu(); //callMenu();를해줘야 에러가 사라짐 
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	
	
	public void callMenu() throws IOException{
		while(true) {
			System.out.print("1.성적입력,2.목록보기,3.상세정보,4.수정,5.삭제,6.종료: ");
			//
			try {
				int no = Integer.parseInt(br.readLine());
				if(no==1) {//성적입력 //데이터가없기떄문에 인서트를 먼저해줬던 것이다.
					//스코어vo에 담아서 넘겨준다
					//그리고dao가 뺴온다
					
					System.out.print("이름:");
					String name = br.readLine();
					
					int korean = parseInputData("국어: ");
					int english = parseInputData("영어: ");
					int math = parseInputData("수학: ");
					
					//Score 객체 생성
					ScoreVO score = new ScoreVO();
					score.setName(name);
					score.setKorean(korean);
					score.setEnglish(english);
					score.setMath(math);
					
					dao.insertInfo(score);
					
				}else if(no==2) {//목록보기
					dao.selectlistInfo();
				}else if(no==3) {//상세정보
					//번호 확인용 목록보기
					dao.selectlistInfo();
					System.out.println("---------------------");
					System.out.print("번호: ");
					int num = Integer.parseInt(br.readLine());
					dao.selecDetailInfo(num);
				}else if(no==4) {//수정 //main에서 수정부분 코드 다시보기
					//번호 확인용 목록보기
					dao.selectlistInfo();
					System.out.println("---------------------");
					System.out.print("수정할 글 번호를 입력하세요 > ");
					int num = Integer.parseInt(br.readLine());
					System.out.print("이름");
					String name = br.readLine();
					int korean = parseInputData("국어:");
					int english = parseInputData("영어:");
					int math = parseInputData("수학:");
					
					ScoreVO score = new ScoreVO();
					score.setNum(num);
					score.setName(name);
					score.setKorean(korean);
					score.setEnglish(english);
					score.setMath(math);
					
					dao.updateInfo(score);//이걸 넣어야 적용이된다
				}else if(no==5) {//삭제
					//번호 확인용 목록보기
					dao.selectlistInfo();
					System.out.println("---------------------");
					System.out.print("삭제할 글 번호를 입력하세요 > ");
					int num = Integer.parseInt(br.readLine());
					dao.deleteInfo(num);
					
					//행 삭제가 정상적으로 수행되었는지 목록 확인
					dao.selectlistInfo();
				}else if(no==6) {//종료
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다!");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력가능!!");
			}
		}
	}
	
	//성적 범위 체크(0~100)
	public int parseInputData(String cours)throws IOException{
		while(true) {
			System.out.print(cours);
			try {
				int num = Integer.parseInt(br.readLine());
				
				if(num<0 || num>100)
					throw new ScoreValueException("0~100사이의 값만 인정!");
				
				return num;//!안넣으면 국어에서 계속 돈다!!!!
				
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능!");
				
			}catch(ScoreValueException e) {
			System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		new ScoreMain();
		
	}
	
}

