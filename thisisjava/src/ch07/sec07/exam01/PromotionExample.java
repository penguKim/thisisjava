package ch07.sec07.exam01;

class A {
}
class B extends A {
}
class C extends A {
}
class D extends B {
}
class E extends C {
}
public class PromotionExample {
	// 자식 클래스들의 객체 생성
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	// 상속 관계에 있는 자동 타입 변환
	A a1 = b;
	A a2 = c;
	A a3 = d;
	A a4 = e;
	
	B b1 = d;
	C c1 = e;
	
	
	// 상속 관계이 있지 않아 컴파일 에러 발생!
//	B b2 = e;
//	C c2 = d;
}
