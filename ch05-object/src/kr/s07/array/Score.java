package kr.s07.array;

public class Score {
	/*
	 * 멤버 변수를 private로 만들어준다
	 * 이름 name, 국어 korean, 영어 english, 수학 math
	 * 총점을 구하는 메서드를 만든다 makeSum, 반환타입은 int로 한다
	 * 평균을 구하는 메서드를 만든다 makeAvg, 반환타입은 int로 한다
	 * 등급을 구하는 메서드를 만든다 makeGrade, 반환타입은 String으로 한다
	 * 인자 있는 생성자 표시
	 * 디폴트 생성자(인자가 없는 생성자)도 표시
	 */
	//멤버변수
	private String name;
	private int korean;
	private int english;
	private int math;

	public Score() {}

	public Score(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	public int makeSum(){
		return korean+english+math;
	}
	//(String name,int korean, int english, int math) {

	//		this.korean = korean;
	//		this.english = english;
	//		this.math = math;


	public int makeAvg() {
		return makeSum()/3;//this.makeSum()/3;
	}

	public String makeGrade() {
		String grade;
		switch(makeAvg()/10) {
		case 10:
		case 9:
			grade ="A";break;
		case 8:
			grade ="B";break;
		case 7:
			grade ="C";break;
		case 6:
			grade ="D";break;
		default:
			grade ="F";break;
		}
		return grade;	
	}

	/*if(makeAvg()>=90) {
			return "a학점";
			//			System.out.println("A학점");//return "A학점";
		}else if(makeAvg()>=80){
			System.out.println("B학점");
		}else if(makeAvg()>=70){
			System.out.println("C학점");
		}else if(makeAvg()>=60){
			System.out.println("D학점");
		}else{
			System.out.println("F학점");
		}
		return name;
	 */
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



}
