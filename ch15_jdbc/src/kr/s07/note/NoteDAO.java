package kr.s07.note;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.s03.preparedstatement.DBUtil;

/*
 * DAO : Data Access Object
 * 		 �����ͺ��̽��� �����͸� ���������� ȣ���ϰ� �����ϴ� ��ü
 */
public class NoteDAO {
	//�۾���
	public void insertInfo(String name, String passwd, String subject,
							String content, String email) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			//SQL�� �ۼ�
			sql= "INSERT INTO note VALUES (note_seq.nextval,?,?,?,?,?,SYSDATE)";
			
			//JDBC ���� 3�ܰ� : preparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� �����͸� ���ε�
			pstmt.setString(1, name);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setString(5, email);
			
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺� ���� �߰�
			int count = pstmt.executeUpdate();
			System.out.println(count+"���� ���� �����߽��ϴ�.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ� ����
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	//��Ϻ���
	public void selectListInfo() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//*JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection(); //�ڵ������
			//SQL�� �ۼ�
			sql = "SELECT * FROM note ORDER BY num DESC";
			
			//*JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1,num);
			
			//*JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺�� ���� ��������� ���
			//				ResultSet�� ��Ƽ� ��ȯ
			rs = pstmt.executeQuery();
			
			System.out.println("----------------------------------");
			System.out.println("�۹�ȣ\t����\t�̸�\t�ۼ���");
			System.out.println("----------------------------------");
			
			while(rs.next()) {
				System.out.print(rs.getInt("num")+"\t");
				System.out.print(rs.getString("subject")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.println(rs.getDate("reg_date"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
		
	}
	//�󼼱ۺ���
	public void selectDetailInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			
			//SQL�� �ۼ�
			sql = "SELECT * FROM note WHERE num = ?";
			
			//JDBC���� 3�ܰ�:  PreparedSatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� �����͸� ���ε�
			pstmt.setInt(1, num);//1��?�� num�� �ִ´�
			
			//JDBC���� 4�ܰ�: SQL���� �����ؼ� ���̺�κ��� �� ���� ���ڵ带 ��� 
			//				ResultSet�� ��Ƽ� ��ȯ
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("�۹�ȣ: " + rs.getInt("num"));
				System.out.println("�̸�: " + rs.getString("name"));
				System.out.println("��й�ȣ: " + rs.getString("passwd"));
				System.out.println("����: " + rs.getString("subject"));
				System.out.println("����: " + rs.getString("content"));
				System.out.println("�̸���: " + rs.getString("email"));
				System.out.println("�ۼ���: " + rs.getDate("reg_date"));
				
			}else {
				System.out.println("�˻��� ������ �����ϴ�.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	//�ۼ���
	public void updateInfo(int num, String name, String passwd,
						String subject, String content, String email) {
//	������ ���ϱ� ������ 
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//JDBC ���� 12 �ܰ�
			conn = DBUtil.getConnection();
			
			//sql�� �ۼ�
			sql= "UPDATE note SET name=?, passwd=?,subject=?,"
					+ "content=?, email=? WHERE num =?";
			
			//JDBC ���� 3�ܰ�: preparedstatement��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setString(1,name);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setString(5, email);
			pstmt.setInt(6, num);
		
			//JDBC ���� 4�ܰ�:  sql���� �����ؼ� ���̺��� �� ��������
			int count = pstmt.executeUpdate();
			System.out.println(count+"���� ���� �����߽��ϴ�.");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			//�ڿ� ����
			DBUtil.executeClose(null, pstmt, conn);
		}
		
	}
	//�ۻ���
	public void deleteInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC���� 1,2 �ܰ�
			conn = DBUtil.getConnection();
			//sql�� �ۼ�
			sql = "DELETE FROM note WHERE num=?";
			
			//JDBC���� 3 �ܰ� : preparedStatement��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setInt(1, num);
			
			//JDBC���� 4 �ܰ� : SQL���� �����ؼ� ���̺��� ���� ����
			int count = pstmt.executeUpdate();
			System.out.println(count+"���� ���� �����߽��ϴ�");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
}
