package kr.s00.miniproject;

import java.sql.Connection;   
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.s03.preparedstatement.DBUtil;

public class Room3DAO {
   
   
   //ȸ������
   public void insertMember(Member3VO member) {
      Connection conn = null;
      PreparedStatement pstmt = null;
      String sql = null;
      
      try {
         //1,2
         conn = DBUtil.getConnection();
         
         //3
         sql = "INSERT INTO member3(m_num, m_id, m_passwd, m_name, m_phone) "
               + " VALUES(member3_seq.nextval, ?, ?, ?, ?)";
         
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, member.getM_id());
         pstmt.setString(2, member.getM_passwd());
         pstmt.setString(3, member.getM_name());
         pstmt.setString(4, member.getM_phone());
         
         //4
         pstmt.executeUpdate();
         System.out.println(member.getM_name()+ "���� ȸ�������� �Ϸ�Ǿ����ϴ�.");
         
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         DBUtil.executeClose(null, pstmt, conn);         
      }
   }
   
   //�α���üũ : �α��� üũ �� �α����� �����ϸ� ȸ����ȣ ��ȯ
   public int loginCheck(String m_id, String m_passwd) {
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      String sql = null;
      int m_num = 0;
      
      try {
         //1,2
         conn = DBUtil.getConnection();
         
         //3
         sql = "SELECT m_num FROM member3 WHERE m_id=? AND m_passwd=?";
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, m_id);
         pstmt.setString(2, m_passwd);
         
         //4
         rs=pstmt.executeQuery();
         if(rs.next()) {
            m_num=rs.getInt(1);
         }   
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         DBUtil.executeClose(rs, pstmt, conn);
      }
      return m_num;
   }
   
   
   //���̵� �ߺ�üũ
   public int checkId(String m_id) {
      Connection conn=null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      String sql = null;
      int count = 0;
      
      try {
         //1,2
         conn = DBUtil.getConnection();
         
         //3
         sql = "SELECT m_id FROM member3 WHERE m_id=?";
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, m_id);
         
         //4
         rs = pstmt.executeQuery();
         if(rs.next()) {
            count = 1;      //���̵�����O : count1 / ���̵�����X : COUNT0
         }      
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         DBUtil.executeClose(rs, pstmt, conn);
      }
      return count;
   }
   
   
   //ȸ�����
   public void selectListMember() {
      Connection conn = null;
      PreparedStatement pstmt = null;
      String sql = null;
      ResultSet rs = null;
      
      try {
         //1,2
         conn = DBUtil.getConnection();
         
         //3
         sql = "SELECT * FROM member3 ORDER BY m_num DESC";
         pstmt = conn.prepareStatement(sql);
         
         //4      
         rs = pstmt.executeQuery();
         
         System.out.println("---------------------------------------------------");
         System.out.println("��ȣ\t���̵�\t��й�ȣ\t�̸�\t��ȭ��ȣ\t������");
         System.out.println("---------------------------------------------------");
         
         while(rs.next()) {
            System.out.print(rs.getInt("m_num") + "\t");
            System.out.print(rs.getString("m_id") + "\t");
            System.out.print(rs.getString("m_passwd") + "\t");
            System.out.print(rs.getString("m_name") + "\t");
            System.out.print(rs.getString("m_phone") + "\t");
            System.out.println(rs.getDate("m_regdate") + "\t");
         }
         System.out.println("---------------------------------------------------");
         
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         DBUtil.executeClose(null, pstmt, conn);
      }
   }
   
