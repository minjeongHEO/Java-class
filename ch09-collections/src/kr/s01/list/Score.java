package kr.s01.list;

public class Score {
	/*
	 * �̸�name, ����korean, ����english ����math
	 * ����ȭ ĸ��ȭ 
	 * �߰����θ޼���
	 * �������ϱ�(int makeSum), ��ձ��ϱ�(double makeAvg), ��ޱ��ϱ�(String makeGrade)
	 * get�޼��� set�޼���
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
		return grade; //���ϳ־�����Ѵ�.
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

	//����Ʈ���� ������ �����Ͱ� ����� ������ Ȯ���ҋ� ��Ŭ������ �ѹ��� �� ���ִ�.
	@Override
	public String toString() {
		return "Score [name=" + name + ", korean=" + korean + ", english=" + english + ", math=" + math + "]";
	}
	
	
	
}
