package kr.s01.list;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemberMain {
	/*
	 * ArrayList, BufferedReader 생성
	 * 메뉴 : 1.회원정보입력, 2.회원정보출력, 3.종료
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
				System.out.print("메뉴 : 1.회원정보입력, 2.회원정보출력, 3.종료 > ");
				int num = Integer.parseInt(br.readLine());
				if(num == 1) {
					input();
				}else if(num == 2) {
					output();
				}else {
					System.out.println("종료합니다.");
					break;
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력해주세요");
			}
		}
	}
	
	public void input()throws IOException{
		Member m = new Member();
		//이름name 나이age 직업job 주소address 전화번호phone
		System.out.print("이름:");
		m.setName(br.readLine());
//		System.out.print("나이:");
//		m.setAge(Integer.parseInt(br.readLine()));
		
		m.setAge(parseInputdata("나이: "));
		System.out.print("직업:");
		m.setJob(br.readLine());
		System.out.print("주소:");
		m.setAddress(br.readLine());
		System.out.print("전화번호:");
		m.setPhone(br.readLine());
		
		//Member를 ArrayList에 저장
		list.add(m);
		
	}
	//숫자인지 문자열인지 체크
	//1살 이상 입력값 처리
	public int parseInputdata(String title) throws IOException{
		while(true) {
			System.out.print(title);
			try {
				int a = Integer.parseInt(br.readLine());
				if(a<=0) {
					System.out.println("나이는 1살이상 입력가능");
					continue;
					//break;도 가능
				}
				return a;
				
			}catch(NumberFormatException e) { //숫자가아닐경우ㅡ?
				System.out.println("숫자만 입력하세요!");
			}
		}	
	
	}
//	public void output()throws IOException {
	public void output() {
		System.out.println("총 회원수 : "+list.size());
		System.out.println("---------------------------------------");
		System.out.println("이름\t나이\t직업\t주소\t전화번호");
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

