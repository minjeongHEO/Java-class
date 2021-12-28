package kr.s01.list;

import java.util.ArrayList;
//import java.util.*;

class A{
	//Object의 toString재정의
	@Override
	public String toString() {
		return "A"; //초기화까지한것
	}
}
class B{
	
}//중괄호만 있으면 클래스가 정의된 것
public class ArrayListMain01 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();//ArrayList는 기본자료형데이터를 저장할수없고 
		//(ex-int로저장한느게아니라 Integer로 저장)참조자료형데이터만(객체의 주소로)저장할수있따.
		//근데 int로 넣어도 자동으로 Integer로 바꿔준다.
		
		//데이터저장
		al.add(new A());//A객체의 주소가 전달된다
		al.add(new B());//A객체의 주소가 전달된다
//		al.add(new Integer());//원칙은 이렇지만 대입만하는방식으로 쓴다
		al.add(10);//숫자만 대입한느 방식으로
//		al.add(new String("하늘"));//문자열같은경우도 명시적으로 새성할필요없이
		al.add("하늘");//암시적으로 생성한다
//		여러개의 타입을 전달받으려면 하나의타입이 되어야하고
//		int integer stirng의 공통분모가 objcect니까
//		네가지A,B,Integer,Object 전부 Object로 업캐스팅 형변환해서 저장됨
//		예시로 든 것이지 활용시에 일반적으로는 타입이 다른거를 저장하지않는다. 다시 꺼내서 다운캐스팅해야하고 복잡해지니까
		
		System.out.println(al);//al.toString
		
	}
}
