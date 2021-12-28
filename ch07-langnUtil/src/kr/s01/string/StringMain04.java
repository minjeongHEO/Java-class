package kr.s01.string;

import java.util.Scanner;

public class StringMain04 {
	public static void main(String[] args) {
		/*
		 * 문자열을 한 문자씩 읽어서 역순으로 표시
		 * hello -> olleh
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("문자열:");
		String s = input.nextLine();

//		for(int i=0; i<s.length();i++) {
//			System.out.print(s.charAt(i));
//		}
//System.out.println("======================");

		for(int i=s.length()-1;i>=0;i--) {
//		for(int i=(s.length()-1);i==0;i--) {//실행이 안됌
			System.out.print(s.charAt(i));
		}
		
		input.close();
	}

}
