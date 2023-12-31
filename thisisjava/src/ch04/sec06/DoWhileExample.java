package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String inputStr;
		
		do {
			System.out.println(">");
			inputStr = sc.nextLine(); // 키보드로 입력값 받기
			System.out.println(inputStr);
		} while(!inputStr.equals("q")); // 입력된 내용이 q가 아니라면 반복
		
		System.out.println();
		System.out.println("프로그램 종료");
		
	}

}
