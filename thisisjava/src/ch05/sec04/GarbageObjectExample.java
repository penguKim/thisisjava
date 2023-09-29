package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null; // "여행"에 해당하는 String 객체를 쓰레기로 만듬
		
		String kind1 = "자동차";
		String kind2 = kind1; // kind1에 저장된 번지를 kind2에 대입
		kind1 = null; // kind2가 같은 번지를 가지고있어 쓰레기가 되지 않음
		System.out.println("kind2 : " + kind2);
		
	}

}
