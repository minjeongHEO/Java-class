package kr.s03.preparedstatement;

import java.sql.CallableStatement;//SQL�� ���������ν���(Stored Procedure)�� �����Ű�� ���� ���Ǵ� �������̽� 
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class DBUtil {
	//�Ϲ����� ����� �빮�ڴϱ� ctrl shift x
	private static final String DB_DRIVER = "oracle.jdbc.OracleDriver";
	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:Xe";
	private static final String DB_ID = "scott";
	private static final String DB_PASSWORD = "tiger";
	
	//Connection ��ü ���� �� ��ȯ�ϴ� ������ �޼���
	public static Connection getConnection() 
			throws ClassNotFoundException,SQLException{
		//JDBC ���� 1�ܰ� : ����̹� �ε�
		Class.forName(DB_DRIVER);
		//JDBC ���� 2�ܰ� : Connection ��ü ����
		return DriverManager.getConnection(DB_URL,DB_ID,DB_PASSWORD);
	}
	
	//�ڿ������ϴ� �޼���
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
