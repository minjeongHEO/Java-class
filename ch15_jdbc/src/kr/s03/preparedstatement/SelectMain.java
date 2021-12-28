package kr.s03.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class SelectMain {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		String sql = null;
		
		try {
			//JDBC ���� 1�ܰ� : ����̹� �ε�
			//JDBC ���� 2�ܰ� : Connection ��ü ����
			conn = DBUtil.getConnection();
			
			//SQL�� �ۼ�
			sql = "SELECT * FROM test1";
			
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);//sql�� �־��ش�.,createStatement();����  
			
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺� �ݿ��ϰ� ��������� ResultSet�� ��Ƽ� ��ȯ
			rs = pstmt.executeQuery();//������ ����� sql����
			System.out.println("ID\t����");
			while(rs.next()) {
				System.out.print(rs.getString("id")+"\t");
				System.out.println(rs.getInt("age"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ� ����
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	
}
