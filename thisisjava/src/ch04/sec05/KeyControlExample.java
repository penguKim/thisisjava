package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true; // while문 조건식을 위한 변수 선언
		int speed  = 0;
		
		while(run) {
			System.out.println("----------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("----------------------");
			System.out.println("선택 : ");
			
			String strNum = sc.nextLine(); // 키보드 입력값
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 : " + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 : " + speed);
			} else if(strNum.equals("3")) {
				run = false; // while 조건식을 false로 만듬
			}
		}
	}

}
