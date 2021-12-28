package kr.s02.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DeleteMain {
	public static void main(String[] args) {	
		/*
		 * 데이터베이스 연동 작업
		 * CRUD작업			SQL문장
		 * C crete(생성)		insert
		 * R read(읽기)		select
		 * U update(갱신)		update
		 * D delete(삭제)		delete
		 */
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:Xe";
		String db_id = "scott";
		String db_password = "tiger";
		
		Connection conn = null;
		Statement stmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1단계 : 드라이버 로드
			Class.forName(db_driver);
			
			//JDBC 수행 2단계 : Connection객체 생성
			conn=DriverManager.getConnection(db_url,db_id,db_password);
			
			//JDBC 수행 3단계 : Statement객체 생성
			stmt = conn.createStatement();
			
			//SQL문 작성
			sql = "DELETE FROM test1 WHERE id='dragon'";
			
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블의 행을 삭제
			//행을 삭제한 후 삭제한 행의 갯수를 반환
			int count = stmt.executeUpdate(sql);
			System.out.println(count+"개 행을 삭제했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(stmt!=null)try {stmt.close();}catch(SQLException e) {}
			if(conn!=null)try {conn.close();}catch(SQLException e) {}
		}
	}
}
