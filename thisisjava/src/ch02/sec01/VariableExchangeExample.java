package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x= 3;
		int y = 5;
		System.out.println("x : " + x + "y : " + y);
		// x가 참조하는 공간을 temp가 참조
		int temp = x;
		// y가 참조하는 공간을 x가 참조
		x = y;
		y = temp;
		System.out.println("x : " + x + "y : " + y);
	}
}
