package kr.s02.mathtest;

import java.util.Scanner;
import java.util.Random;

public class RandomMain02_test {
	public static void main(String[] args) {
		/*
		 * pinos71@daum.net
		 * 가위바위보게임
		 * 컴퓨터 난수 발생 -> 0 가위, 1 바위, 2 보
		 * 메뉴>1 게임하기, 2 종료
		 * (출력예시)
		 * 가위바위보 입력(0:가위, 1:바위, 2:보)
		 * 1경우) 무승부(컴퓨터:가위, 사람:가위)
		 * 2경우) 컴퓨터 승(컴퓨터:가위, 사람:보)
		 * 3경우) 사람 승(컴퓨터:가위, 사람:바위)
		 * if문을 이용한 조건체크
		 * 난수발생시켜서 대조
		 * Math.random() 또는 Random() nextInt() 사용하기
		 */

		System.out.println("메뉴> 1:게임하기 | 2:종료하기");
		System.out.print("선택하세요 > ");

		Scanner inputGame = new Scanner(System.in);


		String[] game = {"가위", "바위", "보"};
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("-------------------");
			System.out.println("1.게임하기|2.종료하기");
			System.out.println("-------------------");
			System.out.print("메뉴>");
			int user = input.nextInt();
		
//		Random r2 = new Random();
//		int index = r2.nextInt(3);
		int computer = (int)(Math.random()*3);
		
		/*
		 * 컴퓨터 - 사용자 결과 판점
		 * 0		0	0	무승부
		 * 0		1	-1	사용자 승
		 * 0		2	-2	컴퓨터 승
		 * 1		0	1	컴퓨터 승
		 * 1		1	0	무승부
		 * 1		2	-1	사용자 승
		 * 2		0	2	사용자 승
		 * 2		1	1	컴퓨터 승
		 * 2		2	0	무승부
		 */
		int result = computer - user;
		if(result == 0) {
			System.out.println(
					"무승부 -> 컴퓨터"+item[computer]+", 사람:"+item[user]);
		}else if(result == -1 || result == 2) {
			System.out.println(
					"사람 승 -> 컴퓨터"+item[computer]+", 사람:"+item[user]);
		}else{//result == -2 || result ==1
			System.out.println(
					"컴퓨터 승 -> 컴퓨터"+item[computer]+", 사람:"+item[user]);
		}
		

		

	


		input.close();
		inputGame.close();
	}
}
}
