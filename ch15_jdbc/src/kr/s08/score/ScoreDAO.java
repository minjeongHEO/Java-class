package kr.s08.score;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.s03.preparedstatement.DBUtil;

/* DAO : Data Access Object
 * 		 �����ͺ��̽��� �����͸� ���������� ȣ���ϰ� �����ϴ� ��ü
 */
public class ScoreDAO {
	//���� �Է�
	public void insertInfo(ScoreVO score) {//ScoreVOŸ��, ScoreVO�� ���������� ����Ÿ� ���⿡ �ִ´�
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 1�ܰ�
			conn = DBUtil.getConnection();
			//SQL�� �ۼ�
			sql = "INSERT INTO score (num,name,korean,english,math,"
					+ "sum,avg,grade,reg_date) "
					+ "VALUES (score_seq.nextval,?,?,?,?,?,?,?,SYSDATE)";
			//���ڰ��� �÷����� �� ����ϴϱ� ������ ����
			//�Է��ϴ� �����ʹ� 4���� �ٸ��͵鵵date���� ��¥�� ���ڴϱ� ?�� �ٳ־��ش�.
			//������ �ΰ͸� ?ó���Ѵ�
			
			//JDBC 3�ܰ�: PreparedStatement��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ���ε�
			//�����ʹ�scoreVO���� �������Ѵ� �ٵ� �޼ҵ带 ���ؼ��о�;��Ѵ�.
			pstmt.setString(1, score.getName());
			pstmt.setInt(2, score.getKorean());
			pstmt.setInt(3, score.getEnglish());
			pstmt.setInt(4, score.getMath());
			pstmt.setInt(5, score.makeSum());
			pstmt.setInt(6, score.makeAvg());
			pstmt.setString(7, score.makeGrade());
			
			//JDBC 4�ܰ� : SQL���� �����ؼ� ���̺� ���� �߰���
			int count = pstmt.executeUpdate();
			System.out.println (count +"�� ���� �߰��߽��ϴ�");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);//result�� ��� null
		}
		//
		
	}
	//��� ����
	public void selectlistInfo() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//1,2�ܰ�
			conn= DBUtil.getConnection();
			//SQL
			sql = "SELECT * FROM score ORDER BY num DESC";
			//3�ܰ� :preparedstatement��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�����ϱ� �ٷ� 4�ܰ�
			//4�ܰ�: sql���� �����ؼ� ���̺��� ��������� ��� resultset(rs)�� ��Ƽ� ��ȯ
			rs = pstmt.executeQuery();
			
			System.out.println("���ڷ�� : " + getCountInfo());//�޼��峻���� �޼��� ȣ�Ⱑ���ϴ� 
			System.out.println("----------------------------------------");
			System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t���");
			System.out.println("----------------------------------------");
			
			while(rs.next()) {
				System.out.print(rs.getInt("num")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getInt("korean")+"\t");
				System.out.print(rs.getInt("english")+"\t");
				System.out.print(rs.getInt("math")+"\t");
				System.out.print(rs.getInt("sum")+"\t");
				System.out.print(rs.getInt("avg")+"\t");
				System.out.println(rs.getString("grade"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);//result�� �ֱ� ������ rs���
		}
		
	}
	//���ڵ� �� ����=�л���
	public int getCountInfo() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int count = 0;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			//SQL�� �ۼ�
			sql = "SELECT COUNT(*) FROM score";
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺��� �� ���ڵ� ���� ���ؼ� ��ȯ
			rs = pstmt.executeQuery();
			if(rs.next()) {
							//�÷��ε���/ count(*)�� as�� ����� ������ �÷��ε����ξ����ִ�
				count = rs.getInt(1);
			}
			//���� ���ڵ尡 ������ 0�� ��ȯ�Ѵ�. ���� int count=0;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ� ����
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
		return count;
	}
	
	//���� �� ���� //��Ͽ� �� ���������� ������ ���� �������� ������.
	public void selecDetailInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet  rs= null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2 �ܰ�
			conn = DBUtil.getConnection();
			//SQL�� �ۼ�
			sql="SELECT * FROM score WHERE num = ?";
			//JDBC ���� 3�ܰ� :preparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setInt(1, num);
			//JDBC���� 4�ܰ�: SQL���� �����ؼ� ���̺�� ���� ������� ��� ResultSet�� ��Ƽ� ��ȯ
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("�۹�ȣ: " + rs.getInt("num"));
				System.out.println("�̸�: " + rs.getString("name"));
				System.out.println("��������: " + rs.getInt("korean"));
				System.out.println("��������: " + rs.getInt("english"));
				System.out.println("��������: " + rs.getInt("math"));
				System.out.println("������: " + rs.getInt("sum"));
				System.out.println("�������: " + rs.getInt("avg"));
				System.out.println("���: " + rs.getString("grade"));
				System.out.println("�Է³�¥: "+ rs.getDate("reg_date"));
//				System.out.println("�Է³�¥: "+ rs.getString("reg_date"));//�����Ͻú��� ���
			}else {
				System.out.println("�˻��� ������ �����ϴ�!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
		
	}
	//���� ����
	public void updateInfo(ScoreVO score) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
			try {
			//JDBC����1,2�ܰ�
			conn = DBUtil.getConnection();
			//SQL�� ����(name,korean,english,math,sum,avg,grade)
			sql = "UPDATE score SET name=?,korean=?,english=?,math=?,"
					+ "sum=?,avg=?,grade=? WHERE num = ?";
			//JDBC ���� 3�ܰ� prepareStatement��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� ���ε�
			pstmt.setString(1,score.getName());
			pstmt.setInt(2,score.getKorean());
			pstmt.setInt(3,score.getEnglish());
			pstmt.setInt(4,score.getMath());
			
			pstmt.setInt(5, score.makeSum());
			pstmt.setInt(6, score.makeAvg());
			pstmt.setString(7, score.makeGrade());
			pstmt.setInt(8, score.getNum());
			//JDBC���� 4�ܰ�: SQL���� ���� �� ���̺� �������� ����
			int count = pstmt.executeUpdate();
			System.out.println(count+"���� ���� �����߽��ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
		
	
	//���� ����
	public void deleteInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
		//1,2�ܰ�
		conn = DBUtil.getConnection();
		//sql
		sql="DELETE FROM score WHERE num = ?";
		//3�ܰ�
		pstmt = conn.prepareStatement(sql);
		//?
		pstmt.setInt(1, num);
		//4�ܰ�JDBC���� 4�ܰ�: SQL���� ���� �� ���̺� �������� ����
		int count = pstmt.executeUpdate(); //�� �־�� ������ �ȴ�!!!
		
		System.out.println(num +"�� �� ���� �߽��ϴ�.");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
		
	}
	
	
	
}


