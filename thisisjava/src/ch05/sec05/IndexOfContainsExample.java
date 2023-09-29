package ch05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		// "프로그래밍" 시작 위치를 변수 location에 저장
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		// 변수 location을 이용한 문자열 잘라내기
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		if(location != -1) { // => "자바"가 포함되어 있다면
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
	}

}
