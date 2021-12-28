package kr.s09.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookUserMain {
	private BufferedReader br;
	private BookDAO dao;
	private boolean flag; //기본값이 false. 로그인o:true, 로그인x:false //로그인했을시만 이 와일문에만 들어가게 변수를 준다
	private int me_num; //회원번호
	
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
			System.out.print("1.로그인,2.회원가입,3.종료 : ");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no==1) {
					System.out.print("아이디:");
					String me_id = br.readLine();
					
					System.out.print("비밀번호:");
					String me_passwd = br.readLine();
					
					me_num = dao.loginCheck(me_id, me_passwd);
					if(me_num!=0) {
						System.out.println(me_id+ "(" +me_num+ ")님 로그인 되었습니다.");
						flag = true;
						break;
					}
					
					System.out.println("아이디 또는 비밀번호가 불일치 합니다.");
					
					
				}else if(no==2) { //회원가입
					System.out.print("아이디: ");
					String me_id = br.readLine();
					
					//id 중복체크
					int check = dao.checkId(me_id);
					if(check == 1) {
						System.out.println("아이디가 중복 되었습니다");
						continue;
					}
					
					System.out.print("비밀번호: ");
					String me_passwd = br.readLine();

					System.out.print("이름: ");
					String me_name = br.readLine();

					System.out.print("전화번호: ");
					String me_phone = br.readLine();

					MemberVO vo = new MemberVO();//vo에 담아준다
					vo.setMe_id(me_id);
					vo.setMe_passwd(me_passwd);
					vo.setMe_name(me_name);
					vo.setMe_phone(me_phone);
					
					dao.insetMember(vo);
				}else if(no==3) {
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능!");
				
			}
		}
		while(flag) {//로그인했을시만 이 와일문에만 들어가게 위에 변수를 준다
			System.out.print("1.도서목록,2.도서대출하기,3.my대출목록,4.종료 : ");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no==1) {//도서목록
					dao.selectListBook();
				}else if(no==2) {//도서대출하기
					System.out.println("====도서 검색====");
					dao.selectListBook();
					
					while(true) { //이미 대출되있으면 대출이 못되도록 while문 사용함(중복x)
						System.out.print("대출도서번호(입력중단:0) : ");
						int bk_num = Integer.parseInt(br.readLine());
						
						if(bk_num==0)
							break; //중복방지!
						int bk_status = dao.getStatusReservation(bk_num); //dao.메서드:대출 여부 확인
						if(bk_status>=1) {
							System.out.println("대출 중인 도서는 신청할 수 없습니다.");
						}else if(bk_status<0) {
							System.out.println("도서 번호를 잘못 입력했습니다.");
						}else { //나머지는 0인 경우 뿐
							
							ReservationVO vo = new ReservationVO();
							vo.setMe_num(me_num);//회원 번호
							vo.setBk_num(bk_num);//도서 번호
							
							dao.insertReservation(vo);
							break;
						}
					}
				}else if(no==3) {//MY대출목록
					dao.selectMyList(me_num);
					//도서 반납하기
					System.out.println("====도서 반납하기====");
					System.out.print("대출번호(입력중지:0): ");
					int re_num = Integer.parseInt(br.readLine());
					
					//입력중지
					if(re_num ==0) continue;//회차만 스킵 > 목록이 나와서 처리하게끔
					
					int bk_status = dao.getStatusBack(re_num, me_num);
					if(bk_status<=0) {
						System.out.println("대출하지 않은 도서는 반납할 수 없다");
						continue;
					}
					
					//반납처리
					dao.updateReservation(re_num);
					 
					
				}else if(no==4) {//종료
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력가능!!");
			}
		}
	}
	
	public static void main(String[] args) {
		new BookUserMain();
		
	}
}
