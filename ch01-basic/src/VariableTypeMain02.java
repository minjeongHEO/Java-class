public class VariableTypeMain02 {
	public static void main(String[] args) {
//		char single=''';//작은 따옴표는 특수문자이기 때문에 역슬래시를 붙여서 일반문자로 바꿔줘야 출력이 된다
		char single='\'';// 특수문자' -> 일반문자\'
		System.out.println(single);
		
//		String str = "오늘은 "서울"에 비가 와요!";//서울에 큰따옴표를 출력하고자 한다면 앞에 역슬래시를 넣어 일반문자로 바꿔준다
		String str = "오늘은 \"서울\"에 비가 와요!";
		System.out.println(str);
		
//		문자열 안의 특수문자 '는 자동으로 일반문자로 변환된다
		String str2 = "오늘은 '목요일'입니다.";//굳이 \ 붙여줄 필요가 없다
		System.out.println(str2);
		
//		String root = "C:\javawork\";		
		String root = "C:\\javawork\\";// 특수문자\ -> 일반문자\\
		System.out.println(root);
		
		String str3 = "내일은 금요일\n모레는 토요일";
		System.out.println(str3);
		
		String str4 = "이름\t나이\t취미";//일정간격 띄우는 tab기능
		System.out.println(str4);
		
	}
	
}
