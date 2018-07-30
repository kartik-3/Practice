package abc;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		
		int arr[] = new int[] {123,12,4,1,23,1222,42,1246,53,5};
		int len = arr.length;
		int temp = 0;
		for (int i=0; i<len-1;i++) {
			for (int j=i+1; j<len; j++) {
				if (arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}