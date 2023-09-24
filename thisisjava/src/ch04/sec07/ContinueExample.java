package ch04.sec07;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			if(i % 2 != 0) { // 홀수인 경우
				continue;
			}
			System.out.print(i + " "); // 홀수는 출력되지 않는다.
		}
	}

}
