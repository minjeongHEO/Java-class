package kr.s02.mathtest;

import java.util.Scanner;
import java.util.Random;

public class RandomMain02 {
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

		Scanner input = new Scanner(System.in);
		Scanner inputGame = new Scanner(System.in);

		int s = input.nextInt();

		String[] game = {"가위", "바위", "보"};
		Random r2 = new Random();
		int index = r2.nextInt(3);

		if(s==1) {
			System.out.print("가위바위보 입력(0:가위, 1:바위, 2:보) > ");
			int ig = inputGame.nextInt();
			
			if(0>ig || ig>2) {
				System.out.println("다시 입력하세요.");	
			}else {
				System.out.println("상대편: "+ game[index]+ ", 본인: "+ game[ig]);
				System.out.print("결과 : ");
				switch(ig) {

				case 0:
					if(index==0) {
						System.out.println("무승부");
					}else if(index==ig) {
						System.out.println("우승하였습니다.");
					}else{
						System.out.println("패배하였습니다.");
					}break;
				case 1:
					if(index==0) {
						System.out.println("우승하였습니다.");
					}else if(index==ig) {
						System.out.println("패배");
					}else{
						System.out.println("무승부");
					}break;
				case 2:
					if(index==0) {
						System.out.println("패배하였습니다.");
					}else if(index==ig) {
						System.out.println("무승부");
					}else{
						System.out.println("우승하였습니다.");
					}break;
				}
			}

		}else {
			System.out.println("게임을 종료합니다.");
		}


		input.close();
		inputGame.close();
	}
}
