package ch12;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.s03.preparedstatement.DBUtil;

public class test02 {

   public void money(int m_num) { //예약자가 예약을 2개이상했으면 메인에서 *0.8
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      String sql = null;
	      int count = 0;
	      
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
	                      
	      public void money(int m_num) { //예약자가 예약을 2개이상했으면 메인에서 *0.8
	    	  Connection conn = null;
	    	  PreparedStatement pstmt = null;
	    	  ResultSet rs = null;
	    	  String sql = null;
	    	    int count = 0;
	            sql = "SELECT COUNT(re_status) FROM reserv3 WHERE=?";
	            pstmt = conn.prepareStatement(sql);		
	            pstmt.setInt(1, m_num);
	            rs = pstmt.executeQuery();
	            if(rs.next()) {
	            	count = rs.getInt(1);
	            }else {
	            	count=2;
	            }
	             			ro_amount*0.8
	             }catch(Exception e) {
	                 e.printStackTrace();
	              }finally {
	                 DBUtil.executeClose(rs, pstmt, conn);
	              }   
	              return count;
	           }
	    
	
	
}
