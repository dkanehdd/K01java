package quiz;

import java.util.Scanner;

public class QuFibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 피보나치수열의 항목갯수를 입력하세요 :");
		int inputNum = sc.nextInt();
		int[] arr = new int[inputNum];
		arr[0]=0; arr[1]=1;
		System.out.print(arr[0]+" "+arr[1]+" ");
		for(int i=2 ; i<arr.length ; i++) {
			arr[i]=arr[i-1]+arr[i-2];
			System.out.print(arr[i]+" ");
		}
	}
}
