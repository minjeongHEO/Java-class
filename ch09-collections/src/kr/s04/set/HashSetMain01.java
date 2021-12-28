package kr.s04.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain01 {
	public static void main(String[] args) {
		String[] array = {"Java","Oracle","JSP","Java","HTML"};

		//Set: 정렬을 보장하지 않고 중복값을 불허
		HashSet<String> hs = new HashSet<String>();
		//데이터 저장
		for(String n : array) {
			hs.add(n); //중복 불허
		}
		System.out.println(hs);//순서대로 정렬되지않느다

		//저장된 데이터 읽기
		Iterator<String> ir = hs.iterator();
		while(ir.hasNext()) {//데이터가 있는지 없는지 검증해서 Next로 뽑아낸다
			System.out.println(ir.next());
		}

		System.out.println("--확장 for문을 이용한 출력--");
		//확장 for문을 이용한 출력
		for(String s : hs) {
			System.out.println(s);

		}

	}
}
