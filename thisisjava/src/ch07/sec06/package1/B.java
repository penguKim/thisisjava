package ch07.sec06.package1;

public class B {
	// 메소드 선언
	public void method() {
		A a = new A();		// 객체 생성 가능
		a.field = "value";  // 변수 접근 가능
		a.method(); 		// 메소드 호출 가능
	}
}
