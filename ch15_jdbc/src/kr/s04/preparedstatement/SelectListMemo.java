package kr.s04.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.s03.preparedstatement.DBUtil;

public class SelectListMemo {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			
			//SQL�� �ۼ�
			sql = "SELECT * FROM test2 ORDER BY num DESC";//?�� �����ϱ� �޼���ȣ�����
			//�Ϲ������� ��Ͽ����� PK�� ��������Ѵ� �ֽ������ؾߵǱ⶧����
			
			//JDBC ���� 3�ܰ� : preparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
					
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺�κ��� ��������� ���
			//					ResultSet�� ��Ƽ� ��ȯ
			rs= pstmt.executeQuery();
			System.out.println("��ȣ\t����\t�ۼ���\t�ۼ���");
			System.out.println("-----------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("num")+"\t");
				System.out.print(rs.getString("title")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.println(rs.getDate("reg_date"));//getString�� ����
//				System.out.println(rs.getString("reg_date"));//getDate�� ����
				
			}
		}catch(Exception e) {
			
			
		}finally {
			//�ڿ� ����
			DBUtil.executeClose(rs, pstmt, conn);	
		}
	}
}
