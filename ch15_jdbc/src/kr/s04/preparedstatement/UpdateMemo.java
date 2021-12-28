package kr.s04.preparedstatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.s03.preparedstatement.DBUtil;

public class UpdateMemo {
	public static void main(String[] args) {
		BufferedReader br= null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("�޸� ������ �����մϴ�.");
			System.out.print("�޸� ��ȣ>");
			int num =  Integer.parseInt(br.readLine());
			System.out.print("����>");
			String title = br.readLine();
			System.out.print("�̸�>");
			String name = br.readLine();
			System.out.print("�޸�>");
			String memo = br.readLine();
			System.out.print("�̸���>");
			String email = br.readLine();
			
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			
			//sql�� �ۼ�
			sql= "UPDATE test2 SET title = ?, name = ?, memo = ?, email =? "
					+ "WHERE num =?";//WHERE�� num =?�� PK //�۹�ȣ�� ���ؼ� ������Ʈ ���� ��ȣ������ ������Ʈ���ȉ�
			
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setString(1, title);
			pstmt.setString(2, name);
			pstmt.setString(3, memo);
			pstmt.setString(4, email);
			pstmt.setInt(5, num);
			
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺� ������ ����
			int count = pstmt.executeUpdate();
			System.out.println(count+"���� �۾��� �����߽��ϴ�");
			
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺� ������ ����
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ� ����
			DBUtil.executeClose(null, pstmt, conn);
			if(br!=null)try {br.close();}catch(Exception e) {}
			
		}
	}
}
