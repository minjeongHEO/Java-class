package kr.s01.list;

import java.util.Random;
import java.util.ArrayList;

//내코드



public class ArrayListMain08 {
	public static void main(String[] args) {
		/*
		 * 로또 프로그램만들기
		 * 1~45, 겹치지않는 6개의 숫자
		 * 구하면서 ArrayList 에 저장을 하고 출력하시오
		 */

		ArrayList<Integer> roto = new ArrayList<Integer>();
		//		for(int i=1;i<46;i++) {
		//			roto.add(i);
		//		}
		while(roto.size()<6) {
//			for(int i=0;i<6;i++) {
			Random r = new Random();
			int index = r.nextInt(44);
			System.out.print(index+"  ");
			
			if(roto.contains(index)) {
//				roto.remove(index);
//				r.nextInt();
			}else {
				roto.add(index+1);
			}
			//		}
		}
		System.out.println("\n"+roto);

	}
}
