package ch07.sec03.exam02;

public class SmartPhone extends Phone {
	// 생성자 선언
	public SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("SmartPhone(String model, String color) 생성자 실행");
	}
}
