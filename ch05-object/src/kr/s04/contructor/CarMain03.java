package kr.s04.contructor;

public class CarMain03 {
	
	//생성자 오버로딩
	public CarMain03(int n) { // 객체가 생성될떄 딱 한번만 작업이 가능
		//생성자내에서 또 다른 생성자를 호출할 때는 생성자명을 쓸 수 없고
		//this라고 표시해야 함 /this():생성자내에서 또다른생성자를 호출할때.
	
		this(String.valueOf(n)); // this: 생성자내에서 생성자명을 대신한다
//		String s = String.valueOf(n); // int -> String
//		System.out.println(s + "의 길이 : "+s.length());
	}
	public CarMain03(float n){
		//생성자내에서 또 다른 생성자를 호출하기 전에 수행문을 배치하면 오류 발생★
//		System.out.println("float데이터변환"); //생성자보다 먼저 수행문 있으면 오류발생
		this(String.valueOf(n)); // float -> String
		System.out.println("float데이터변환");//반드시 생성자 먼저 실행 후 수행문 실행(this다음에 넣는다)
		
//		String s = String.valueOf(n); // float -> String
//		System.out.println(s + "의 길이 : " + s.length());0
	}
	public CarMain03(String s) {
		System.out.println(s + "의 길이 : " + s.length());
	}
	
	public static void main(String[] args) {
		CarMain03 cm1 = new CarMain03(2000);
		CarMain03 cm2 = new CarMain03(3.141592f);//f는 자료형이니까 빼고 세면 8 출력
		CarMain03 cm3 = new CarMain03("World");
	}
}
