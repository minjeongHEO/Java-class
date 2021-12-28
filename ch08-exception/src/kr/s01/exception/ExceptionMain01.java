package kr.s01.exception;

public class ExceptionMain01 {
	public static void main(String[] args) {
		int[] array = {10,20,30};
		//인위적으로 예외를 발생
		//없는 인덱스3을 일부러 호출해서(length미만말고 이하로 설정) 예외를 발생시켜본다
		for(int i=0;i<=array.length;i++) {
			System.out.println("array["+i+"]:"+array[i]);
		}//예외발생시 아래부터 실행안됨
		System.out.println("프로그램 끝");
	}
}
