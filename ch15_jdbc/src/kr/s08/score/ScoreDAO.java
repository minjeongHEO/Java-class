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
 * 		 데이터베이스의 데이터를 전문적으로 호출하고 제어하는 객체
 */
public class ScoreDAO {
	//성적 입력
	public void insertInfo(ScoreVO score) {//ScoreVO타입, ScoreVO에 개별적으로 담던거를 여기에 넣는다
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 1단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "INSERT INTO score (num,name,korean,english,math,"
					+ "sum,avg,grade,reg_date) "
					+ "VALUES (score_seq.nextval,?,?,?,?,?,?,?,SYSDATE)";
			//인자값은 컬럼명을 다 사용하니까 생략도 가능
			//입력하는 데이터는 4개고 다른것들도date뺴고 어짜피 숫자니까 ?로 다넣어준다.
			//데이터 인것만 ?처리한다
			
			//JDBC 3단계: PreparedStatement객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 바인딩
			//데이터는scoreVO에서 뺴내와한다 근데 메소드를 통해서읽어와야한다.
			pstmt.setString(1, score.getName());
			pstmt.setInt(2, score.getKorean());
			pstmt.setInt(3, score.getEnglish());
			pstmt.setInt(4, score.getMath());
			pstmt.setInt(5, score.makeSum());
			pstmt.setInt(6, score.makeAvg());
			pstmt.setString(7, score.makeGrade());
			
			//JDBC 4단계 : SQL문을 실행해서 테이블에 행을 추가함
			int count = pstmt.executeUpdate();
			System.out.println (count +"개 행을 추가했습니다");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);//result가 없어서 null
		}
		//
		
	}
	//목록 보기
	public void selectlistInfo() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//1,2단계
			conn= DBUtil.getConnection();
			//SQL
			sql = "SELECT * FROM score ORDER BY num DESC";
			//3단계 :preparedstatement객체 생성
			pstmt = conn.prepareStatement(sql);
			//?없으니까 바로 4단계
			//4단계: sql문을 실행해서 테이블에서 결과집합을 얻어 resultset(rs)에 담아서 반환
			rs = pstmt.executeQuery();
			
			System.out.println("총자료수 : " + getCountInfo());//메서드내에서 메서드 호출가능하다 
			System.out.println("----------------------------------------");
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
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
			DBUtil.executeClose(rs, pstmt, conn);//result가 있기 떄문에 rs명시
		}
		
	}
	//레코드 총 갯수=학생수
	public int getCountInfo() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int count = 0;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT COUNT(*) FROM score";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블의 총 레코드 수를 구해서 반환
			rs = pstmt.executeQuery();
			if(rs.next()) {
							//컬럼인덱스/ count(*)을 as도 안줬기 때문에 컬럼인덱스로쓸수있다
				count = rs.getInt(1);
			}
			//행이 레코드가 없으면 0을 반환한다. 위에 int count=0;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원 정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
		return count;
	}
	
	//성적 상세 보기 //목록에 다 나와있지만 연습을 위해 상세페이지 만들어본다.
	public void selecDetailInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet  rs= null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2 단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql="SELECT * FROM score WHERE num = ?";
			//JDBC 수행 3단계 :preparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			//JDBC수행 4단계: SQL문을 실행해서 테이블로 부터 결과행을 얻고 ResultSet에 담아서 반환
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("글번호: " + rs.getInt("num"));
				System.out.println("이름: " + rs.getString("name"));
				System.out.println("국어점수: " + rs.getInt("korean"));
				System.out.println("영어점수: " + rs.getInt("english"));
				System.out.println("수학점수: " + rs.getInt("math"));
				System.out.println("총점수: " + rs.getInt("sum"));
				System.out.println("평균점수: " + rs.getInt("avg"));
				System.out.println("등급: " + rs.getString("grade"));
				System.out.println("입력날짜: "+ rs.getDate("reg_date"));
//				System.out.println("입력날짜: "+ rs.getString("reg_date"));//연월일시분초 출력
			}else {
				System.out.println("검색된 정보가 없습니다!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
		
	}
	//성적 수정
	public void updateInfo(ScoreVO score) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
			try {
			//JDBC수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 생성(name,korean,english,math,sum,avg,grade)
			sql = "UPDATE score SET name=?,korean=?,english=?,math=?,"
					+ "sum=?,avg=?,grade=? WHERE num = ?";
			//JDBC 수행 3단계 prepareStatement객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 바인딩
			pstmt.setString(1,score.getName());
			pstmt.setInt(2,score.getKorean());
			pstmt.setInt(3,score.getEnglish());
			pstmt.setInt(4,score.getMath());
			
			pstmt.setInt(5, score.makeSum());
			pstmt.setInt(6, score.makeAvg());
			pstmt.setString(7, score.makeGrade());
			pstmt.setInt(8, score.getNum());
			//JDBC수행 4단계: SQL문을 실행 시 테이블에 행정보를 갱신
			int count = pstmt.executeUpdate();
			System.out.println(count+"개의 행을 수정했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
		
	
	//성적 삭제
	public void deleteInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
		//1,2단계
		conn = DBUtil.getConnection();
		//sql
		sql="DELETE FROM score WHERE num = ?";
		//3단계
		pstmt = conn.prepareStatement(sql);
		//?
		pstmt.setInt(1, num);
		//4단계JDBC수행 4단계: SQL문을 실행 시 테이블에 행정보를 갱신
		int count = pstmt.executeUpdate(); //를 넣어야 적용이 된다!!!
		
		System.out.println(num +"번 을 삭제 했습니다.");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
		
	}
	
	
	
}


