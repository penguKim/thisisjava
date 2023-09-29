package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		int[] arr1; // 배열 변수 arr1 선언
		int[] arr2; // 배열 변수 arr2 선언
		int[] arr3; // 배열 변수 arr3 선언
		
		arr1 = new int[] {1, 2, 3}; // 배열 생성후 arr1에 대입
		arr2 = new int[] {1, 2, 3}; // 배열 생성후 arr2에 대입
		arr3 = arr2;
		
		// 같은 배열을 참조하는지 검사
		System.out.println(arr1 == arr2);
		
		System.out.println(arr2 == arr3);
	}

}
