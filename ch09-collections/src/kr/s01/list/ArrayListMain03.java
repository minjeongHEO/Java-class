package kr.s01.list;
//제네릭리스트를 이용해서 데이터 추가하기
import java.util.ArrayList;

public class ArrayListMain03 {
	public static void main(String[] args) {
		//제네릭 표현 : 객체를 생성할 떄 객체에 저장할 수있는 요소의 타입을 지정
		//제네릭 표현을 쓰며 지정한 타입으로 저장된다.//Object타입아니라 String타입으로 저장
		ArrayList<String> al = new ArrayList<String>();
//		그러므로 다운캐스팅 안해도 된다
//		제네릭표현 쓰는 것은 권장사항!
//		ArrayList al = new ArrayList();
		
		al.add("서울");//String타입->Object타입 //제네릭표현쓰면 Object타입아니라 String타입으로 저장
		al.add("부산");//String타입->Object타입 //제네릭표현쓰면 Object타입아니라 String타입으로 저장
		//제네릭 표현을 써서 ArrayList객체를 생성할 떄 저장되는 객체의 타입을
		//String으로 지정해서 Integer타입의 객체를 저장할 수없도록 검증해준다.
//		al.add(1000);//Integer타입->Object타입 
		al.add("인천");//String타입->Object타입 //제네릭표현쓰면 Object타입아니라 String타입으로 저장
		
		//실수로 Integer타입의 데이터를넣고 모르는 상황을 가정
		//반복문을 이용한 ArrayList 요소 출력
		for(int i=0;i<al.size();i++) {
//			String name = (String)al.get(i);
			String name = al.get(i);//제네릭 표현을 썼으므로 다운캐스팅 안쓴다
			System.out.println(name);
		}
		System.out.println("---------확장 for문 사용해보기--------");
		for(String name : al) {
			System.out.println(name);
		}
		
	}
}
