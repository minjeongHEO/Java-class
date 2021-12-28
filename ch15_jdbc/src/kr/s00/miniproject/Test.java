package kr.s00.miniproject;


import java.sql.Connection;   
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import kr.s03.preparedstatement.DBUtil;

public class Test {
   public static int roomtax(int m_num) throws Exception{
      Connection conn=null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      String sql = null;

      int count = 0;

//      if(a>=200000) {
         try{
            //1,2
            conn = DBUtil.getConnection();
            //3
            sql = "SELECT TAX(ro_amount) FROM room3 JOIN reserv3 USING(ro_num) WHERE m_num=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,m_num);
            //4
            rs = pstmt.executeQuery();

            if(rs.next()) {
               count = rs.getInt(1);
               
            }
         }catch(NumberFormatException e) {
            e.printStackTrace();
         }finally {
            DBUtil.executeClose(rs, pstmt, conn);
         }
//      }
      return count;
//      System.out.println(count);
   }

   public static void main(String[] args) throws Exception {
      roomtax(1);
   }
}