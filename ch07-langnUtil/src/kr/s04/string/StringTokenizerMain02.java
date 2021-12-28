package kr.s04.string;

import java.util.StringTokenizer;

public class StringTokenizerMain02 {
	public static void main(String[] args) {
		String source = "2021-11-10 11:21:50";
												//복수의 구분자 지정
		StringTokenizer st = new StringTokenizer(source,"- :");//하이픈 공백 콜론
		
		//구분자를 통해 만들어진 문자열이 있는지 검증
		while(st.hasMoreTokens()) {
								//구분자를 통해 만들어진 문자열을 반환
			System.out.println(st.nextToken());
			
		}
	}
}
