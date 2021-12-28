package kr.s06.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.s03.preparedstatement.DBUtil;

public class TransactionMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;
		String sql =  null;
		
		try {
			//*JDBC 수행 1,2 단계
			conn = DBUtil.getConnection();
			
			//트랜잭션 처리를 위해서 auto commit 해제
			conn.setAutoCommit(false);//sql문 하나일경우엔 그냥해도댐
			
			sql = "INSERT INTO test1 VALUES(?,?)";
			
			//*JDBC 수행 3단계
			pstmt1 = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt1.setString(1, "Korea");
			pstmt1.setInt(2, 10);
			
			//*JDBC 수행 4단계 : SQL문 실행
			pstmt1.executeUpdate();
//			---이렇게 3세트를 만든다---
			
			sql = "INSERT INTO test1 VALUES(?,?)";
			pstmt2 = conn.prepareStatement(sql);
			pstmt2.setString(1, "China");
			pstmt2.setInt(2, 20);
			pstmt2.executeUpdate();
			
			//의도적으로 트랜잭션 테스트를위해서 오류가있는 sql문장작성 
			sql = "INSERT INTO test1 VALUES(?,?";
			pstmt3 = conn.prepareStatement(sql);
			pstmt3.setString(1, "USA");
			pstmt3.setInt(2, 30);
			pstmt3.executeUpdate();
			
			//모든 SQL문이 정상적으로 처리 완료되면 commit
			conn.commit();
			System.out.println("작업 완료!");
			
		}catch(Exception e) {
			e.printStackTrace();
			//예외가 발생하면 ROLLBACK처리
			try {
				conn.rollback();//rollback()시 SQLException발생 해서 트라이캐치
			}catch(SQLException se) {
				se.printStackTrace();
			}
		}finally{
			//자원정리
			//pstmt1
			DBUtil.executeClose(null, pstmt1, null);
			//pstmt2
			DBUtil.executeClose(null, pstmt2, null);
			
		}
		
	}
}
