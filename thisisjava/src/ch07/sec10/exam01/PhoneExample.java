package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone(); // 컴파일 에러!
		// => Cannot instantiate the type
		// => 추상 클래스를 인스턴스화할 시 오류 발생
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn(); // Phone 클래스의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff(); // Phone 클래스의 메소드
	}

}
