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
			System.out.println("메모 정보를 수정합니다.");
			System.out.print("메모 번호>");
			int num =  Integer.parseInt(br.readLine());
			System.out.print("제목>");
			String title = br.readLine();
			System.out.print("이름>");
			String name = br.readLine();
			System.out.print("메모>");
			String memo = br.readLine();
			System.out.print("이메일>");
			String email = br.readLine();
			
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			//sql문 작성
			sql= "UPDATE test2 SET title = ?, name = ?, memo = ?, email =? "
					+ "WHERE num =?";//WHERE의 num =?은 PK //글번호에 대해서 업데이트 수행 번호없으면 업데이트가안됌
			
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, title);
			pstmt.setString(2, name);
			pstmt.setString(3, memo);
			pstmt.setString(4, email);
			pstmt.setInt(5, num);
			
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블에 데이터 변경
			int count = pstmt.executeUpdate();
			System.out.println(count+"개의 작업을 수행했습니다");
			
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블에 데이터 변경
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원 정리
			DBUtil.executeClose(null, pstmt, conn);
			if(br!=null)try {br.close();}catch(Exception e) {}
			
		}
	}
}