//************************************************************************************************
   
   //�������� �߰��ϱ�
   public void insertRoom(Room3VO room) {
      Connection conn = null;
      PreparedStatement pstmt = null;
      String sql = null;
      
      try {
         conn = DBUtil.getConnection();
         
         sql = "INSERT INTO room3 (ro_num, ro_name, ro_amount) VALUES(room3_seq.nextval,?,?)";
         
         pstmt = conn.prepareStatement(sql);
         
         pstmt.setString(1, room.getRo_name());
         pstmt.setInt(2, room.getRo_amount());
         
         int count = pstmt.executeUpdate();
         System.out.println(count + "���� ���� �߰��Ǿ����ϴ�.");
      }
      catch(Exception e) {
         e.printStackTrace();
      }
      finally {
         DBUtil.executeClose(null, pstmt, conn);
      }
   }
   
   
   //�������� ����
   public void updateRoom(Room3VO room3) {
      Connection conn = null;
      PreparedStatement pstmt = null;
      String sql = null;
      
      try {
         //1,2
         conn = DBUtil.getConnection();
         //3
         sql = "UPDATE room3 SET ro_name =?, ro_amount=? WHERE ro_num=?  ";
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, room3.getRo_name());
         pstmt.setInt(2, room3.getRo_amount());
         pstmt.setInt(3, room3.getRo_num());
         
         //4
         int count = pstmt.executeUpdate();
         System.out.println(count + "���� ���������� �����Ǿ����ϴ�.");
         
      }catch(Exception e) {
         e.printStackTrace();
      }finally{
         DBUtil.executeClose(null, pstmt, conn);
      }   
   }
   
   
   
   //�������� ����
   public void deleteRoom(Room3VO room3) {
      Connection conn = null;
      PreparedStatement pstmt = null;
      String sql = null;
      
      try {
         //1,2
         conn = DBUtil.getConnection();
         
         //3
         sql = "DELETE FROM room3 WHERE ro_num = ?";
         
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, room3.getRo_num());
         
         //4
         int count = pstmt.executeUpdate();
         System.out.println(count + "���� ���� ������ �����Ǿ����ϴ�.");
         
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         DBUtil.executeClose(null, pstmt, conn);
      }
   }
    
   
   
   //���� ���
   public void selectListRoom() {
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs= null;
      String sql = null;
      
      try {
         conn = DBUtil.getConnection();
         
         sql = "SELECT * FROM room3 ORDER BY ro_num DESC";
         
         pstmt = conn.prepareStatement(sql);
         
         rs = pstmt.executeQuery();
         
         System.out.println("-------------------------------------");
         System.out.println("���ǹ�ȣ\t���Ǹ�\t���ǿ���ݾ�\t");
         System.out.println("-------------------------------------");
         
         while(rs.next()) {
            System.out.print(rs.getInt("ro_num")+"\t");
            System.out.print(rs.getString("ro_name")+"\t");
            System.out.println(rs.getInt("ro_amount")+"\t");
         }
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         DBUtil.executeClose(rs, pstmt, conn);
      }
   }
   
 
   
   //�������̸� �Ⱥ��̴� ���� ���
   public void privateselectListRoom() {
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs= null;
      String sql = null;
      
      try {
         conn = DBUtil.getConnection();
         
         sql = "SELECT re_num, ro_num, ro_name, ro_amount, re_status, re_checkin, re_checkout "
               + "FROM room3 LEFT OUTER JOIN (SELECT * FROM reserv3 WHERE re_status=1) USING(ro_num) ORDER BY re_status";
         
         pstmt = conn.prepareStatement(sql);
         
         rs = pstmt.executeQuery();
         
         System.out.println("-------------------------------------------------------------------");
         System.out.println("�����ȣ\t���ǹ�ȣ\t���Ǹ�\t���ǿ���ݾ�\t���డ�ɿ���\tüũ�γ�¥\tüũ�ƿ���¥");
         System.out.println("-------------------------------------------------------------------");
         
         while(rs.next()) {
           System.out.print(rs.getInt("re_num")+"\t");
            System.out.print(rs.getInt("ro_num")+"\t");
            System.out.print(rs.getString("ro_name")+"\t");
            System.out.print(rs.getInt("ro_amount")+"\t\t");
           
            if(rs.getInt("re_status")==1) {
               System.out.print("����Ұ�\t\t");
            }else {
               System.out.print("���డ��\t\t");
            }
            
            
            System.out.print(rs.getString("re_checkin")+"\t");
            System.out.println(rs.getString("re_checkout")+"\t");
            
         }
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         DBUtil.executeClose(rs, pstmt, conn);
      }
   }
   
  
   
   //�������� & ������Ȳ ����
   public void detailselectListRoom() {
         Connection conn = null;
         PreparedStatement pstmt = null;
         ResultSet rs= null;
         String sql = null;
         
         try {
            conn = DBUtil.getConnection();
            
            sql = "SELECT ro_num, ro_name, ro_amount, re_status, m_name, m_id, re_checkin, re_checkout "
                  + "FROM room3 LEFT OUTER JOIN reserv3 USING(ro_num) LEFT OUTER JOIN member3 USING(m_num) ORDER BY re_status";

            
            pstmt = conn.prepareStatement(sql);
            
            rs = pstmt.executeQuery();
            
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("���ǹ�ȣ\t���Ǹ�\t���ǿ���ݾ�\t���డ�ɿ���\t������\t������ID\tüũ�γ�¥\t\tüũ�ƿ���¥");
            System.out.println("-------------------------------------------------------------------------------------------");
            
            while(rs.next()) {
               System.out.print(rs.getInt("ro_num")+"\t");
               System.out.print(rs.getString("ro_name")+"\t");
               System.out.print(rs.getInt("ro_amount")+"\t\t");
               if(rs.getInt("re_status")==1) {
                  System.out.print("����Ұ�\t\t");
               }else {
                  System.out.print("���డ��\t\t");
               }
               System.out.print(rs.getString("m_name")+"\t");
               System.out.print(rs.getString("m_id")+"\t");
               System.out.print(rs.getString("re_checkin")+"\t");
               System.out.println(rs.getString("re_checkout")+"\t");   
            }
         }catch(Exception e) {
            e.printStackTrace();
         }finally {
            DBUtil.executeClose(rs, pstmt, conn);
         }
      }
       
   
   
   //���ǿ���
   public void insertReservation(Reserv3VO reservation) {
      Connection conn = null;
      PreparedStatement pstmt = null;
      String sql = null;
      
      try {
         //1,2
         conn = DBUtil.getConnection();
         //3
         sql = "INSERT INTO reserv3(re_num, re_status, ro_num, m_num, re_checkin, re_checkout) "
               + " VALUES(reserv3_seq.nextval, 1, ?, ?, ?, ?)";   //�����ϸ� status 1�� ó��
         
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, reservation.getRo_num());
         pstmt.setInt(2, reservation.getM_num());
         pstmt.setString(3, reservation.getRe_checkin());
         pstmt.setString(4, reservation.getRe_checkout());
               
         //4
         pstmt.executeUpdate();
         System.out.println(reservation.getM_num()+"���� ���� ������ �Ϸ�Ǿ����ϴ�.");
         
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         DBUtil.executeClose(null, pstmt, conn);
      }
   }
   
   
   
 //MY������Ȳ ��� ����
   public void selectMylist(int m_num) {
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      String sql = null;
      
      try {
         //JDBC ���� 1,2�ܰ�
         conn = DBUtil.getConnection();
         //SQL�� �ۼ�
         sql = "SELECT re_num, ro_num, ro_name, ro_amount, re_status, m_name, m_id, re_checkin, re_checkout "
               + "FROM room3 JOIN reserv3 USING(ro_num) JOIN member3 USING(m_num) WHERE m_num=? ORDER BY re_num DESC";
         //JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
         pstmt = conn.prepareStatement(sql);
         //?�� ������ ���ε�
         pstmt.setInt(1, m_num);
         //JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺�κ��� ��� ������ �� 
         //             ResultSet�� ��� ��ȯ
         rs = pstmt.executeQuery();
         System.out.println("---------------------------------------------------------------");
         System.out.println("�����ȣ\t���ǹ�ȣ\t���Ǹ�\t���̵�\t������\t���࿩��\tüũ��\t\tüũ�ƿ�");
         System.out.println("---------------------------------------------------------------");
         while(rs.next()) {
            System.out.print(rs.getInt("re_num") + "\t");
            System.out.print(rs.getInt("ro_num")+"\t");
            System.out.print(rs.getString("ro_name") + "\t");
            System.out.print(rs.getString("m_id") + "\t");
            System.out.print(rs.getString("m_name") + "\t");
            
            
            
            if(rs.getInt("re_status") == 0) {
               System.out.print("���� ���\t");
            }else {
               System.out.print("���� ��\t");
            }
            
            System.out.print(rs.getString("re_checkin")+ "\t");
            System.out.println(rs.getString("re_checkout")+ "\t");
            
         }
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         //�ڿ����� 
         DBUtil.executeClose(rs, pstmt, conn);
      }
   }
   
   
   //������� �� �ݳ�ó�� �޼���
   public void updateReservation(int re_num) {
      System.out.println("���� ��ȣ : " + re_num);
      Connection conn = null;
      PreparedStatement pstmt = null;
      String sql = null;
      
      
      try {
         //1,2
         conn = DBUtil.getConnection();
         
         //3   //m_num�� �ٲ���ϴ°� �ƴѰ� ?? nono. \����� ó�������� �����ϱ⶧���� �̰� �ȹٲ㵵 �ȴ�.
         sql = "UPDATE reserv3 SET re_status=0, re_checkin='-', re_checkout='-' WHERE re_num=?";
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, re_num);
         
         //4  
         int count = pstmt.executeUpdate();
         System.out.println(count + "���� ������ �ݳ��Ͽ����ϴ�.");  

      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         DBUtil.executeClose(null, pstmt, conn);
      }
   }
   
   
   
 //���� �ߺ� ����(status�� 1�� �ƴϾ����) = status 1�� �ƴ��� Ȯ��.//�����
   public int getStatusReservation(int ro_num) {
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      String sql = null;
      int count = 0;
      
      try {
         //1,2
         conn = DBUtil.getConnection();
               
         //3
         sql = "SELECT re_status FROM reserv3 WHERE ro_num=? ";
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, ro_num);
            
         //4
            rs = pstmt.executeQuery();
          if(rs.next()) {
               count = rs.getInt(1);   //1�� ��µǸ� ���Ұ�
            }else {
               count=-1;   //-1�� ������ ��밡��
            }
         
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         DBUtil.executeClose(rs, pstmt, conn);
      }   
      return count;
   }
    
