package ex06array;
/*
문제2] 파일명 : QuTwoDimLotate.java
다음의 형태로 표현된 2차원 배열이 있다. 
1 2 3
4 5 6
7 8 9 
이렇게 전달되면 다음의 형태로 구조를 변경하는 메소드를 정의해보자.
7 8 9
1 2 3 
4 5 6
즉 메소드를 호출하면 1행은 2행으로, 2행은 3행으로 마지막행은 1행으로 이동하게된다.
단 세로길이에 상관없이 동작하도록 메소드를 정의해야 한다.
 */
public class QuTwoDimLotate {

	public static void main(String[] args) {

		int[][] num = new int[3][3];
			
		int initVal=1;
		for(int i=0 ; i<num.length ; i++) {
			for(int j=0 ; j<num[i].length ; j++) {
				num[i][j]=initVal++;
			}
		}
		//초기화직후 출력
		arrPrint(num);
		//한행씩이동하기
		lotateArray(num);
		arrPrint(num);
		
	}
	static void lotateArray(int[][] arrParam) {
		/*
		절차
			1. 배열의 마지막행을 1차원배열 변수에 임시로 저장
			2. 배열의 2행을 3행으로, 1행을 2행으로 옮긴다.
			3. 1번에서 임시로 저장했던 값을 1행으로 옮긴다.
			
			※2차원배열에서 "배열이름[인덱스]"가 하나의 행(세로행)을
			가리킨다는것을 활용하는 문제임.
		 */
		//절차1
		int temp[] = arrParam[arrParam.length-1];
		//절차2 : 세로크기에 상관없이 동작해야 하므로 length를 사용한다.
		for(int i=arrParam.length-1 ; i>0 ; i--) {
			arrParam[i]=arrParam[i-1];
		}
		//절차3
		arrParam[0]=temp;

	}
	static void arrPrint(int[][] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
