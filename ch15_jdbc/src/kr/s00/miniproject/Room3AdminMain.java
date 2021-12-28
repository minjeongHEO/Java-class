package kr.s00.miniproject;

import java.io.BufferedReader;   
import java.io.IOException;
import java.io.InputStreamReader;

public class Room3AdminMain {
   private BufferedReader br;
   private Room3DAO dao;

   public Room3AdminMain(){ 
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

   
   public void callMenu() throws IOException{
            
      while(true) {
         System.out.println("========================================================================");
         System.out.println("1.회원목록  2.객실 등록,수정,삭제  3.객실 목록 및 예약현황  4.종료  > ");
         System.out.println("========================================================================");
         try {
            int no = Integer.parseInt(br.readLine());
            
            if(no==1) { //회원목록
               System.out.println("회원목록을 조회합니다.");
               dao.selectListMember();
               
               
            }else if(no==2) {  //객실등록, 수정, 삭제         
               while(true) {
                  System.out.println(" < 1.객실정보 등록   2.객실정보 수정   3.객실정보 삭제  4.처음화면 되돌아가기 > ");
                  
                  try {
                     int uni = Integer.parseInt(br.readLine());
                     
                     if(uni==1) {   //객실정보 등록
                        System.out.print("객실명 : ");
                        String ro_name = br.readLine();

                        System.out.print("객실가격 : ");
                        int ro_amount = Integer.parseInt(br.readLine());

                        Room3VO vo = new Room3VO();
                        vo.setRo_name(ro_name);
                        vo.setRo_amount(ro_amount);

                        dao.insertRoom(vo);
                        
                     }else if(uni==2) {   //객실정보 수정
                        //객실목록 보여주기
                        dao.selectListRoom();
                        
                        System.out.println("수정할 객실 번호 > ");
                        int ro_num = Integer.parseInt(br.readLine());
                        System.out.println("수정할 객실 이름 > ");
                        String ro_name = br.readLine();
                        System.out.println("수정할 객실 금액 >");
                        int ro_amount = Integer.parseInt(br.readLine());
                        
                        Room3VO vo = new Room3VO();
                        vo.setRo_num(ro_num);
                        vo.setRo_name(ro_name);
                        vo.setRo_amount(ro_amount);
                        
                        dao.updateRoom(vo);
                        
                        
                     }else if(uni==3) {   //객실정보 삭제
                        //객실목록 보여주기
                        dao.selectListRoom();
                        
                        
                        System.out.println("삭제할 객실 번호 >");
                        int ro_num = Integer.parseInt(br.readLine());
                        
                        Room3VO vo = new Room3VO();
                        vo.setRo_num(ro_num);
                        dao.deleteRoom(vo);
                        
                     }else if(uni==4) {   //되돌아가기
                        break;
                  
                     }else {
                        System.out.println("잘못 입력하였습니다.");
                     }
                     
                  }catch(NumberFormatException e){
                     e.printStackTrace();
                  }
               }
               
            }else if(no==3) { //객실목록 및 예약현황
               dao.detailselectListRoom();
               
               
            }else if(no==4) { //종료
               System.out.println("프로그램을 종료합니다.");
               break;
            }
            
            else {
               System.out.println("잘못입력하였습니다.");
            }
         }
         catch(NumberFormatException e) {
            System.out.println("숫자만 입력 가능합니다.");
         }
      }
   }

   
   
   public static void main(String[] args) {
      new Room3AdminMain();
   }
}