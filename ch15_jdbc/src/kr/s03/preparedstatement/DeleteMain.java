package kr.s03.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC수행 1,2단계
			conn = DBUtil.getConnection();
			
			//SQL문장 작성
			sql = "DELETE FROM test1 WHERE id=?";//where절 반드시있어야하고 롤백할수도없다
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, "star");//1번 ?에 데이터 저장
			
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블의 행을 삭제
			int count = pstmt.executeUpdate();//sql문장은 이미 prepareStatement 객체안에 보관되서 넣으면안됀다
			System.out.println(count+"개 행을 삭제했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원 정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
}
