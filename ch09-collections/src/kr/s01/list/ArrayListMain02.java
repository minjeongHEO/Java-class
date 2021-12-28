package kr.s01.list;

import java.util.ArrayList;

public class ArrayListMain02 {
	public static void main(String[] args) {
		//List의 특징 : 저장되는 순서 유지, 중복저장을 허용
		ArrayList al = new ArrayList();
		//객체가 저장될 때 어떠한 타입도 저장될수 있도록 오브젝트타입으로 바뀐다 (업캐스팅이니까 자동적으로된다)
		al.add("강호동");//String->Object 인덱스0
		al.add("유재석");//String->Object 인덱스1
		al.add("김병만");//String->Object 인덱스2
		al.add("김준호");//String->Object 인덱스3
		
		//반복문을 이용한 ArrayList의 요소 출력
		for(int i=0;i<al.size();i++) {
			//ArrayList에 저장된 요소 반환
//			al.get(i);//get메소드가 오브젝트타입으로 반환
			//그래서 다운캐스팅 스트링으로 바꿔줘야한다
			String name = (String)al.get(i);//Object->String 명시적 형변환 해준다.
			System.out.println(name);
		}
	}
}
