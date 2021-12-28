package kr.s06.animal;

public class AnimalMain {
	public static void main(String[] args) {
		//기본 생성자를 이용해서 객체 생성
		Animal a1 = new Animal(); //디폴트생성자
		
		//기본 정보 셋팅
		a1.setName("기린");
		a1.setAge(10);
		a1.setFly(false);
		
		
		//정보 출력
		System.out.println("이름 : "+ a1.getName());//겟메소드를이용
		System.out.println("나이 : "+ a1.getAge());//겟메소드를이용
		System.out.println("비행 여부 : "+ a1.isFly());//불린형은is붙인다
//		System.out.println("비행 여부 : "+ (a1.isFly() ? "가능" : "불가능") );
		System.out.println("비행 여부 : "+ printFly(a1.isFly()));//불린형은is붙인다
		System.out.println("-----------------------");
		
		//생성자로 데이터 셋팅
		Animal a2 = new Animal("기러기",3,true);//기본정보를 셋팅할 필요가 없다 9~11라인
		//정보 출력
		System.out.println("이름 : "+ a2.getName());
		System.out.println("나이 : "+ a2.getAge());
		System.out.println("비행 여부 : "+ a2.isFly());
		System.out.println("비행 여부 : "+ (a2.isFly() ? "가능" : "불가능") );
		System.out.println("비행 여부 : "+ printFly(a2.isFly()));//같은클래스이므로 불러올떄 클래스명생략한것
		
	}
	//메서드에서도 private접근지정자 붙일수있따
	private static String printFly(boolean fly){ //main위에 생성해도 상관없다
		//static한 메서드 호출로만 가능
		return fly ? "가능" : "불가능"; 
	}
}
