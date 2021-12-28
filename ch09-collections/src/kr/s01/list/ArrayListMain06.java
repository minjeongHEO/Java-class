package kr.s01.list;

import java.util.ArrayList;
import java.util.Collections; //정렬기능

public class ArrayListMain06 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("머루");
		list.add("사과");
		list.add("앵두");
		list.add("자두");
		list.add("사과");
		
		//indexOf를 이용한 앞에서부터 인덱스 탐색
		int index1 = list.indexOf("사과");
		System.out.println("첫번째 사과: "+index1);
		//lastIndexOf를 이용한 뒤에서부터 인덱스 탐색
		int index2 = list.lastIndexOf("사과");
		System.out.println("마지막 사과: "+index2);
		int index3 = list.indexOf("망고");
		System.out.println("망고 :"+index3);//Java에서는 없는걸 표시를 -1 반환 
		
		//정렬
		Collections.sort(list);//sort 오름차순으로 정렬
		System.out.println(list);
		//역순으로 정렬
		Collections.reverse(list);//reverse 역순으로 정렬
		System.out.println(list);
	}
}
