package kr.s01.list;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;


public class ScoreMain {
	/*
	 *  �޴�:1.�����Է�, 2.�������, 3.���� >
	 *  ����üũ�ϴ� �޼ҵ�
	 *  0~100���̷� �Է� üũ(int parseInputData(String title)) memebermain����
	 */
	ArrayList<Score> list;//��
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
	//�޴�
	public void callMenu() throws IOException{
		while(true) {
		
				System.out.print("�޴�: 1.�����Է� | 2.������� | 3.���� > ");
				try {
					int num = Integer.parseInt(br.readLine());
					if(num==1) {
						input();
					}else if(num==2) {
						output();
					}else if(num==3) {
						System.out.println("���α׷��� �����մϴ�.");
						break;
					}else {
						System.out.println("�ٽ� �Է��ϼ���");
					}
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���");
			}
			
		}
	}
	//�����Է�
	public void input() throws IOException{
		Score s = new Score();
		System.out.print("�̸� �Է�: ");
		s.setName(br.readLine());
		
		s.setKorean(parseInputData("���� �Է�: "));
		s.setKorean(parseInputData("���� �Է�: "));
		s.setKorean(parseInputData("���� �Է�: "));
//		System.out.print("���� ����: ");
//		s.setKorean(Integer.parseInt(br.readLine()));

		//score�� array�� ����
		list.add(s);
	}
	
	//0~100���� �Է°� üũ
	public int parseInputData(String title)throws IOException{
		while(true) {
			System.out.print(title);
			try {
				int num = Integer.parseInt(br.readLine());
				
				if(num<0 || num>100) {
					throw new ScoreValueException("0~100������ ���� ����ddd");//ScoreValueException��ü�� �����ϰ� ���ܹ߻��� �ν��ϰ� Ʈ���̦U���� �����ٴ� �ǹ�
//					new ScoreValueException//��ü������
				}
				return num;
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���");
			}catch(ScoreValueException e) { //����� ��������
//				System.out.println("ddddd");
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	//�������
//	public void output() throws IOException{
	
	public void output() {
		System.out.println("�̸�\t����\t����\t����\t����\t���\t���");
//		 tostring();����Ʈ���� �ȳ־ �ڵ������ȴ�.
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
