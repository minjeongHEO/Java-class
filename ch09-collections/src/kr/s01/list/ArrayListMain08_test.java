package kr.s01.list;

//import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;//sort ������ ����ϱ� ����

//���� �ڵ�



public class ArrayListMain08_test {
	public static void main(String[] args) {
		/*
		 * �ζ� ���α׷������
		 * 1~45, ��ġ���ʴ� 6���� ����
		 * ���ϸ鼭 ArrayList �� ������ �ϰ� ����Ͻÿ�
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
		//����
		Collections.sort(roto);
		for(int num:roto) {
		System.out.println(num+"\t");

	}
	}
}
