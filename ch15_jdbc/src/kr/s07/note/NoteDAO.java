package kr.s07.note;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.s03.preparedstatement.DBUtil;

/*
 * DAO : Data Access Object
 * 		 데이터베이스의 데이터를 전문적으로 호출하고 제어하는 객체
 */
public class NoteDAO {
	//글쓰기
	public void insertInfo(String name, String passwd, String subject,
							String content, String email) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql= "INSERT INTO note VALUES (note_seq.nextval,?,?,?,?,?,SYSDATE)";
			
			//JDBC 수행 3단계 : preparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터를 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setString(5, email);
			
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블에 행을 추가
			int count = pstmt.executeUpdate();
			System.out.println(count+"개의 행을 삽입했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원 정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	//목록보기
	public void selectListInfo() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//*JDBC 수행 1,2단계
			conn = DBUtil.getConnection(); //코드뺴먹음
			//SQL문 작성
			sql = "SELECT * FROM note ORDER BY num DESC";
			
			//*JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1,num);
			
			//*JDBC 수행 4단계 : SQL문을 실행해서 테이블로 부터 결과집합을 얻고
			//				ResultSet에 담아서 반환
			rs = pstmt.executeQuery();
			
			System.out.println("----------------------------------");
			System.out.println("글번호\t제목\t이름\t작성일");
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
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
		
	}
	//상세글보기
	public void selectDetailInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC수행 1,2단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "SELECT * FROM note WHERE num = ?";
			
			//JDBC수행 3단계:  PreparedSatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터를 바인딩
			pstmt.setInt(1, num);//1번?에 num을 넣는다
			
			//JDBC수행 4단계: SQL문을 실행해서 테이블로부터 한 개의 레코드를 얻고 
			//				ResultSet에 담아서 반환
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("글번호: " + rs.getInt("num"));
				System.out.println("이름: " + rs.getString("name"));
				System.out.println("비밀번호: " + rs.getString("passwd"));
				System.out.println("제목: " + rs.getString("subject"));
				System.out.println("내용: " + rs.getString("content"));
				System.out.println("이메일: " + rs.getString("email"));
				System.out.println("작성일: " + rs.getDate("reg_date"));
				
			}else {
				System.out.println("검색된 정보가 없습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	//글수정
	public void updateInfo(int num, String name, String passwd,
						String subject, String content, String email) {
//	정렬은 정하기 나름임 
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//JDBC 수행 12 단계
			conn = DBUtil.getConnection();
			
			//sql문 작성
			sql= "UPDATE note SET name=?, passwd=?,subject=?,"
					+ "content=?, email=? WHERE num =?";
			
			//JDBC 수행 3단계: preparedstatement객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1,name);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setString(5, email);
			pstmt.setInt(6, num);
		
			//JDBC 수행 4단계:  sql문을 실행해서 테이블의 행 정보갱신
			int count = pstmt.executeUpdate();
			System.out.println(count+"개의 행을 수정했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			//자원 정리
			DBUtil.executeClose(null, pstmt, conn);
		}
		
	}
	//글삭제
	public void deleteInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC수행 1,2 단계
			conn = DBUtil.getConnection();
			//sql문 작성
			sql = "DELETE FROM note WHERE num=?";
			
			//JDBC수행 3 단계 : preparedStatement객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			
			//JDBC수행 4 단계 : SQL문을 실행해서 테이블의 행을 삭제
			int count = pstmt.executeUpdate();
			System.out.println(count+"개의 행을 삭제했습니다");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
}