//���� �ݳ� ���� üũ //���.�ݳ���
   public int getStatusBack(int ro_num, int m_num) {
     Connection conn = null;
     PreparedStatement pstmt = null;
     ResultSet rs = null;
      String sql = null;
      int count = 0;
            
     try {
        //1,2
        conn = DBUtil.getConnection();
        sql = "SELECT re_status FROM reserv3 WHERE re_num=? AND m_num=?";
        //3
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, ro_num);
        pstmt.setInt(2, m_num);
        //4
          rs = pstmt.executeQuery();
        if(rs.next()) {
           count = rs.getInt(1);   //1�� �÷� �ε���(re_status)
        }else {
           count= -1;   //���̾��� ��� ��ѹ��� ���� ��
        }
     }catch(Exception e) {
        e.printStackTrace();
     }finally {
        DBUtil.executeClose(rs, pstmt, conn);
     }   
        return count;
   }
   
 
      public int roomtax(int m_num) {
         Connection conn=null;
         PreparedStatement pstmt = null;
         ResultSet rs = null;
         String sql = null;

         int count = 0;

            try{
               //1,2
               conn = DBUtil.getConnection();
               //3
               sql = "SELECT TAX(ro_amount) FROM room3 JOIN reserv3 USING(ro_num) WHERE m_num=?";
               pstmt=conn.prepareStatement(sql);
               pstmt.setInt(1, m_num);
               //4
               rs = pstmt.executeQuery();

               if(rs.next()) {
                  count = rs.getInt(1);
               }
            }catch(Exception e) {
               e.printStackTrace();
            }finally {
               DBUtil.executeClose(rs, pstmt, conn);
            }
         
         return count;
      
         }
      
   }


