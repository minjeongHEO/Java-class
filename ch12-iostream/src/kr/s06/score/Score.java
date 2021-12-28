package kr.s06.score;

public class Score {
	/*이름name 국어korean 영어english 수학math
	 * 총점구하기 int makeSum 평균구하기 double makeAvg
	 * 등급구하기 String makeGrade
	 */
	
	private String name;
	private int korean;
	private int english;
	private int math;
	
	public int makeSum() {
		return korean+english+math;
	}
	public double makeAvg() {
		return makeSum()/3.0;
	}
	public String makeGrade() {
		String str;
		switch((int)makeAvg()/10) {
		case 10:
		case 9:
			str = "A";
			break;
		case 8:
			str = "B";
			break;
		case 7:
			str = "C";
			break;
		case 6:
			str = "D";
			break;
		default:
			str = "F";
			break;
		}
		return str;
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
	
	
	@Override
	public String toString() { //
		return String.format("%s\t%d\t%d\t%d\t%d\t%.2f\t%s%n", 
								name,korean,english,math,makeSum(),makeAvg(),makeGrade());
	}
}
