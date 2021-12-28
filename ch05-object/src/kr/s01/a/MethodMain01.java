package kr.s01.a;
public class MethodMain01 {
	//반환하는 데이터가 있는 경우
	public int add(int a, int b){//반환형 (결과값으 자료형이 int이다) 메소드명
		return a+b; //반환하는 데이터가 있는경우 : 리턴형 메소드
	}
	//반환하는 데이터가 없는 경우
	public void print(String str) {
		System.out.println(str);
	}
	public void print(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) { //main메소드는 void출구가없다 반환되는 데이터없다
		//객체 선언 및 생성
		MethodMain01 method = new MethodMain01(); //필드에서 생성자 명시안해도 컴파일러가 기본적으로 넣어준다.
		//반환하는 데이터가 있는 메서드 호출
		int result = method.add(5, 8);
		System.out.println("result = "+ result);
	
		//반환하는 데이터가 없는 메서드 호출
//		int result2 = method.print("가을"); void형이라서 에러가난다. 밖으로 빠져나오는 데이터가 없어서 result2에 담을 수 없다.
		method.print("가을");
		method.print(2);
	}
}
