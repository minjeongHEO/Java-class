package kr.s04.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.s03.preparedstatement.DBUtil;//�ڵ����� import

import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class InsertMemo {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection conn = null;
		String sql = null;
		PreparedStatement pstmt = null;
		
//		String title,name,memo,email;//�Ǵ�try���ȿ��� �־ �ȴ�.
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("�޸� �Է��մϴ�.");
			System.out.print("����>");
			String title = br.readLine(); //�̷�������.
			System.out.print("�̸�>");
			String name = br.readLine();
			System.out.print("�޸�>");
			String memo= br.readLine();
			System.out.print("�̸���>");
			String email= br.readLine();
			
			//JDBC ���� 1,2 �ܰ�
			conn = DBUtil.getConnection();
			//3�ܰ� ���� SQL�� �ۼ�
			sql = "INSERT INTO test2(num,title,name,memo,email,reg_date)"
					+ "VALUES(test2_seq.nextval,?,?,?,?,SYSDATE)";//.nextval������������ �о��ȼ� ����
			//Ŭ���������� �������� ���ڿ����� ����ġ�� �÷��������ڷ� ������
			
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� �����͸� ���ε�
			pstmt.setString(1, title);
			pstmt.setString(2, name);
			pstmt.setString(3, memo);
			pstmt.setString(4, email);
			
			
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺� ���� �߰�
			int count = pstmt.executeUpdate();
			System.out.println(count+"���� ���� �߰��߽��ϴ�.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ� ����
//			if(br!=null)try {br.close();}catch(Exception e) {}//���� �ۼ��ص� ������ �������.
			DBUtil.executeClose(null, null, conn);
			if(br!=null)try {br.close();}catch(Exception e) {}//�ֿܼ����� �Է°� ���ξ�� ��������
		}
	}
}
