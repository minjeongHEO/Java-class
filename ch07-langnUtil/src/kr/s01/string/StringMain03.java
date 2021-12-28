package kr.s01.string;

public class StringMain03 {
	public static void main(String[] args) {
		String s1 = "  aBa  ";
		String s2 = "abc";
		int a = 100;
		String msg = null;
		
		msg = s1.toUpperCase();//소문자 -> 대문자
		System.out.println("msg:"+msg);
		
		msg = s1.toLowerCase();//대문자 -> 소문자
		System.out.println("msg:"+msg);
		
		//특정 문자열을 새로운 문자열로 교체
		msg = s1.replace("aB", "b"); //old문자를 new문자로 바꿔준다
		System.out.println("msg: "+msg);
		
		msg = s1.trim();
		System.out.println("msg: "+msg);//공백이라는것은 데이터로 인정되는디ㅔ 그걸 제거하고싶을떄
		
		//검색하는 문자열에서 인자에 전달된 문자열이 있으면 true
		boolean f = s1.contains("aB");
		System.out.println("f: "+f);
		//문자열이 인자에 전달된 문자열로 시작하면 true
		f = s2.startsWith("ab");
		System.out.println("f: "+f);
		//문자열이 인자에 전달된 문자열로 끝나면 true
		f = s2.endsWith("ab");
		System.out.println("f: "+f);
		
		//int->String 변환(parsing)
		String msg2 = String.valueOf(a);
		String msg3 = a+""; //"":빈문자열: 문자열객체를 초기화할때, 문자열로 변환시킬때
		

	}
}
