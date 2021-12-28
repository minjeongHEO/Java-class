package kr.s05.callablestatement;

import java.sql.CallableStatement;//SQL�� ���������ν���(Stored Procedure)�� �����Ű�� ���� ���Ǵ� �������̽� 
import java.sql.Connection;

import kr.s03.preparedstatement.DBUtil;

public class CallabelStatementMain {
	public static void main(String[] args) {
		Connection conn = null;
		CallableStatement cstmt = null; //���ν������
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			//���ν��� ȣ�⹮��
			sql="{call adjust(?,?)}"; //���ν���ȣ�� exec�� �ٸ� ������ �ڹٿ��� �����
			
			//JDBC ���� 3�ܰ� : CallableStatement ��ü ����
			cstmt = conn.prepareCall(sql);
			//?�� ������ ���ε�
			cstmt.setString(1, "SUNNY");
			cstmt.setFloat(2, 0.06f);
			
			//JDBC ���� 4�ܰ�
			cstmt.executeUpdate();
			System.out.println("�޿� ������ ���� �Ǿ����ϴ�.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(cstmt, conn);
		}
	}
}
