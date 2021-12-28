package kr.s02.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateMain {
	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:Xe";
		String db_id = "scott";
		String db_password = "tiger";
		
		Connection conn = null;
		Statement stmt = null;
		String sql = null;
		
		try {
			//JDBC ���� 1�ܰ� : ����̹� �ε�
			Class.forName(db_driver);
			//JDBC ���� 2�ܰ� : Connection ��ü ����
			conn = DriverManager.getConnection(db_url,db_id,db_password);
			//JDBC ���� 3�ܰ� : Statement ��ü ����
			stmt = conn.createStatement();
			
			//SQL�� �ۼ�
			sql ="UPDATE test1 SET age=90 WHERE id='sky'";//''��ҹ��� ����
			
			//JDBC ���� 4�ܰ� : SQL������ ���̺� �ݿ��Ͽ� �����ؼ� ���̺��� ���� ����
			int count = stmt.executeUpdate(sql);//������ ���� �� ��ȯ �ƹ��͵� ���� �ȵ����� 0��ȯ
			System.out.println(count+"�� ���� ������ �����߽��ϴ�.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(stmt!=null)try {stmt.close();}catch(SQLException e) {}
			if(conn!=null)try {conn.close();}catch(SQLException e) {}
		}
	}
}
