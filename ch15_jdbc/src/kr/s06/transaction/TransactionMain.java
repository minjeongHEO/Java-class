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
			//*JDBC ���� 1,2 �ܰ�
			conn = DBUtil.getConnection();
			
			//Ʈ����� ó���� ���ؼ� auto commit ����
			conn.setAutoCommit(false);//sql�� �ϳ��ϰ�쿣 �׳��ص���
			
			sql = "INSERT INTO test1 VALUES(?,?)";
			
			//*JDBC ���� 3�ܰ�
			pstmt1 = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt1.setString(1, "Korea");
			pstmt1.setInt(2, 10);
			
			//*JDBC ���� 4�ܰ� : SQL�� ����
			pstmt1.executeUpdate();
//			---�̷��� 3��Ʈ�� �����---
			
			sql = "INSERT INTO test1 VALUES(?,?)";
			pstmt2 = conn.prepareStatement(sql);
			pstmt2.setString(1, "China");
			pstmt2.setInt(2, 20);
			pstmt2.executeUpdate();
			
			//�ǵ������� Ʈ����� �׽�Ʈ�����ؼ� �������ִ� sql�����ۼ� 
			sql = "INSERT INTO test1 VALUES(?,?";
			pstmt3 = conn.prepareStatement(sql);
			pstmt3.setString(1, "USA");
			pstmt3.setInt(2, 30);
			pstmt3.executeUpdate();
			
			//��� SQL���� ���������� ó�� �Ϸ�Ǹ� commit
			conn.commit();
			System.out.println("�۾� �Ϸ�!");
			
		}catch(Exception e) {
			e.printStackTrace();
			//���ܰ� �߻��ϸ� ROLLBACKó��
			try {
				conn.rollback();//rollback()�� SQLException�߻� �ؼ� Ʈ����ĳġ
			}catch(SQLException se) {
				se.printStackTrace();
			}
		}finally{
			//�ڿ�����
			//pstmt1
			DBUtil.executeClose(null, pstmt1, null);
			//pstmt2
			DBUtil.executeClose(null, pstmt2, null);
			
		}
		
	}
}
