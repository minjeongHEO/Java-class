package kr.s09.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.s03.preparedstatement.DBUtil;

public class BookDAO {
	//���� ���
	public void insertBook(BookVO book) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			//SQL�� �ۼ�
			sql = "INSERT INTO book (bk_num,bk_name,bk_category) "
				+ "VALUES (book_seq.nextval,?,?)";
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setString(1, book.getBk_name());
			pstmt.setString(2, book.getBk_category());
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺� ���� �߰�
			int count = pstmt.executeUpdate();
			System.out.println(count + "�� ���� �߰��߽��ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	//���� ��Ϻ���
	public void selectListBook() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			//SQL�� �ۼ�
			sql = "SELECT bk_num,bk_name,bk_category,bk_regdate,"
				+ "re_status FROM book LEFT OUTER JOIN "
				+ "(SELECT * FROM reservation WHERE re_status=1) "
				+ "USING(bk_num) ORDER BY bk_num DESC";
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺�κ��� ��������� ���
			//                ResultSet�� ��Ƽ� ��ȯ
			rs = pstmt.executeQuery();
			
			System.out.println("-----------------------------------");
			System.out.println("��ȣ\t�з�\t�����\t\t���⿩��\t������");
			System.out.println("-----------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("bk_num") + "\t");
				System.out.print(rs.getString("bk_category") + "\t");
				System.out.print(rs.getDate("bk_regdate") + "\t");
				if(rs.getInt("re_status") == 0) {
					System.out.print("���� ����\t");
				}else {
					System.out.print("���� ��\t");
				}
				System.out.println(rs.getString("bk_name"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	
	//���� ���
	public void insertReservation(ReservationVO reservation) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			//SQL�� �ۼ�
			sql = "INSERT INTO reservation (re_num,bk_num,me_num,re_status) "
				+ "VALUES (reservation_seq.nextval,?,?,1)";
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setInt(1, reservation.getBk_num());
			pstmt.setInt(2, reservation.getMe_num());
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺� ���� �߰�
			int count = pstmt.executeUpdate();
			System.out.println(count + "�� ���� �߰��߽��ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	
	//���⿩�� Ȯ��
	public int getStatusReservation(int bk_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int count = 0;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			//SQL�� �ۼ�
			sql = "SELECT re_status FROM book LEFT OUTER JOIN "
				+ "(SELECT * FROM reservation WHERE re_status=1) USING(bk_num) "
				+ "WHERE bk_num=?";
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setInt(1, bk_num);
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺�κ��� ���⿩�� ��ȸ
			rs = pstmt.executeQuery();
			if(rs.next()) {
				            //�÷� �ε���
				count = rs.getInt(1);//���� ��ȣ�� ���� ��
			}else {
				count = -1;//���� ��ȣ�� ���� ��
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return count;
	}
	
	//�ݳ� ó��
	public void updateReservation(int re_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			//SQL�� �ۼ�
			sql = "UPDATE reservation SET re_status=0, "
				+ "re_modifydate=SYSDATE WHERE re_num=?";
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setInt(1, re_num);
			//JDBc ���� 4�ܰ� : SQL���� �����ؼ� ���̺� �ݳ� ó��
			int count = pstmt.executeUpdate();
			System.out.println(count + "���� ���� �����߽��ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	
	//���� ��� ����
	public void selectListReservation() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			//SQL�� �ۼ�
			sql = "SELECT re_num,me_id,me_name,bk_name,re_status,"
				+ "re_regdate,re_modifydate FROM reservation "
				+ "JOIN book USING(bk_num) "
				+ "JOIN member USING(me_num) ORDER BY re_num DESC";
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//JDBC ���� 4�ܰ� : SQL���� �����ϰ� ���̺�κ��� ��������� ��
			//                ResultSet�� �ְ� ��ȯ
			rs = pstmt.executeQuery();
			System.out.println("----------------------------------");
			System.out.println("��ȣ\t���̵�\t������\t���⵵����\t���⿩��\t������\t�ݳ���");
			System.out.println("----------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("re_num") + "\t");
				System.out.print(rs.getString("me_id") + "\t");
				System.out.print(rs.getString("me_name") + "\t");
				System.out.print(rs.getString("bk_name") + "\t");
				if(rs.getInt("re_status")==0) {
					System.out.print("�ݳ�\t");
				}else {
					System.out.print("���� ��\t");
				}
				System.out.print(rs.getDate("re_regdate") + "\t");
				if(rs.getDate("re_modifydate") == null) {
					System.out.println("");
				}else {
					System.out.println(rs.getDate("re_modifydate"));
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
	}
	
	//MY���� ��� ����
	public void selectMyList(int me_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			//SQL�� �ۼ�
			sql = "SELECT re_num,me_id,me_name,bk_name,re_status,"
				+ "re_regdate,re_modifydate FROM reservation "
				+ "JOIN book USING(bk_num) "
				+ "JOIN member USING(me_num) WHERE me_num=? "
				+ "ORDER BY re_num DESC";
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setInt(1, me_num);
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺�κ��� ��������� ��
			//                ResultSet�� ��� ��ȯ
			rs = pstmt.executeQuery();
			System.out.println("----------------------------------");
			System.out.println("��ȣ\t���̵�\t������\t���⵵����\t���⿩��\t������\t�ݳ���");
			System.out.println("----------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("re_num") + "\t");
				System.out.print(rs.getString("me_id") + "\t");
				System.out.print(rs.getString("me_name") + "\t");
				System.out.print(rs.getString("bk_name") + "\t");
				if(rs.getInt("re_status")==0) {
					System.out.print("�ݳ�\t");
				}else {
					System.out.print("���� ��\t");
				}
				System.out.print(rs.getDate("re_regdate") + "\t");
				if(rs.getDate("re_modifydate") == null) {
					System.out.println("");
				}else {
					System.out.println(rs.getDate("re_modifydate"));
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
	}
	
	//ȸ������
	public void insertMember(MemberVO member) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			//SQL�� �ۼ�
			sql = "INSERT INTO member (me_num,me_id,me_passwd,me_name,"
				+ "me_phone) VALUES (member_seq.nextval,?,?,?,?)";
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setString(1, member.getMe_id());
			pstmt.setString(2, member.getMe_passwd());
			pstmt.setString(3, member.getMe_name());
			pstmt.setString(4, member.getMe_phone());
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺� ���� �߰�
			int count = pstmt.executeUpdate();
			System.out.println(count + "�� ���� �߰��߽��ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(null, pstmt, conn);
		}
		
	}
	//ȸ�����
	public void selectListMember() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			//SQL�� �ۼ�
			sql = "SELECT * FROM member ORDER BY me_num DESC";
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺�κ��� ��������� ���
			//                ResultSet�� ��Ƽ� ��ȯ
			rs = pstmt.executeQuery();
			System.out.println("-------------------------------------");
			System.out.println("��ȣ\t���̵�\t�̸�\t��й�ȣ\t��ȭ��ȣ\t������");
			System.out.println("-------------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("me_num") + "\t");
				System.out.print(rs.getString("me_id") + "\t");
				System.out.print(rs.getString("me_name") + "\t");
				System.out.print(rs.getString("me_passwd") + "\t");
				System.out.print(rs.getString("me_phone") + "\t");
				System.out.println(rs.getDate("me_regdate"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	
	//���̵� �ߺ� üũ
	public int checkId(String me_id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int count = 0;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			//SQL�� �ۼ�
			sql = "SELECT me_id FROM member WHERE me_id=?";
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setString(1, me_id);
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺�κ��� ���̵� ��ȸ
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count = 1;//count:0->���̵� ����x,count:1->���̵� ����o
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
		return count;
	}
	
	//�α��� üũ
	//�α��� üũ �� �α����� �����ϸ� ȸ�� ��ȣ ��ȯ
	public int loginCheck(String me_id, String me_passwd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int me_num = 0;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			//SQL�� �ۼ�
			sql = "SELECT me_num FROM member WHERE me_id=? AND me_passwd=?";
			//JDBc ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setString(1, me_id);
			pstmt.setString(2, me_passwd);
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺�κ��� ȸ�� ��ȣ ���ϱ�
			rs = pstmt.executeQuery();
			if(rs.next()) {
				me_num = rs.getInt(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return me_num;
	}
	
}














