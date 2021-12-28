package kr.s05.wrapper;

public class WrapperMain02 {
	public static void main(String[] args) {
		//명시적으로 객체 생성
		Integer obj1 = new Integer(12);
		Integer obj2 = new Integer(7);
		
		//데이터를 뽑아내본다
		//연산			Integer->int
		int result = obj1.intValue() + obj2.intValue();
		System.out.println("result= "+result);
		
		System.out.println("------------예전방식이었고 지금은------------");
		
		//암시적으로 객체 생성
		//뽑아오는 과정필요없이 데이터를 그냥 대입해서 연산한다. 내부적으로 자동변환되기때문
		Integer obj3 = 10;
		Integer obj4 = 20;
		Integer result2 = obj3 + obj4;
		int result3 = obj3 + obj4;//(참조변수를 일반변수인것처럼)기본자료형으로 사용하는법도있음(내부적으로 자동변환)
		System.out.println("result2= "+result2);
		System.out.println("자동변환 result3= "+result3);
	}
}
