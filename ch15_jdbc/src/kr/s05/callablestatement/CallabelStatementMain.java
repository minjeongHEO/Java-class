package kr.s05.callablestatement;

import java.sql.CallableStatement;//SQL의 스토어드프로시저(Stored Procedure)를 실행시키기 위해 사용되는 인터페이스 
import java.sql.Connection;

import kr.s03.preparedstatement.DBUtil;

public class CallabelStatementMain {
	public static void main(String[] args) {
		Connection conn = null;
		CallableStatement cstmt = null; //프로시저사용
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//프로시저 호출문장
			sql="{call adjust(?,?)}"; //프로시저호출 exec과 다름 별도로 자바에서 만든거
			
			//JDBC 수행 3단계 : CallableStatement 객체 생성
			cstmt = conn.prepareCall(sql);
			//?에 데이터 바인딩
			cstmt.setString(1, "SUNNY");
			cstmt.setFloat(2, 0.06f);
			
			//JDBC 수행 4단계
			cstmt.executeUpdate();
			System.out.println("급여 정보가 수정 되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(cstmt, conn);
		}
	}
}
