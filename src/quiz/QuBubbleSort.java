package quiz;

import java.util.Random;
/*
버블정렬(Bubble Sort) : 정렬이 진행되는 과정이 거품이 보글보글 피어오르는
	모습과 비슷하다 하여 지어진 명칭이다.
	정렬알고리즘 중에서는 가장 단순하고 효율성이 떨어지는 알고리즘이다.
	데이터가 10개인 경우 45번의 비교가 필요하다.
 */
public class QuBubbleSort {

	public static void main(String[] args) {

		int[] rdNum = new int[10];
		Random rd = new Random();
		for(int i=0 ; i<rdNum.length ; i++) {
			rdNum[i]= rd.nextInt(99)+1;
			for(int j=0 ; j<i ; j++) {
				if(rdNum[i]==rdNum[j]) {
					i--;
				}
			}
		}
		for(int i=rdNum.length-1 ; i>0 ; i--) {
			for(int j=0 ; j<i ; j++){
				if(rdNum[j]>rdNum[j+1]) {
					int temp = rdNum[j];
					rdNum[j] = rdNum[j+1];
					rdNum[j+1] = temp;
					for(int m=0 ; m<rdNum.length ; m++) {
						System.out.print(rdNum[m]+" ");
					}
					System.out.println();
				}
			}
		}
	}
}
