package kr.s07.array;

public class Score {
	/*
	 * ��� ������ private�� ������ش�
	 * �̸� name, ���� korean, ���� english, ���� math
	 * ������ ���ϴ� �޼��带 ����� makeSum, ��ȯŸ���� int�� �Ѵ�
	 * ����� ���ϴ� �޼��带 ����� makeAvg, ��ȯŸ���� int�� �Ѵ�
	 * ����� ���ϴ� �޼��带 ����� makeGrade, ��ȯŸ���� String���� �Ѵ�
	 * ���� �ִ� ������ ǥ��
	 * ����Ʈ ������(���ڰ� ���� ������)�� ǥ��
	 */
	//�������
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
			return "a����";
			//			System.out.println("A����");//return "A����";
		}else if(makeAvg()>=80){
			System.out.println("B����");
		}else if(makeAvg()>=70){
			System.out.println("C����");
		}else if(makeAvg()>=60){
			System.out.println("D����");
		}else{
			System.out.println("F����");
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
