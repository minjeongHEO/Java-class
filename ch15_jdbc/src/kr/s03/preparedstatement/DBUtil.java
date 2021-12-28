package kr.s03.preparedstatement;

import java.sql.CallableStatement;//SQL의 스토어드프로시저(Stored Procedure)를 실행시키기 위해 사용되는 인터페이스 
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class DBUtil {
	//일반적로 상수는 대문자니까 ctrl shift x
	private static final String DB_DRIVER = "oracle.jdbc.OracleDriver";
	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:Xe";
	private static final String DB_ID = "scott";
	private static final String DB_PASSWORD = "tiger";
	
	//Connection 객체 생성 및 반환하는 역할의 메서드
	public static Connection getConnection() 
			throws ClassNotFoundException,SQLException{
		//JDBC 수행 1단계 : 드라이버 로드
		Class.forName(DB_DRIVER);
		//JDBC 수행 2단계 : Connection 객체 생성
		return DriverManager.getConnection(DB_URL,DB_ID,DB_PASSWORD);
	}
	
	//자원정리하는 메서드
	public static void executeClose(ResultSet rs,
						PreparedStatement pstmt,
						Connection conn) {
		if(rs!=null)try {rs.close();}catch(SQLException e) {}
		if(pstmt!=null)try {pstmt.close();}catch(SQLException e) {}
		if(conn!=null)try {conn.close();}catch(SQLException e) {}
	}
	public static void executeClose(CallableStatement cstmt,
									Connection conn) {
		if(cstmt!=null)try {cstmt.close();}catch(SQLException e) {}
		if(cstmt!=null)try {cstmt.close();}catch(SQLException e) {}
		
	}
	
}
