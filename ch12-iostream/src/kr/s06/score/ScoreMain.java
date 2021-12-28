package kr.s06.score;
/*
 * �޴�: 1.�����Է� 2.������� 3.���ϻ��� 4.�����б� 5.����
 * ���� ���� -> FileOutputStream or FileWriter
 * ���� �б� -> FileInputStream or FileReader
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
	
	/*String filename; ���� ���������ϰ� fw = new FileWriter("score.txt");���⿡
	 * fw = new FileWriter(filename);�־��ټ��ְ�
	 * String filename = "score.txt"��� �����ϴ°� �� ���� ������ �ȵƴµ���µǼ����־?
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
			System.out.print("1.�����Է� 2.������� 3.���ϻ��� 4.�����б� 5.����");
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
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}else {
					System.out.println("�ٽ� �Է��ϼ���");
				}

			}catch(NumberFormatException e) {
				System.out.println("������ �Է��ϼ���");
			}
			/*finally{if(br!=null)try {br.close();}catch(IOException e) {}
			}*/
		}
	}
	
	public void input() throws IOException{ //�����Է�
		Score s = new Score();
		System.out.print("�̸�> ");
		s.setName(br.readLine());
		s.setKorean(parseInputData("���� ����> "));
		s.setEnglish(parseInputData("���� ����> "));
		s.setMath(parseInputData("���� ����> "));

		//score��ü�� arraylist�� ����
		list.add(s);
	}
	
	public int parseInputData(String course)throws IOException{ //��������üũ
		while(true) {
			System.out.print(course);//
			try {
				int num = Integer.parseInt(br.readLine());
				if(num<0 || num>100) {
					throw new ScoreValueException("0~100 ����");
				}
				return num;//�ȳ����� ������������ �ȳѾ
				
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���.");
			}catch(ScoreValueException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public void output() { //�������
//		System.out.println(list);
		if(list.size()>0) {
			System.out.println("-----------------------------------");
			System.out.println("�̸�\t����\t����\t����\t����\t���\t���");
			System.out.println("-----------------------------------");
			
			for(Score s : list) {
				System.out.print(s); //s�� ������ ����Ʈ�� ȣ��
			}
			
		}else {
			System.out.println("����� ������ �����ϴ�.");
		}
		
	}
	public void createFile() { //���ϻ���
		//		System.out.print("������ ����> ");���ϸ� �Է¹޾Ƽ��� ���?
		//		br = new BufferedReader(new InputStreamReader(System.in));
		//		String createFile;
		//		createFile = (String)br.readLine();
		
		FileWriter fw = null;
//		BufferedWriter bw = null;
		try {
			fw = new FileWriter("score.txt");
			
			fw.write("�̸�\t����\t����\t����\t����\t���\t���\n");
			fw.write("------------------------------------------\n");
			
			for(Score s:list) {
				fw.write(s.toString());
			}
			
			fw.flush();
			System.out.println("���� ���� �Ϸ�");
			
		}catch(IOException e) {
			System.out.println("���� ���� ����");
		}finally {
			if(fw!=null)try {fw.close();}catch(IOException e) {}
		}
	
	}
	public void readFile() { //�����б�
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
			System.out.println("������ ������ �����ϴ�");
		}catch(IOException e) {
			System.out.println("���� �б� ����");
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
