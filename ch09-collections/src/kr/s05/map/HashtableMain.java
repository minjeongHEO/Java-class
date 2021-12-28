package kr.s05.map;

import java.util.Hashtable;
import java.util.Enumeration; //해시테이블

public class HashtableMain {
	public static void main(String[] args) {
		Hashtable<String, String> h = new Hashtable<String,String>();
		h.put("name","홍길동");
		h.put("age", "20");
		h.put("tel", "010-1234-5678");
		h.put("job", "탐정");
		h.put("address", "서울시");
		//key의 중복을 인정하지 않음. key를 중복하면 마지막에 입력한 값 사용
		h.put("name","장영실");
		//value에 null을 인정하지않음 컴파일시엔 문제없지만 실행시 오류발생
//		h.put("zipcode",null);
		//key에 null을 인정하지 않음 실행시 오류발생
//		h.put(null, "강남구");
		
		System.out.println(h);
		System.out.println("------------------------------");
		
		String name = h.get("name");
		System.out.println("name="+name);//네임이 중복되서 이름이 바꼇음

		//Hashtable에 저장된 key구하기
		Enumeration<String> en = h.keys();
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			System.out.println(key+","+h.get(key));
		}
		
	}
}
