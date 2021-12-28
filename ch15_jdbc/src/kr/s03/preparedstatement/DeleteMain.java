package kr.s03.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			
			//SQL���� �ۼ�
			sql = "DELETE FROM test1 WHERE id=?";//where�� �ݵ���־���ϰ� �ѹ��Ҽ�������
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setString(1, "star");//1�� ?�� ������ ����
			
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺��� ���� ����
			int count = pstmt.executeUpdate();//sql������ �̹� prepareStatement ��ü�ȿ� �����Ǽ� ������ȉ´�
			System.out.println(count+"�� ���� �����߽��ϴ�.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ� ����
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
}
