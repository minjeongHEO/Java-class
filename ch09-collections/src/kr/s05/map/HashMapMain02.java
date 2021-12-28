package kr.s05.map;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapMain02 {
	public static void main(String[] args) {
		String[] msg = {"Berlin","Paris","Seoul","New York","London"};
				//key,  value
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		//반복문을 이용한 데이터의 저장
		for(int i=0;i<msg.length;i++) {
			map.put(i,msg[i]);//(인덱스,요소)
		}
		System.out.println(map);
		System.out.println("-----------------");
		//HashMap에 저장된 key구하기
		
//		Set<Integer> s = map.keySet();//해시세싱랑은 완전 같지는 않느데 set이란건 인터페이슨데 키셋 메소드내에서 클래스를 만들고 클래스안에 임플리먼트 시키고 타입을 셋타입 셋 자료구조의 특성을 갖는다
//		Iterator<Integer> keys = s.iterator();
		//변수를 한번만 호출하면 변수를 안쓰는게 좋다 그래서
		Iterator<Integer> keys = map.keySet().iterator();
		
		while(keys.hasNext()) {
			Integer key = keys.next();//자동으로 변환되는관계기 때문에 int로 써도 상과 ㄴ없다
			System.out.println(key+", "+map.get(key));
		}
	}
}
