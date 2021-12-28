package kr.s09.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookUserMain {
	private BufferedReader br;
	private BookDAO dao;
	private boolean flag; //�⺻���� false. �α���o:true, �α���x:false //�α��������ø� �� ���Ϲ����� ���� ������ �ش�
	private int me_num; //ȸ����ȣ
	
	public BookUserMain() {
		dao = new BookDAO();
		try {
			br= new BufferedReader(new InputStreamReader(System.in));
			callMenu();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	public void callMenu()throws IOException{
		
		while(true) {
			System.out.print("1.�α���,2.ȸ������,3.���� : ");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no==1) {
					System.out.print("���̵�:");
					String me_id = br.readLine();
					
					System.out.print("��й�ȣ:");
					String me_passwd = br.readLine();
					
					me_num = dao.loginCheck(me_id, me_passwd);
					if(me_num!=0) {
						System.out.println(me_id+ "(" +me_num+ ")�� �α��� �Ǿ����ϴ�.");
						flag = true;
						break;
					}
					
					System.out.println("���̵� �Ǵ� ��й�ȣ�� ����ġ �մϴ�.");
					
					
				}else if(no==2) { //ȸ������
					System.out.print("���̵�: ");
					String me_id = br.readLine();
					
					//id �ߺ�üũ
					int check = dao.checkId(me_id);
					if(check == 1) {
						System.out.println("���̵� �ߺ� �Ǿ����ϴ�");
						continue;
					}
					
					System.out.print("��й�ȣ: ");
					String me_passwd = br.readLine();

					System.out.print("�̸�: ");
					String me_name = br.readLine();

					System.out.print("��ȭ��ȣ: ");
					String me_phone = br.readLine();

					MemberVO vo = new MemberVO();//vo�� ����ش�
					vo.setMe_id(me_id);
					vo.setMe_passwd(me_passwd);
					vo.setMe_name(me_name);
					vo.setMe_phone(me_phone);
					
					dao.insetMember(vo);
				}else if(no==3) {
					System.out.println("���α׷� ����");
					break;
				}else {
					System.out.println("�߸� �Է��߽��ϴ�.");
				}
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է� ����!");
				
			}
		}
		while(flag) {//�α��������ø� �� ���Ϲ����� ���� ���� ������ �ش�
			System.out.print("1.�������,2.���������ϱ�,3.my������,4.���� : ");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no==1) {//�������
					dao.selectListBook();
				}else if(no==2) {//���������ϱ�
					System.out.println("====���� �˻�====");
					dao.selectListBook();
					
					while(true) { //�̹� ����������� ������ ���ǵ��� while�� �����(�ߺ�x)
						System.out.print("���⵵����ȣ(�Է��ߴ�:0) : ");
						int bk_num = Integer.parseInt(br.readLine());
						
						if(bk_num==0)
							break; //�ߺ�����!
						int bk_status = dao.getStatusReservation(bk_num); //dao.�޼���:���� ���� Ȯ��
						if(bk_status>=1) {
							System.out.println("���� ���� ������ ��û�� �� �����ϴ�.");
						}else if(bk_status<0) {
							System.out.println("���� ��ȣ�� �߸� �Է��߽��ϴ�.");
						}else { //�������� 0�� ��� ��
							
							ReservationVO vo = new ReservationVO();
							vo.setMe_num(me_num);//ȸ�� ��ȣ
							vo.setBk_num(bk_num);//���� ��ȣ
							
							dao.insertReservation(vo);
							break;
						}
					}
				}else if(no==3) {//MY������
					dao.selectMyList(me_num);
					//���� �ݳ��ϱ�
					System.out.println("====���� �ݳ��ϱ�====");
					System.out.print("�����ȣ(�Է�����:0): ");
					int re_num = Integer.parseInt(br.readLine());
					
					//�Է�����
					if(re_num ==0) continue;//ȸ���� ��ŵ > ����� ���ͼ� ó���ϰԲ�
					
					int bk_status = dao.getStatusBack(re_num, me_num);
					if(bk_status<=0) {
						System.out.println("�������� ���� ������ �ݳ��� �� ����");
						continue;
					}
					
					//�ݳ�ó��
					dao.updateReservation(re_num);
					 
					
				}else if(no==4) {//����
					System.out.println("���α׷� ����");
					break;
				}else {
					System.out.println("�߸� �Է��߽��ϴ�.");
				}
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է°���!!");
			}
		}
	}
	
	public static void main(String[] args) {
		new BookUserMain();
		
	}
}
