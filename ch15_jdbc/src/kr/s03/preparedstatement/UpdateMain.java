package kr.s03.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			
			//SQL�� �ۼ�
			sql = "UPDATE test1 SET age=? WHERE id=?";//1������ǥ, 2������ǥ
			
			//JDBC ���� 3�ܰ� : PrepareStatement��ü ����
			pstmt = conn.prepareStatement(sql);
			//? �� ������ ���ε�
			pstmt.setInt(1, 19);//1�� ?�� ����������
			pstmt.setString(2, "star");//2�� ?�� ������ ����
			
			//JDBC ���� 4�ܰ� : SQL�� �����ؼ� ���̺��� ������ ����
			int count= pstmt.executeUpdate();
			System.out.println(count + "�� ���� ������ �����߽��ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(null, pstmt, conn);
		}
	}

}
