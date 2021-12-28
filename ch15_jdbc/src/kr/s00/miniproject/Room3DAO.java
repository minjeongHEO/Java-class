package kr.s00.miniproject;

import java.sql.Connection;   
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.s03.preparedstatement.DBUtil;

public class Room3DAO {
   
   
   //회원가입
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
         System.out.println(member.getM_name()+ "님의 회원가입이 완료되었습니다.");
         
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         DBUtil.executeClose(null, pstmt, conn);         
      }
   }
   
   //로그인체크 : 로그인 체크 후 로그인이 가능하면 회원번호 반환
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
   
   
   //아이디 중복체크
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
            count = 1;      //아이디존재O : count1 / 아이디존재X : COUNT0
         }      
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         DBUtil.executeClose(rs, pstmt, conn);
      }
      return count;
   }
   
   
   //회원목록
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
         System.out.println("번호\t아이디\t비밀번호\t이름\t전화번호\t가입일");
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
   
   //숙소정보 추가하기
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
         System.out.println(count + "개의 행이 추가되었습니다.");
      }
      catch(Exception e) {
         e.printStackTrace();
      }
      finally {
         DBUtil.executeClose(null, pstmt, conn);
      }
   }
   
   
   //숙소정보 수정
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
         System.out.println(count + "개의 숙소정보가 수정되었습니다.");
         
      }catch(Exception e) {
         e.printStackTrace();
      }finally{
         DBUtil.executeClose(null, pstmt, conn);
      }   
   }
   
   
   
   //숙소정보 삭제
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
         System.out.println(count + "개의 객실 정보가 삭제되었습니다.");
         
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         DBUtil.executeClose(null, pstmt, conn);
      }
   }
    
   
   
   //숙소 목록
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
         System.out.println("객실번호\t객실명\t객실예약금액\t");
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
   
 
   
   //예약자이름 안보이는 숙소 목록
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
         System.out.println("예약번호\t객실번호\t객실명\t객실예약금액\t예약가능여부\t체크인날짜\t체크아웃날짜");
         System.out.println("-------------------------------------------------------------------");
         
         while(rs.next()) {
           System.out.print(rs.getInt("re_num")+"\t");
            System.out.print(rs.getInt("ro_num")+"\t");
            System.out.print(rs.getString("ro_name")+"\t");
            System.out.print(rs.getInt("ro_amount")+"\t\t");
           
            if(rs.getInt("re_status")==1) {
               System.out.print("예약불가\t\t");
            }else {
               System.out.print("예약가능\t\t");
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
   
  
   
   //객실정보 & 예약현황 보기
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
            System.out.println("객실번호\t객실명\t객실예약금액\t예약가능여부\t예약자\t예약자ID\t체크인날짜\t\t체크아웃날짜");
            System.out.println("-------------------------------------------------------------------------------------------");
            
            while(rs.next()) {
               System.out.print(rs.getInt("ro_num")+"\t");
               System.out.print(rs.getString("ro_name")+"\t");
               System.out.print(rs.getInt("ro_amount")+"\t\t");
               if(rs.getInt("re_status")==1) {
                  System.out.print("예약불가\t\t");
               }else {
                  System.out.print("예약가능\t\t");
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
       
   
   
   //객실예약
   public void insertReservation(Reserv3VO reservation) {
      Connection conn = null;
      PreparedStatement pstmt = null;
      String sql = null;
      
      try {
         //1,2
         conn = DBUtil.getConnection();
         //3
         sql = "INSERT INTO reserv3(re_num, re_status, ro_num, m_num, re_checkin, re_checkout) "
               + " VALUES(reserv3_seq.nextval, 1, ?, ?, ?, ?)";   //예약하면 status 1로 처리
         
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, reservation.getRo_num());
         pstmt.setInt(2, reservation.getM_num());
         pstmt.setString(3, reservation.getRe_checkin());
         pstmt.setString(4, reservation.getRe_checkout());
               
         //4
         pstmt.executeUpdate();
         System.out.println(reservation.getM_num()+"님의 객실 예약이 완료되었습니다.");
         
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         DBUtil.executeClose(null, pstmt, conn);
      }
   }
   
   
   
 //MY예약현황 목록 보기
   public void selectMylist(int m_num) {
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      String sql = null;
      
      try {
         //JDBC 수행 1,2단계
         conn = DBUtil.getConnection();
         //SQL문 작성
         sql = "SELECT re_num, ro_num, ro_name, ro_amount, re_status, m_name, m_id, re_checkin, re_checkout "
               + "FROM room3 JOIN reserv3 USING(ro_num) JOIN member3 USING(m_num) WHERE m_num=? ORDER BY re_num DESC";
         //JDBC 수행 3단계 : PreparedStatement 객체 생성
         pstmt = conn.prepareStatement(sql);
         //?에 데이터 바인딩
         pstmt.setInt(1, m_num);
         //JDBC 수행 4단계 : SQL문을 수행해서 테이블로부터 결과 집합을 얻어서 
         //             ResultSet에 담고 반환
         rs = pstmt.executeQuery();
         System.out.println("---------------------------------------------------------------");
         System.out.println("예약번호\t객실번호\t객실명\t아이디\t예약자\t예약여부\t체크인\t\t체크아웃");
         System.out.println("---------------------------------------------------------------");
         while(rs.next()) {
            System.out.print(rs.getInt("re_num") + "\t");
            System.out.print(rs.getInt("ro_num")+"\t");
            System.out.print(rs.getString("ro_name") + "\t");
            System.out.print(rs.getString("m_id") + "\t");
            System.out.print(rs.getString("m_name") + "\t");
            
            
            
            if(rs.getInt("re_status") == 0) {
               System.out.print("예약 취소\t");
            }else {
               System.out.print("예약 중\t");
            }
            
            System.out.print(rs.getString("re_checkin")+ "\t");
            System.out.println(rs.getString("re_checkout")+ "\t");
            
         }
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         //자원정리 
         DBUtil.executeClose(rs, pstmt, conn);
      }
   }
   
   
   //예약취소 및 반납처리 메서드
   public void updateReservation(int re_num) {
      System.out.println("예약 번호 : " + re_num);
      Connection conn = null;
      PreparedStatement pstmt = null;
      String sql = null;
      
      
      try {
         //1,2
         conn = DBUtil.getConnection();
         
         //3   //m_num도 바꿔야하는거 아닌가 ?? nono. \변경된 처리내역을 봐야하기때문에 이건 안바꿔도 된다.
         sql = "UPDATE reserv3 SET re_status=0, re_checkin='-', re_checkout='-' WHERE re_num=?";
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1, re_num);
         
         //4  
         int count = pstmt.executeUpdate();
         System.out.println(count + "개의 객실을 반납하였습니다.");  

      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         DBUtil.executeClose(null, pstmt, conn);
      }
   }
   
   
   
 //숙소 중복 방지(status가 1이 아니어야함) = status 1이 아닌지 확인.//예약시
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
               count = rs.getInt(1);   //1이 출력되면 사용불가
            }else {
               count=-1;   //-1이 나오면 사용가능
            }
         
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         DBUtil.executeClose(rs, pstmt, conn);
      }   
      return count;
   }
    
//숙소 반납 여부 체크 //취소.반납시
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
           count = rs.getInt(1);   //1은 컬럼 인덱스(re_status)
        }else {
           count= -1;   //행이없는 경우 룸넘버가 없을 때
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


