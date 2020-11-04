package bokang;

public class Random {

	public static void main(String[] args) {

		int[] arr = new int[10];
		for(int i=0 ; i<arr.length ; i++) {
			arr[i]=(int)(Math.random()*100)+1;
			for(int j=0 ; j<arr.length ; j++) {
				if(i!=j) {
					if(arr[i]==arr[j]) {
						i--;
					}
				}
			}
			System.out.println((i+1) +"번째난수"+ arr[i]);
		}
	}

}
