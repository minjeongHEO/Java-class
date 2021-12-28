package kr.s00.miniproject;

import java.io.BufferedReader;   
import java.io.IOException;
import java.io.InputStreamReader;

public class Room3AdminMain {
   private BufferedReader br;
   private Room3DAO dao;

   public Room3AdminMain(){ 
      dao = new Room3DAO();//RoomUserMain ������
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
         System.out.println("1.ȸ�����  2.���� ���,����,����  3.���� ��� �� ������Ȳ  4.����  > ");
         System.out.println("========================================================================");
         try {
            int no = Integer.parseInt(br.readLine());
            
            if(no==1) { //ȸ�����
               System.out.println("ȸ������� ��ȸ�մϴ�.");
               dao.selectListMember();
               
               
            }else if(no==2) {  //���ǵ��, ����, ����         
               while(true) {
                  System.out.println(" < 1.�������� ���   2.�������� ����   3.�������� ����  4.ó��ȭ�� �ǵ��ư��� > ");
                  
                  try {
                     int uni = Integer.parseInt(br.readLine());
                     
                     if(uni==1) {   //�������� ���
                        System.out.print("���Ǹ� : ");
                        String ro_name = br.readLine();

                        System.out.print("���ǰ��� : ");
                        int ro_amount = Integer.parseInt(br.readLine());

                        Room3VO vo = new Room3VO();
                        vo.setRo_name(ro_name);
                        vo.setRo_amount(ro_amount);

                        dao.insertRoom(vo);
                        
                     }else if(uni==2) {   //�������� ����
                        //���Ǹ�� �����ֱ�
                        dao.selectListRoom();
                        
                        System.out.println("������ ���� ��ȣ > ");
                        int ro_num = Integer.parseInt(br.readLine());
                        System.out.println("������ ���� �̸� > ");
                        String ro_name = br.readLine();
                        System.out.println("������ ���� �ݾ� >");
                        int ro_amount = Integer.parseInt(br.readLine());
                        
                        Room3VO vo = new Room3VO();
                        vo.setRo_num(ro_num);
                        vo.setRo_name(ro_name);
                        vo.setRo_amount(ro_amount);
                        
                        dao.updateRoom(vo);
                        
                        
                     }else if(uni==3) {   //�������� ����
                        //���Ǹ�� �����ֱ�
                        dao.selectListRoom();
                        
                        
                        System.out.println("������ ���� ��ȣ >");
                        int ro_num = Integer.parseInt(br.readLine());
                        
                        Room3VO vo = new Room3VO();
                        vo.setRo_num(ro_num);
                        dao.deleteRoom(vo);
                        
                     }else if(uni==4) {   //�ǵ��ư���
                        break;
                  
                     }else {
                        System.out.println("�߸� �Է��Ͽ����ϴ�.");
                     }
                     
                  }catch(NumberFormatException e){
                     e.printStackTrace();
                  }
               }
               
            }else if(no==3) { //���Ǹ�� �� ������Ȳ
               dao.detailselectListRoom();
               
               
            }else if(no==4) { //����
               System.out.println("���α׷��� �����մϴ�.");
               break;
            }
            
            else {
               System.out.println("�߸��Է��Ͽ����ϴ�.");
            }
         }
         catch(NumberFormatException e) {
            System.out.println("���ڸ� �Է� �����մϴ�.");
         }
      }
   }

   
   
   public static void main(String[] args) {
      new Room3AdminMain();
   }
}