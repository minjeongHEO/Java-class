package kr.s01.string;

public class StringMain02 {
	public static void main(String[] args) {
		String s1 = "kwon sun ae";
				   //012345678910, 길이 11
		
		int index = s1.indexOf('n');
		System.out.println("맨 처음 문자 n의 위치: "+index);
		
		index = s1.indexOf("sun");
		System.out.println("문자 sun의 위치: "+index); //567반환 아님 하나만 반환가능
		
		index = s1.lastIndexOf("n");
		System.out.println("마지막 문자 sun의 위치: "+index); 
		
		char c = s1.charAt(index);
		System.out.println("추출한 문자: "+c);
		
		index = s1.indexOf('s');//대뮨자는없어서 -1출력
		System.out.println(index);
		String str = s1.substring(index);//지정한 index부터 마지막index까지의 문자열추출
		System.out.println("소문자s부터 끝까지 문자열 추출: "+ str);
		
		//시작 인덱스부터 끝 인덱스 전까지의 문자열 추출
		str = s1.substring(index,index+3);//5,8
		System.out.println("인덱스5부터 인덱스8전까지 문자열 추출: "+ str);
		
		int length = s1.length();
		System.out.println("s1의 길이: "+ length);
		
		String[] array = s1.split(" ");
		for(int i=0; i<array.length;i++) {
		System.out.println(("array["+i+"]:"+array[i]));
		}
		
		
	}
}
