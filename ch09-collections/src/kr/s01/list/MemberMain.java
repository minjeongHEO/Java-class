package kr.s01.list;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemberMain {
	/*
	 * ArrayList, BufferedReader ����
	 * �޴� : 1.ȸ�������Է�, 2.ȸ���������, 3.����
	 */
	
	ArrayList<Member> list;
	BufferedReader br;
	
	public MemberMain() {
		list = new ArrayList<Member>();
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();} catch(IOException e) {}
		}
	}
	
	public void callMenu() throws IOException{
		while(true) {
			try {
				System.out.print("�޴� : 1.ȸ�������Է�, 2.ȸ���������, 3.���� > ");
				int num = Integer.parseInt(br.readLine());
				if(num == 1) {
					input();
				}else if(num == 2) {
					output();
				}else {
					System.out.println("�����մϴ�.");
					break;
				}
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է����ּ���");
			}
		}
	}
	
	public void input()throws IOException{
		Member m = new Member();
		//�̸�name ����age ����job �ּ�address ��ȭ��ȣphone
		System.out.print("�̸�:");
		m.setName(br.readLine());
//		System.out.print("����:");
//		m.setAge(Integer.parseInt(br.readLine()));
		
		m.setAge(parseInputdata("����: "));
		System.out.print("����:");
		m.setJob(br.readLine());
		System.out.print("�ּ�:");
		m.setAddress(br.readLine());
		System.out.print("��ȭ��ȣ:");
		m.setPhone(br.readLine());
		
		//Member�� ArrayList�� ����
		list.add(m);
		
	}
	//�������� ���ڿ����� üũ
	//1�� �̻� �Է°� ó��
	public int parseInputdata(String title) throws IOException{
		while(true) {
			System.out.print(title);
			try {
				int a = Integer.parseInt(br.readLine());
				if(a<=0) {
					System.out.println("���̴� 1���̻� �Է°���");
					continue;
					//break;�� ����
				}
				return a;
				
			}catch(NumberFormatException e) { //���ڰ��ƴҰ���?
				System.out.println("���ڸ� �Է��ϼ���!");
			}
		}	
	
	}
//	public void output()throws IOException {
	public void output() {
		System.out.println("�� ȸ���� : "+list.size());
		System.out.println("---------------------------------------");
		System.out.println("�̸�\t����\t����\t�ּ�\t��ȭ��ȣ");
		System.out.println("---------------------------------------");
		for(Member m:list) {
//			System.out.printf("%s\t",m.getName());
			System.out.print(m.getName()+"\t");
			System.out.printf(m.getAge()+"\t");
			System.out.printf(m.getJob()+"\t");
			System.out.printf(m.getAddress()+"\t");
			System.out.printf(m.getPhone()+"\n");
		}
		
	}
	
	public static void main(String[] args) {
		new MemberMain();
	}
	
	
	
}

