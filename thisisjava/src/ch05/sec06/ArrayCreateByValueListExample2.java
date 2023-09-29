package ch05.sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// 배열 변수 선언
		int[] scores;
		// 배열 변수에 배열을 대입
		scores = new int[] {83, 90, 87};
		// 배열 항목의 총합을 구하고 출력
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		// 배열을 매개값으로 주고, printItem() 메소드 호출
		printItem(new int[] { 83, 90, 97});
	}

	// printItem() 메소드 선언
	public static void printItem(int[] scores) {
		for(int i = 0; i < scores.length; i++) {
			System.out.println("score[" + i + "] : " + scores[i]);
		}
	}
	
}
