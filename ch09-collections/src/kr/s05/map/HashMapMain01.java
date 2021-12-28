package kr.s05.map;

import java.util.HashMap;

public class HashMapMain01 {
	public static void main(String[] args) {
		/*
		 * Map: key와 value의 쌍으로 저장
		 * 		key는 정렬을 보장하지 않음
		 */
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("김신", 95);
		map.put("지은탁", 100);
		map.put("저승사자", 85);
		map.put("써니", 93);
		map.put("유덕화", 70);
		//key의 중복을 불허. key가 중복되면 마지막에 입력한 값을 사용
		map.put("지은탁", 0);
		//value에 null 인정 //키와 밸류에 null되도록이면 안들어가게 한다
		map.put("간신", null);
		//key에 null 인정
		map.put(null, 100);
		
		System.out.println(map);
		
		int num = map.get("지은탁");//인티저가 인트로 자동변환
		System.out.println("지은탁의 성적은 "+num);
		Integer num2 = map.get("간신");//null은 int일떄 오류
		System.out.println("간신의 성적은 "+num2);
		
	}
}
