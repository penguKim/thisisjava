package ch05.sec07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] scores = {
				{80, 90, 96},
				{76, 88}
			};
		//배열의 길이
		System.out.println("1차원 배열 길이(반의 수): " + scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): " + scores[0].length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): " + scores[1].length);
		
		//첫 번째 반의 세 번째 학생의 점수 읽기
		System.out.println("scores[0][2] : " + scores[0][2]);
		
		//두 번째 반의 두 번째 학생의 점수 읽기
		System.out.println("scores[1][1] : " + scores[1][1]);
		
		//첫 번째 반의 평균 점수 구하기
		int sum1 = 0;
		for(int i = 0; i < scores[0].length; i++) {
			sum1 += scores[0][i];
		}
		double avg1 = (double)sum1 / scores[0].length;
		System.out.println("첫 번째 반의 평균 점수: " + avg1);
		
		//두 번째 반의 평균 점수 구하기
		int sum2 = 0;
		for(int i = 0; i < scores[1].length; i++) {
			sum2 += scores[1][i];
		}
		double avg2 = (double)sum2 / scores[1].length;
		System.out.println("두 번째 반의 평균 점수: " + avg2);
		
		//전체 학생의 평균 점수 구하기
		int sumClass = 0;
		int student = 0;
		for(int i = 0; i < scores.length; i++) { // 반의 수만큼 반복
			student += scores[i].length;
			for(int j = 0; j < scores[i].length; j++) { 
				sumClass += scores[i][j];
			}
		}
		double avgClass = (double)sumClass / student;
		System.out.println("전체 학생의 평균 점수 : " + avgClass);
	}

}
