package kr.s01.list;

import java.util.Random;
import java.util.ArrayList;

//���ڵ�



public class ArrayListMain08 {
	public static void main(String[] args) {
		/*
		 * �ζ� ���α׷������
		 * 1~45, ��ġ���ʴ� 6���� ����
		 * ���ϸ鼭 ArrayList �� ������ �ϰ� ����Ͻÿ�
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
