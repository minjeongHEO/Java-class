package kr.s01.string;

import java.util.Scanner;

public class StringMain04 {
	public static void main(String[] args) {
		/*
		 * ���ڿ��� �� ���ھ� �о �������� ǥ��
		 * hello -> olleh
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���ڿ�:");
		String s = input.nextLine();

//		for(int i=0; i<s.length();i++) {
//			System.out.print(s.charAt(i));
//		}
//System.out.println("======================");

		for(int i=s.length()-1;i>=0;i--) {
//		for(int i=(s.length()-1);i==0;i--) {//������ �ȉ�
			System.out.print(s.charAt(i));
		}
		
		input.close();
	}

}
