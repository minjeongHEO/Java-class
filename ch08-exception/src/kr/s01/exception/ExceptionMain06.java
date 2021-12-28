package kr.s01.exception;


public class ExceptionMain06 {
	//throw 던지다. throw를 이용한 인위적 예외발생
	public void methodA(String[] n)throws Exception{
		//여기서는 트라이캐치 생략해도된다. args에서 입력받아서 String에 전달해보려고한다
		if(n.length>0) { //입력한 값이 있는 경우
			for(String s:n) {
				System.out.println(s);//입력한 데이터 출력
			}
		}else {//입력한 값이 없는 경우
			//인위적으로 예외발생
//			new Exception();//예외가발생한게아니라 메모리상에 상관없는 예외객체를 생성한것 
//			throw new Exception(); //트라이캐치가되어있어야 예외를던져도 에러가안난다.객체를 생성, throw가있어야 관계있는 예외객체를 생성해서 던질수가있따.
			throw new Exception("입력한 데이터가 없습니다!!"); //캐치블럭으로 이동해서 저 조건이 수행되도록한다
		}
	}
	
	public static void main(String[] args) {
		//일종의 조건체크를 하기위해 인위적으로 예외를 발생시켜본다.
		ExceptionMain06 ex  = new ExceptionMain06();
		//예외처리
		try {
			ex.methodA(args);//string args  가 methodA(args)에 들어온다.
		}catch(Exception e) {
			System.out.println(e.getMessage());//데이터가 명시(입력한데이터가없습니다!!)되어있어야 겟메시지로 읽어올수있따.
		}
		
	}
	
	/*
	 * 일종의 조건체크 로그인처리시 불일치할때 사용하기도한다
	 * 이프엘스문법으로도 쓸수있지만 문법의 선택의 문제이고 효율성을 따져서 선택한다.
	 */

}
