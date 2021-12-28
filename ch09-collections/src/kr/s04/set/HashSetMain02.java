package kr.s04.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Collections;

import java.util.ArrayList;

public class HashSetMain02 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
//		HashSet<int> set = new HashSet<int>();//�����ϴ°� ��ü�� �����̵Ǵϱ� Ÿ�� ��Ʈ�� �⺻�ڷ��� ǥ��� ��ü���·�
		Random ra = new Random();
		while(set.size()<6) {
			set.add(ra.nextInt(45)+1);//1~45,�ߺ����� ������
		}
		
		System.out.println(set);
		System.out.println("----------------");
		
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);//sort�� ����Ʈ�����ϴµ� �ؽü��� ���� �׷��� ��̸���Ʈ�� ����� �������޾ƺ���
		for(int num : list) {
			System.out.print(num + "\t");
		}
}
}
