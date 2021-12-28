package kr.s09.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookAdminMain {
	private BufferedReader br;
	private BookDAO dao;
	
	public BookAdminMain() {
		dao = new BookDAO();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	
	public void callMenu()throws IOException{
		while(true) {
			System.out.print("1.ȸ�����,2.�������,3.�������,4.������,5.���� :");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no==1) { //ȸ�����
					dao.selectListMember();
				}else if(no==2) { //�������
					 System.out.print("������:");
					 String bk_name = br.readLine();
					 
					 System.out.print("�з�:");
					 String bk_category = br.readLine();
					 
					 BookVO vo = new BookVO();
					 vo.setBk_name(bk_name);
					 vo.setBk_category(bk_category);
					 
					 dao.insertBook(vo); 
				}else if(no==3) { //�������
					dao.selectListBook();
				}else if(no==4) { //������
					dao.selectListReservation();
				}else if(no==5) { //����
					System.out.println("���α׷� ����");
					break;
				}else { 
					System.out.println("�߸� �Է��߽��ϴ�.");
				}
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է� ����!");
			}
			
		}
	}
	
	public static void main(String[] args) {
		new BookAdminMain();
		
	}
}
