package kr.s04.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.s03.preparedstatement.DBUtil;

public class SelectListMemo {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "SELECT * FROM test2 ORDER BY num DESC";//?가 없으니까 메서드호출없다
			//일반적으로 목록에서는 PK로 목록정렬한다 최신정렬해야되기때문에
			
			//JDBC 수행 3단계 : preparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
					
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블로부터 결과집합을 얻고
			//					ResultSet에 담아서 반환
			rs= pstmt.executeQuery();
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("-----------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("num")+"\t");
				System.out.print(rs.getString("title")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.println(rs.getDate("reg_date"));//getString도 가능
//				System.out.println(rs.getString("reg_date"));//getDate도 가능
				
			}
		}catch(Exception e) {
			
			
		}finally {
			//자원 정리
			DBUtil.executeClose(rs, pstmt, conn);	
		}
	}
}
