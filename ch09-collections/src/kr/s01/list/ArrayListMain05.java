package kr.s01.list;

import java.util.ArrayList;

public class ArrayListMain05 {
	public static void main(String[] args) {
		ArrayList<Integer> al  = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(15);
		al.add(16);
		
		System.out.println(al);
		System.out.println("------앞에서부터반복------");
		//짝수 삭제
		//앞에서 반복을 할 경우 특정 조건일 떄 삭제를 하면 인덱스 변동떄문에 검증하지 못하고
		//넘어가는 데이터가 발생할 수있음
		for(int i=0; i<al.size();i++) {
			if(al.get(i)%2==0) { //짝수
				al.remove(i);
			}
		}
		System.out.println(al);
		System.out.println("------뒤에서부터반복------");//인덱스가 앞으로 옮겨지면서 20을 놓친다.
													//그래서 뒤에서 부터 삭제하는게 안전하다
		//짝수 삭제
		for(int i=al.size()-1;i>=0;i--) {
			if(al.get(i)%2==0) {//짝수
				al.remove(i);
			}
		}
		System.out.println(al);
		
		
	}
}
