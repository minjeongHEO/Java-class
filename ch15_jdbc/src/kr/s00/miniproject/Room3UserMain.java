package kr.s00.miniproject;

import java.io.BufferedReader;    
import java.io.IOException;
import java.io.InputStreamReader;


public class Room3UserMain {
   private BufferedReader br;
   private Room3DAO dao;
   private boolean flag;    //�α���O:true,  �α���X:false
   private int m_num;      //ȸ����ȣ

   public Room3UserMain() { 
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

   //�޴�ȭ�鱸��
   public void callMenu() throws IOException{

      while(true) {
         System.out.println("=============================");
         System.out.print("1.�α���, 2.ȸ������, 3.���� : ");

         try {
            int no = Integer.parseInt(br.readLine());

            if(no == 1) {   //�α���
               System.out.println("�α����� �մϴ�.");
               System.out.print("���̵� : ");
               String m_id = br.readLine();

               System.out.print("��й�ȣ : ");
               String m_passwd = br.readLine(); 

               m_num = dao.loginCheck(m_id, m_passwd);
               if(m_num!=0) {
                  System.out.println(m_id + "("+m_num+")�� �α��� �Ǿ����ϴ�.");
                  flag = true;
                  break;
               }                       

            }else if(no==2) {   //ȸ������
               System.out.println("ȸ�������� �մϴ�.");
               System.out.print("���̵� >");
               String m_id = br.readLine();

               //���̵� �ߺ�üũ
               int check = dao.checkId(m_id);
               if(check == 1) {
                  System.out.println("���̵� �ߺ��Ǿ����ϴ�.");
                  continue;                  
               }

               System.out.print("��й�ȣ > ");
               String m_passwd = br.readLine();

               System.out.print("�̸� > ");
               String m_name = br.readLine();

               System.out.print("����ó > ");
               String m_phone = br.readLine();

               Member3VO vo = new Member3VO();
               vo.setM_id(m_id);
               vo.setM_passwd(m_passwd);
               vo.setM_name(m_name);
               vo.setM_phone(m_phone);

               dao.insertMember(vo);                
            }else if(no==3) {
               System.out.println("���α׷� ����");
               break;
            }else {
               System.out.println("�߸� �Է��Ͽ����ϴ�.");
            }
         }catch(NumberFormatException e) {
            System.out.println("���ڸ� �Է°���!");
         }
      }

      while(flag) {
         System.out.print("1.���Ǹ�Ϻ���, 2.�����ϱ�, 3.MY������Ȳ, 4.���� �ݳ�ó��, 5.�����ݾ� , 6.���� > ");
         try {
            int no = Integer.parseInt(br.readLine());

            if(no == 1) {
               dao.privateselectListRoom();



            }else if(no == 2) {//�����ϱ�
               System.out.println("���� �� ���Ǹ���Ʈ�� Ȯ���ϼ���");
                     dao.privateselectListRoom();

                     System.out.println("�����Ͻ� ������ ��ȣ�� �Է��ϼ���(�ǵ��ư���:0) > ");
                     int ro_num = Integer.parseInt(br.readLine());

                     if(ro_num==0) continue;
                     int re_status = dao.getStatusReservation(ro_num);
                     if(re_status==1) {
                        System.out.println("�̹� �������� ������ ������ �� �����ϴ�.");
                        continue;
                     }
                                    
                     //üũ��
                     System.out.print("����Ͻô� ���� ������ 4�ڸ��� �Է��ϼ��� (yyyy) : ");
                     String year =br.readLine();
                     boolean f = CheckCAL.checkDateYear(year);
                     if(!f) {
                        continue;
                     }
                     System.out.print("����Ͻô� ���� ���� �Է��ϼ��� (MM) : ");
                     String month =br.readLine();
                     boolean f2 = CheckCAL.checkDateMonth(month);
                     if(!f2) {
                        continue;
                     }
                     System.out.print("����Ͻô� ���� ��¥�� �Է��ϼ��� (dd): ");
                     String date =br.readLine();
                     boolean f3 = CheckCAL.checkDateDate(year, month, date);
                    if(!f3) {
                       continue;
                    }
                    String re_checkin = year.toString()+"-"+month.toString()+"-"+date.toString(); 

                    //üũ�ƿ�
                    System.out.print("����Ͻô� üũ�ƿ� ������ 4�ڸ��� �Է��ϼ���(yyyy) : ");
                    String year2 =br.readLine();
                    boolean ff = CheckCAL.checkDateYear(year);
                    if(!ff) {
                       continue;
                    }
                    System.out.print("����Ͻô� üũ�ƿ� ���� �Է��ϼ��� (MM) : ");
                    String month2 =br.readLine();
                    boolean ff2 = CheckCAL.checkDateMonth(month);
                    if(!ff2) {
                       continue;
                    }
                    System.out.print("����Ͻô� üũ�ƿ� ��¥�� �Է��ϼ��� (dd): ");
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
               
            }else if(no == 3) {//MY������Ȳ

               //������
               dao.selectMylist(m_num);

               //��������ϱ�
               System.out.println("�ǵ��ư���:0");
               int re_num = Integer.parseInt(br.readLine());
               if(re_num == 0) continue;

               //�ߺ������޼���
               dao.getStatusReservation(re_num);

               //������Ҹ޼���
               dao.updateReservation(re_num);

               //�Է�����

            }else if(no == 4) { //���ǹݳ��ϱ�
               System.out.println("my���� ����Ʈ�Դϴ�.");
               dao.selectMylist(m_num);
               System.out.println("-----------------------------------");

               while(true) {
                  System.out.println("�ݳ��� �����ȣ(�ǵ��ư���:0) > ");
                  int re_num = Integer.parseInt(br.readLine());
                  //�Է�����
                  if(re_num==0) break;
                  //����üũ
                  int re_status = dao.getStatusBack(re_num,m_num);
                  System.out.println("üũ : " + re_status);
                  if(re_status<=0) {
                     System.out.println("�������� ���� ������ �ݳ��� �Ұ��մϴ�.");
                     continue;
                  }
                  //�ݳ�ó��
                  dao.updateReservation(re_num);     
               }


            }else if(no == 5) {//�����ݾ�
            
               
               int a = m_num;
               int count = dao.roomtax(a);
               System.out.println("�����Ͻ� ����(��)�� ���� �ݾ� : " + count);               
               
               System.out.println("===================================");
               
            }else if(no==6) {//����
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
      new Room3UserMain();

   }
}