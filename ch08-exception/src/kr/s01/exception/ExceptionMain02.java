package kr.s01.exception;

public class ExceptionMain02 {
	public static void main(String[] args) {
		//예외처리
		//예외가 발생해도 정상 종료도리 수 있도록 프로그램적으로 처리하는 것을 말함
		int[]array = {10,20,30};
		
		//인위적으로 예외발생
		for(int i=0; i<=array.length;i++) {
			//예외처리
			try {
				//예외가 발생할 가능성이 있는 코드를 명시한다
				System.out.println("array["+i+"]:" + array[i]);
				
			//catch(예외발생시 생성되는 예외 객체의 타입)
				//없는인덱스 호출 = ArrayIndexOutOfBoundsException
			}catch(ArrayIndexOutOfBoundsException e) {
				//예외가 발생하면 catch블럭으로 이동해서 예외가 발생한 이유를(e에 받아진다) 출력하거나
				//대체코드를 작성한다.
				//java에서는 대체코드보다 이유를 더많이 사용 / web에서는 조금 다르다는거 알아두기만.
				System.out.println("없는 인덱스를 호출하였습니다");
			}
		}//end of for
		
		System.out.println("프로그램 끝!");//예외처리를 했기때문에 출력이 되고 정상종료가 된다.
		
	}
}
