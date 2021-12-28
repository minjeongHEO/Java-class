package kr.s04.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.s03.preparedstatement.DBUtil;//자동으로 import

import java.io.BufferedReader; 
import java.io.InputStreamReader;

public class InsertMemo {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection conn = null;
		String sql = null;
		PreparedStatement pstmt = null;
		
//		String title,name,memo,email;//또는try블럭안에다 넣어도 된다.
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("메모를 입력합니다.");
			System.out.print("제목>");
			String title = br.readLine(); //이런식으로.
			System.out.print("이름>");
			String name = br.readLine();
			System.out.print("메모>");
			String memo= br.readLine();
			System.out.print("이메일>");
			String email= br.readLine();
			
			//JDBC 수행 1,2 단계
			conn = DBUtil.getConnection();
			//3단계 전에 SQL문 작성
			sql = "INSERT INTO test2(num,title,name,memo,email,reg_date)"
					+ "VALUES(test2_seq.nextval,?,?,?,?,SYSDATE)";//.nextval다음시퀀스를 읽어우ㅘ서 전달
			//클래스에서만 지원해줌 문자열에서 엔터치면 플러스연산자로 더해줌
			
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터를 바인딩
			pstmt.setString(1, title);
			pstmt.setString(2, name);
			pstmt.setString(3, memo);
			pstmt.setString(4, email);
			
			
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블에 행을 추가
			int count = pstmt.executeUpdate();
			System.out.println(count+"개의 행을 추가했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원 정리
//			if(br!=null)try {br.close();}catch(Exception e) {}//위에 작성해도 순서는 상관없다.
			DBUtil.executeClose(null, null, conn);
			if(br!=null)try {br.close();}catch(Exception e) {}//콘솔에서는 입력값 별로없어서 생략가능
		}
	}
}
