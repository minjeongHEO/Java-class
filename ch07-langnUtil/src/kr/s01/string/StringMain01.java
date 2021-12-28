package kr.s01.string;

public class StringMain01 {
	public static void main(String[] args) {
		String str1 = "abc";//암시적으로 객체 생성
		String str2 = "abc";//암시적으로 객체 생성은 문자열내용이 같으면 따로안만들고 공유
//		두 방식은 메모리에 구현되는게 다르다.
		
 		//객체 비교(비교연산자를 사용해서 비교)
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 객체");
		}else {
			System.out.println("str1과 str2는 다른 객체");
		}
		//문자열 비교
		if(str1.equals(str2)) {
			System.out.println("str1과 str2의 내용(문자열)이 같다");
		}else {
			System.out.println("str1과 str2의 내용(문자열)이 다르다");
		}
		
		System.out.println("--------------------------");
		//명시적으로 객체 생성
		String str3 = new String("hello");//원칙은 명시적으로 객체 생성
		String str4 = new String("hello");//원칙은 명시적으로 객체 생성은 같은 문자열내용이여도 따로 만듬
		
		//객체 비교
		if(str3 == str4) {
			System.out.println("str3와 str4는 같은 객체");
		}else {
			System.out.println("str3와 str4는 다른 객체");
		}
		//문자열 비교
		if(str3.equals(str4)) {
			System.out.println("str1과 str2의 내용(문자열)이 같다");
		}else {
			System.out.println("str1과 str2의 내용(문자열)이 다르다");
		}
		
		System.out.println("--------------------------");
		String str5 = "bus";
		String str6 = "Bus"; //==는 대소문자까지 비교
		//문자열의 대소문자를 구분하지않고 의미상만 비교
		if(str5.equalsIgnoreCase(str6)) {
			System.out.println(
					"[대소문자 구문없이 비교]str5와 str6의 내용(문자열)이 같다.");
		}else {
			System.out.println(
					"[대소문자 구분없이 비교]str5와 str6의 내용(문자열)이 다르다");
		}
		
	}
}
