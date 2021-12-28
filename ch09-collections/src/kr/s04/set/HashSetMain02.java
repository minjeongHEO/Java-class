package kr.s04.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Collections;

import java.util.ArrayList;

public class HashSetMain02 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
//		HashSet<int> set = new HashSet<int>();//저장하는건 객체만 저장이되니까 타입 인트는 기본자료형 표기는 객체형태로
		Random ra = new Random();
		while(set.size()<6) {
			set.add(ra.nextInt(45)+1);//1~45,중복값을 불허함
		}
		
		System.out.println(set);
		System.out.println("----------------");
		
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);//sort는 리스트여야하는데 해시셋은 없다 그래서 어레이리스트의 기능의 도움을받아본다
		for(int num : list) {
			System.out.print(num + "\t");
		}
}
}
