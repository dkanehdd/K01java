package bokang;

import java.util.Random;

public class randomnansu {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int check;
	      	do {
	      		 check = 1;
	      		 for (int i=0; i<arr.length; i++) {
	      			 Random ran = new Random();
	      			 arr[i] = ran.nextInt(99)+1;
	      			 System.out.print(arr[i]+" ");
	         }
	         System.out.println();
	         for (int i=0; i<arr.length-1; i++) {
	            for (int j=i+1; j<arr.length; j++) {
	               if (arr[i]==arr[j]) {
	                  check = 2;
	                  System.out.println("중복된 난수 발생으로 난수를 다시 생성합니다.");
	               }
	            }
	         	}
	    }while(check==2);

	}

}
