package kr.s04.preparedstatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.s03.preparedstatement.DBUtil;

public class SelectDetailMemo {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("�޸� ���������� ��ȸ�մϴ�.");
			System.out.print("�޸� ��ȣ>");
			int num = Integer.parseInt(br.readLine());
			
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			
			//sql�� �ۼ�
			sql="SELECT * FROM test2 WHERE num = ?";
					
			//JDBC ���� 3�ܰ� : preparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setInt(1, num);
			
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺�κ��� �� ���� ���ڵ带 ���
			//				ResultSet�� ��Ƽ� ��ȯ�Ѵ�.
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("��ȣ : "+ rs.getInt("num"));
				System.out.println("���� : "+ rs.getString("title"));
				System.out.println("�ۼ��� : "+ rs.getString("name"));
				System.out.println("���� : "+ rs.getString("memo"));
				System.out.println("�̸��� : "+ rs.getString("email"));
				System.out.println("�ۼ��� : "+ rs.getString("reg_date"));
			}else {
				System.out.println("�˻��� �����Ͱ� �����ϴ�.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(rs, pstmt, conn);
			if(br!=null)try {br.close();}catch(Exception e) {}
		}
	}

}
