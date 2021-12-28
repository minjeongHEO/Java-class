package kr.s01.exception;

public class ExceptionMain04 {
	public static void main(String[] args) {
		//try~catch~finally
		System.out.println("---예외가 발생하지 않는 경우");
		try {
			System.out.println("1");
			System.out.println("2");
		}catch(Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");//예외 발생 없이 정상적으로 수행됐음에도 finally들린다
		}
		System.out.println("--------------------");
		System.out.println("---예외가 발생하는 경우----");
		try {
			System.out.println("1");
			System.out.println(10/0);//ArithmaticException 발생
			System.out.println("2");//예외발생시 수행안되는 문장
		}catch(Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		
	}
}
