package kr.s01.list;

//import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;//sort 정렬을 사용하기 위함

//정답 코드



public class ArrayListMain08_test {
	public static void main(String[] args) {
		/*
		 * 로또 프로그램만들기
		 * 1~45, 겹치지않는 6개의 숫자
		 * 구하면서 ArrayList 에 저장을 하고 출력하시오
		 */

		ArrayList<Integer> roto = new ArrayList<Integer>();

		while(roto.size()<6) {
			int num = (int)(Math.random()*45+1);//1~45
//			for(int i=0;i<6;i++) {
//			Random r = new Random();
//			int index = r.nextInt(44);
//			System.out.print(index+"  ");
			
			if(!roto.contains(num)) {
				roto.add(num);
			}
		}
		//정렬
		Collections.sort(roto);
		for(int num:roto) {
		System.out.println(num+"\t");

	}
	}
}
