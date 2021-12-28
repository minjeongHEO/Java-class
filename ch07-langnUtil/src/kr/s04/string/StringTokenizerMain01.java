package kr.s04.string;

import java.util.StringTokenizer;

public class StringTokenizerMain01 {
	public static void main(String[] args) {
		String source = "100,200,300,400";
												//문자열, 구분자
		StringTokenizer st = new StringTokenizer(source,",");
		
		//구분자를 통해서 만들어진 문자열이 있는지 검증
		while(st.hasMoreTokens()) {
								//구분자를 통해서 만들어진 문자열을 반환
			System.out.println(st.nextToken());
	
	/*스플릿 스트링ㄹ토큰라이저 별반 차이없지만
	 * (하이픈, 공백, 콜론이 구분자)
	 * 2021-11-10 11:21:50
	 * 스플릿으로 작업하면 작업을 세번한다 공백한번 하이픈한번 콜론한번
	 * 스트링토큰라이저는 여러개의 구분자를 한번에 지정할수있어서 한번에 작업가능
	 */
			
		}
	}
}
