package quiz;

import java.util.Random;

public class QuSelectionSort {

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
		
		int minNum=0;
		for(int i=0 ; i<rdNum.length ; i++) {
			minNum=rdNum[i];
			for(int k=i; k<rdNum.length ; k++) {
				if(minNum>rdNum[k]&&k>i) {
					minNum=rdNum[k];
					rdNum[k]=rdNum[i];
					rdNum[i]=minNum;
				}
			}
			for(int j=0 ; j<rdNum.length ; j++) {
				System.out.print(rdNum[j]+" ");
			}
			System.out.println();
		}
	}
}
