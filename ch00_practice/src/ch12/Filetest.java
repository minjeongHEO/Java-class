package kr.s09.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.s03.preparedstatement.DBUtil;

public class BookDAO {
	//도서 등록
	public void insertBook(BookVO book) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "INSERT INTO book (bk_num,bk_name,bk_category) "
				+ "VALUES (book_seq.nextval,?,?)";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, book.getBk_name());
			pstmt.setString(2, book.getBk_category());
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블에 행을 추가
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행을 추가했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	//도서 목록보기
	public void selectListBook() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT bk_num,bk_name,bk_category,bk_regdate,"
				+ "re_status FROM book LEFT OUTER JOIN "
				+ "(SELECT * FROM reservation WHERE re_status=1) "
				+ "USING(bk_num) ORDER BY bk_num DESC";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블로부터 결과집합을 얻고
			//                ResultSet에 담아서 반환
			rs = pstmt.executeQuery();
			
			System.out.println("-----------------------------------");
			System.out.println("번호\t분류\t등록일\t\t대출여부\t도서명");
			System.out.println("-----------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("bk_num") + "\t");
				System.out.print(rs.getString("bk_category") + "\t");
				System.out.print(rs.getDate("bk_regdate") + "\t");
				if(rs.getInt("re_status") == 0) {
					System.out.print("대출 가능\t");
				}else {
					System.out.print("대출 중\t");
				}
				System.out.println(rs.getString("bk_name"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	
	//대출 등록
	public void insertReservation(ReservationVO reservation) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "INSERT INTO reservation (re_num,bk_num,me_num,re_status) "
				+ "VALUES (reservation_seq.nextval,?,?,1)";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, reservation.getBk_num());
			pstmt.setInt(2, reservation.getMe_num());
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블에 행을 추가
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행을 추가했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	
	//대출여부 확인
	public int getStatusReservation(int bk_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int count = 0;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT re_status FROM book LEFT OUTER JOIN "
				+ "(SELECT * FROM reservation WHERE re_status=1) USING(bk_num) "
				+ "WHERE bk_num=?";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, bk_num);
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블로부터 대출여부 조회
			rs = pstmt.executeQuery();
			if(rs.next()) {
				            //컬럼 인덱스
				count = rs.getInt(1);//도서 번호가 있을 때
			}else {
				count = -1;//도서 번호가 없을 때
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return count;
	}
	
	//반납 처리
	public void updateReservation(int re_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "UPDATE reservation SET re_status=0, "
				+ "re_modifydate=SYSDATE WHERE re_num=?";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, re_num);
			//JDBc 수행 4단계 : SQL문을 실행해서 테이블에 반납 처리
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 행을 수정했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	
	//대출 목록 보기
	public void selectListReservation() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT re_num,me_id,me_name,bk_name,re_status,"
				+ "re_regdate,re_modifydate FROM reservation "
				+ "JOIN book USING(bk_num) "
				+ "JOIN member USING(me_num) ORDER BY re_num DESC";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행 4단계 : SQL문을 실행하고 테이블로부터 결과집합을 얻어서
			//                ResultSet에 넣고 반환
			rs = pstmt.executeQuery();
			System.out.println("----------------------------------");
			System.out.println("번호\t아이디\t대출자\t대출도서명\t대출여부\t대출일\t반납일");
			System.out.println("----------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("re_num") + "\t");
				System.out.print(rs.getString("me_id") + "\t");
				System.out.print(rs.getString("me_name") + "\t");
				System.out.print(rs.getString("bk_name") + "\t");
				if(rs.getInt("re_status")==0) {
					System.out.print("반납\t");
				}else {
					System.out.print("대출 중\t");
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
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
	}
	
	//MY대출 목록 보기
	public void selectMyList(int me_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT re_num,me_id,me_name,bk_name,re_status,"
				+ "re_regdate,re_modifydate FROM reservation "
				+ "JOIN book USING(bk_num) "
				+ "JOIN member USING(me_num) WHERE me_num=? "
				+ "ORDER BY re_num DESC";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, me_num);
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블로부터 결과집합을 얻어서
			//                ResultSet에 담고 반환
			rs = pstmt.executeQuery();
			System.out.println("----------------------------------");
			System.out.println("번호\t아이디\t대출자\t대출도서명\t대출여부\t대출일\t반납일");
			System.out.println("----------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("re_num") + "\t");
				System.out.print(rs.getString("me_id") + "\t");
				System.out.print(rs.getString("me_name") + "\t");
				System.out.print(rs.getString("bk_name") + "\t");
				if(rs.getInt("re_status")==0) {
					System.out.print("반납\t");
				}else {
					System.out.print("대출 중\t");
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
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
	}
	
	//회원가입
	public void insertMember(MemberVO member) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "INSERT INTO member (me_num,me_id,me_passwd,me_name,"
				+ "me_phone) VALUES (member_seq.nextval,?,?,?,?)";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, member.getMe_id());
			pstmt.setString(2, member.getMe_passwd());
			pstmt.setString(3, member.getMe_name());
			pstmt.setString(4, member.getMe_phone());
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블에 행을 추가
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행을 추가했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
		
	}
	//회원목록
	public void selectListMember() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM member ORDER BY me_num DESC";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블로부터 결과집합을 얻고
			//                ResultSet에 담아서 반환
			rs = pstmt.executeQuery();
			System.out.println("-------------------------------------");
			System.out.println("번호\t아이디\t이름\t비밀번호\t전화번호\t가입일");
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
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	
	//아이디 중복 체크
	public int checkId(String me_id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int count = 0;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT me_id FROM member WHERE me_id=?";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, me_id);
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블로부터 아이디를 조회
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count = 1;//count:0->아이디 존재x,count:1->아이디 존재o
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
		return count;
	}
	
	//로그인 체크
	//로그인 체크 후 로그인이 가능하면 회원 번호 반환
	public int loginCheck(String me_id, String me_passwd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int me_num = 0;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT me_num FROM member WHERE me_id=? AND me_passwd=?";
			//JDBc 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, me_id);
			pstmt.setString(2, me_passwd);
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블로부터 회원 번호 구하기
			rs = pstmt.executeQuery();
			if(rs.next()) {
				me_num = rs.getInt(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return me_num;
	}
	
}














