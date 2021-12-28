package kr.s00.miniproject;

import java.io.BufferedReader;    
import java.io.IOException;
import java.io.InputStreamReader;


public class Room3UserMain {
   private BufferedReader br;
   private Room3DAO dao;
   private boolean flag;    //로그인O:true,  로그인X:false
   private int m_num;      //회원번호

   public Room3UserMain() { 
      dao = new Room3DAO();//RoomUserMain 생성자

      try {
         br = new BufferedReader(new InputStreamReader(System.in));
         callMenu();
      }
      catch(IOException e) {
         e.printStackTrace();
      }
      finally {
         if(br!=null)try {br.close();}catch(Exception e) {};
      }
   }

   //메뉴화면구현
   public void callMenu() throws IOException{

      while(true) {
         System.out.println("=============================");
         System.out.print("1.로그인, 2.회원가입, 3.종료 : ");

         try {
            int no = Integer.parseInt(br.readLine());

            if(no == 1) {   //로그인
               System.out.println("로그인을 합니다.");
               System.out.print("아이디 : ");
               String m_id = br.readLine();

               System.out.print("비밀번호 : ");
               String m_passwd = br.readLine(); 

               m_num = dao.loginCheck(m_id, m_passwd);
               if(m_num!=0) {
                  System.out.println(m_id + "("+m_num+")님 로그인 되었습니다.");
                  flag = true;
                  break;
               }                       

            }else if(no==2) {   //회원가입
               System.out.println("회원가입을 합니다.");
               System.out.print("아이디 >");
               String m_id = br.readLine();

               //아이디 중복체크
               int check = dao.checkId(m_id);
               if(check == 1) {
                  System.out.println("아이디가 중복되었습니다.");
                  continue;                  
               }

               System.out.print("비밀번호 > ");
               String m_passwd = br.readLine();

               System.out.print("이름 > ");
               String m_name = br.readLine();

               System.out.print("연락처 > ");
               String m_phone = br.readLine();

               Member3VO vo = new Member3VO();
               vo.setM_id(m_id);
               vo.setM_passwd(m_passwd);
               vo.setM_name(m_name);
               vo.setM_phone(m_phone);

               dao.insertMember(vo);                
            }else if(no==3) {
               System.out.println("프로그램 종료");
               break;
            }else {
               System.out.println("잘못 입력하였습니다.");
            }
         }catch(NumberFormatException e) {
            System.out.println("숫자만 입력가능!");
         }
      }

      while(flag) {
         System.out.print("1.객실목록보기, 2.예약하기, 3.MY예약현황, 4.객실 반납처리, 5.결제금액 , 6.종료 > ");
         try {
            int no = Integer.parseInt(br.readLine());

            if(no == 1) {
               dao.privateselectListRoom();



            }else if(no == 2) {//예약하기
               System.out.println("예약 전 객실리스트를 확인하세요");
                     dao.privateselectListRoom();

                     System.out.println("예약하실 객실의 번호를 입력하세요(되돌아가기:0) > ");
                     int ro_num = Integer.parseInt(br.readLine());

                     if(ro_num==0) continue;
                     int re_status = dao.getStatusReservation(ro_num);
                     if(re_status==1) {
                        System.out.println("이미 예약중인 객실은 선택할 수 없습니다.");
                        continue;
                     }
                                    
                     //체크인
                     System.out.print("희망하시는 예약 연도를 4자리를 입력하세요 (yyyy) : ");
                     String year =br.readLine();
                     boolean f = CheckCAL.checkDateYear(year);
                     if(!f) {
                        continue;
                     }
                     System.out.print("희망하시는 예약 월을 입력하세요 (MM) : ");
                     String month =br.readLine();
                     boolean f2 = CheckCAL.checkDateMonth(month);
                     if(!f2) {
                        continue;
                     }
                     System.out.print("희망하시는 예약 날짜를 입력하세요 (dd): ");
                     String date =br.readLine();
                     boolean f3 = CheckCAL.checkDateDate(year, month, date);
                    if(!f3) {
                       continue;
                    }
                    String re_checkin = year.toString()+"-"+month.toString()+"-"+date.toString(); 

                    //체크아웃
                    System.out.print("희망하시는 체크아웃 연도를 4자리를 입력하세요(yyyy) : ");
                    String year2 =br.readLine();
                    boolean ff = CheckCAL.checkDateYear(year);
                    if(!ff) {
                       continue;
                    }
                    System.out.print("희망하시는 체크아웃 월욜 입력하세요 (MM) : ");
                    String month2 =br.readLine();
                    boolean ff2 = CheckCAL.checkDateMonth(month);
                    if(!ff2) {
                       continue;
                    }
                    System.out.print("희망하시는 체크아웃 날짜를 입력하세요 (dd): ");
                    String date2 =br.readLine();
                    boolean ff3 = CheckCAL.checkDateDate(year, month, date);
                   if(!ff3) {
                      continue;
                   }
                   String re_checkout = year2.toString()+"-"+month2.toString()+"-"+date2.toString();
                            
                    
                    if(re_status<=0) {
                        Reserv3VO vo = new Reserv3VO();
                        vo.setM_num(m_num); 
                        vo.setRo_num(ro_num);
                        vo.setRe_checkin(re_checkin);
                        vo.setRe_checkout(re_checkout);

                        dao.insertReservation(vo);
                        continue;
                     }


               
               if(re_status<=0) {
                  Reserv3VO vo = new Reserv3VO();
                  vo.setM_num(m_num); 
                  vo.setRo_num(ro_num);
                  vo.setRe_checkin(re_checkin);
                  vo.setRe_checkout(re_checkout);

                  dao.insertReservation(vo);
                  continue;
               }
               
            }else if(no == 3) {//MY예약현황

               //예약목록
               dao.selectMylist(m_num);

               //예약취소하기
               System.out.println("되돌아가기:0");
               int re_num = Integer.parseInt(br.readLine());
               if(re_num == 0) continue;

               //중복방지메서드
               dao.getStatusReservation(re_num);

               //예약취소메서드
               dao.updateReservation(re_num);

               //입력중지

            }else if(no == 4) { //객실반납하기
               System.out.println("my객실 리스트입니다.");
               dao.selectMylist(m_num);
               System.out.println("-----------------------------------");

               while(true) {
                  System.out.println("반납할 예약번호(되돌아가기:0) > ");
                  int re_num = Integer.parseInt(br.readLine());
                  //입력중지
                  if(re_num==0) break;
                  //여부체크
                  int re_status = dao.getStatusBack(re_num,m_num);
                  System.out.println("체크 : " + re_status);
                  if(re_status<=0) {
                     System.out.println("예약하지 않은 객실은 반납이 불가합니다.");
                     continue;
                  }
                  //반납처리
                  dao.updateReservation(re_num);     
               }


            }else if(no == 5) {//결제금액
            
               
               int a = m_num;
               int count = dao.roomtax(a);
               System.out.println("예약하신 객실(들)의 할인 금액 : " + count);               
               
               System.out.println("===================================");
               
            }else if(no==6) {//종료
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
      new Room3UserMain();

   }
}