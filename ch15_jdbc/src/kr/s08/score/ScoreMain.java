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
			callMenu(); //callMenu();������� ������ ����� 
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	
	
	public void callMenu() throws IOException{
		while(true) {
			System.out.print("1.�����Է�,2.��Ϻ���,3.������,4.����,5.����,6.����: ");
			//
			try {
				int no = Integer.parseInt(br.readLine());
				if(no==1) {//�����Է� //�����Ͱ����⋚���� �μ�Ʈ�� ��������� ���̴�.
					//���ھ�vo�� ��Ƽ� �Ѱ��ش�
					//�׸���dao�� ���´�
					
					System.out.print("�̸�:");
					String name = br.readLine();
					
					int korean = parseInputData("����: ");
					int english = parseInputData("����: ");
					int math = parseInputData("����: ");
					
					//Score ��ü ����
					ScoreVO score = new ScoreVO();
					score.setName(name);
					score.setKorean(korean);
					score.setEnglish(english);
					score.setMath(math);
					
					dao.insertInfo(score);
					
				}else if(no==2) {//��Ϻ���
					dao.selectlistInfo();
				}else if(no==3) {//������
					//��ȣ Ȯ�ο� ��Ϻ���
					dao.selectlistInfo();
					System.out.println("---------------------");
					System.out.print("��ȣ: ");
					int num = Integer.parseInt(br.readLine());
					dao.selecDetailInfo(num);
				}else if(no==4) {//���� //main���� �����κ� �ڵ� �ٽú���
					//��ȣ Ȯ�ο� ��Ϻ���
					dao.selectlistInfo();
					System.out.println("---------------------");
					System.out.print("������ �� ��ȣ�� �Է��ϼ��� > ");
					int num = Integer.parseInt(br.readLine());
					System.out.print("�̸�");
					String name = br.readLine();
					int korean = parseInputData("����:");
					int english = parseInputData("����:");
					int math = parseInputData("����:");
					
					ScoreVO score = new ScoreVO();
					score.setNum(num);
					score.setName(name);
					score.setKorean(korean);
					score.setEnglish(english);
					score.setMath(math);
					
					dao.updateInfo(score);//�̰� �־�� �����̵ȴ�
				}else if(no==5) {//����
					//��ȣ Ȯ�ο� ��Ϻ���
					dao.selectlistInfo();
					System.out.println("---------------------");
					System.out.print("������ �� ��ȣ�� �Է��ϼ��� > ");
					int num = Integer.parseInt(br.readLine());
					dao.deleteInfo(num);
					
					//�� ������ ���������� ����Ǿ����� ��� Ȯ��
					dao.selectlistInfo();
				}else if(no==6) {//����
					System.out.println("���α׷� ����");
					break;
				}else {
					System.out.println("�߸� �Է��߽��ϴ�!");
				}
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է°���!!");
			}
		}
	}
	
	//���� ���� üũ(0~100)
	public int parseInputData(String cours)throws IOException{
		while(true) {
			System.out.print(cours);
			try {
				int num = Integer.parseInt(br.readLine());
				
				if(num<0 || num>100)
					throw new ScoreValueException("0~100������ ���� ����!");
				
				return num;//!�ȳ����� ����� ��� ����!!!!
				
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է� ����!");
				
			}catch(ScoreValueException e) {
			System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		new ScoreMain();
		
	}
	
}

