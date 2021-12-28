package kr.s02.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMain {
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
			//JDBC ���� 2�ܰ� : Connection ��ü ����(ID,��й�ȣ ����)
			conn = DriverManager.getConnection(db_url,db_id,db_password);
			//JDBC ���� 3�ܰ� : Statement ��ü ����
			stmt = conn.createStatement();
			
			//SQL�� �ۼ�
			sql = "INSERT INTO test1(id,age) VALUES ('se''t',10)";//�Ϲݹ��ڷ� �ٲ���''�ΰ�
			
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� �ϳ��� ���� ����
			//���� �۾� �� ������ ���� ������ ��ȯ
			int count = stmt.executeUpdate(sql);
			System.out.println(count+"���� ���� �߰��߽��ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			if(stmt!=null)try {stmt.close();}catch(SQLException e) {}
			if(conn!=null)try {conn.close();}catch(SQLException e) {}
			//�ڿ�����
		}
		
	}
}
