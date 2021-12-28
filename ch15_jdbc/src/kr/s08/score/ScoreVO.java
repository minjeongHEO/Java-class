package kr.s08.score;

import java.sql.Date;
 /*
  * 메서드만들떄 인자가많으면 그룹으로 만들어서사용한다
  * 입력하고 입력한 데이터를 테이블에 넣어줄려고 한다
  * score VO : 하나에 레코드에 들어갈 데이터를 보관한다
  * jsp에서는 vo클래스 같은 것을 자바빈이라고 쓴다. 웹에서는 필수
  * V0(Value Object): 데이터 베이스(테이블)의 행에 정보를 제공하고 
  * 행으로 부터 값을 읽어와서 보관할 수 있는 객체
  * 
  * DAO: 데이터 베이스의 데이터를 전문적으로 호출하고 제어하는 객체
  */
public class ScoreVO {
	private int num;//번호
	private String name;//이름
	private int korean;//국어
	private int english;//영어
	private int math;//수학
	private int sum;//총점
	private int avg;//평균
	private String grade;//등급
	private Date reg_date;//등록일/자바에는 두가지date가 있다. java.util.의 date(데이터베ㅣㅇ스 연동없이) / java,sql의 date
	
	public int getNum() {
		return num;
	}
	
	//총점구하기
	public int makeSum() {
		return korean+english+math;
	}
	
	//평균구하기
	public int makeAvg() {
		return makeSum()/3;
	}
	
	//등급 구하기
	public String makeGrade() {
		String grade;
		switch(makeAvg()/10) {
		case 10:
		case 9: grade = "A";break;
		case 8: grade = "B";break;
		case 7: grade = "C";break;
		case 6: grade = "D";break;
			default : grade = "F";;
		}
		return grade;
		}
	
		
		
	
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	
}
