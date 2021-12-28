package kr.s01.exception;

public class ExceptionMain03 {
	public static void main(String[] args) { //스캐너를 사용하지않고 args에 정보를 전달하면
		
		int var = 50;
		
		//예외가 발생하면
		//예외객체가 생성되고 예외객체가 전달된 catch블럭으로 이동해서 수행문을 수행하는구조
		try {
						//Integer.parseInt: String -> int
			int data = Integer.parseInt(args[0]);
			
			System.out.println(var/data);
			System.out.println("-----------");
//		}catch(Exception e) {
//			System.out.println("나머지 예외는 여기로 오세요~");//업캐스팅은 자동적형변환되니까 아래에있는 애들이 발생해도 여기로 들어오는 문제가 생긴다
		}catch(NumberFormatException e) {//(숫자데이턴데 타입만 스트링인경우 ex)오십,50!)
			System.out.println("숫자가 아닙니다.");
		}catch(ArrayIndexOutOfBoundsException e){ //다중캐치 (데이터가없는경우)
			System.out.println("입력한 데이터가 없습니다.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수는 없습니다.");
		}catch(Exception e) {
			System.out.println("나머지 예외는 여기로 오세요~");//그래서마지막에 넣어준다
		}
		System.out.println("프로그램 끝!!");
		/*
		 * 다중catch문 사용 주의사항
		 * Exception과 하위 예외 클래스를 동시에 명시할때는 
		 * 하위 예외클래스를 먼저 명시하고 가장 뒤에 Exception을 명시해야 동작상에 문제가 발생하지않는다
		 * (자동적형변환때문에)
		 */
	}
}
