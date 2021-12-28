package kr.s01.list;

public class Score {
	/*
	 * 이름name, 국어korean, 영어english 수학math
	 * 은닉화 캡슐화 
	 * 추가적인메서드
	 * 총점구하기(int makeSum), 평균구하기(double makeAvg), 등급구하기(String makeGrade)
	 * get메서드 set메서드
	 */
	private String name;
	private int korean;
	private int english;
	private int math;
	static int sum;
	
//	public static void makeSum(int korean, int english, int math) {
//		System.out.println(sum);
//	}
	
	public int makeSum() {
		return korean+english+math;
	}
//	public static void makeAvg(double korean, double english, double math) {
//		System.out.println(sum/3.0);
//	}
	
	public double makeAvg() {
		return makeSum()/3.0;
	}
	
	public String makeGrade() {
		String grade;
		switch((int)(makeAvg()/10)){
			case 10:
			case 9:
//				System.out.println("A");
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
		}
		return grade; //리턴넣어줘야한다.
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

	//투스트링을 재정의 데이터가 제대로 들어갔는지 확인할떄 우클릭으로 한번에 할 수있다.
	@Override
	public String toString() {
		return "Score [name=" + name + ", korean=" + korean + ", english=" + english + ", math=" + math + "]";
	}
	
	
	
}
