package kr.s01.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMain {
	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:Xe"; //����
		String db_id = "scott";
		String db_password = "tiger";
		try {
			//JDBC ���� 1�ܰ�, ����̹� �ε�
			Class.forName(db_driver);
			//JDBC ���� 2�ܰ�, Connection ��ü ����
			Connection conn = DriverManager.getConnection(db_url,db_id,db_password);
			System.out.println("Connection��ü�� �����Ǿ����ϴ�.");
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
