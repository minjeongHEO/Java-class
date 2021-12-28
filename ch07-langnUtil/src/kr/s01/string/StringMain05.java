package kr.s01.string;

public class StringMain05 {
	public static void main(String[] args) {
		String str = "abcMDye-4W?EWzz";
		String result = "";//빈문자열 초기화할때 쓸 수 있따
		/*
		 * str에 저장된 문자열에서 소문자는 대문자로 변경, 대문자는 소문자로 변경해서 출력
		 *ABCmdTE-4w?ewZZ로 출력 
		 *아스키코드 65~90 까지가 대문자
		 *		97~122 까지가 소문자	
		 */
		
//		char c;
//		int i;
//		
//		for(i=0;i<str.length();i++) {
//			if(str.charAt(i)<=90 && str.charAt(i)>=65 ) {
//				c = str.toLowerCase(i);//대문자 -> 소문자
//				System.out.println(c);
//				result = "";
//				
//			}else if(str.charAt(i)<=122 && str.charAt(i)>=97){
//				c = str.toUpperCase(i);
//				System.out.println(c);
//				result = "";
//				
//			}else
//				c = str.charAt(i);
//				System.out.println(c);
//				result = "";
//		}
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c>=65 && c<=90) {//대문자
//				문자를 문자열로 바꿔야한다
				result += String.valueOf(c).toLowerCase(); //문자열을 반환해준다
			}else if(c>=97 && c<=122) {//소문자
				result += String.valueOf(c).toUpperCase(); //문자열을 반환해준다
			}else {
				result += c;
			}
		}
		
		System.out.println(result);
		
	}
}
