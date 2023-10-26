package JAVA;

import java.util.Arrays;
import java.util.Random;

public class first {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		
		Random rand = new Random();
		
		for(int i=0;i<arr.length;i++) {
			int index = rand.nextInt(arr.length);
			
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
