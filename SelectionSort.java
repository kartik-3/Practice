package abc;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = new int[] { 123, 12, 4, 1, 23, 1222, 42, 1246, 53, 5 };
		int len = arr.length;
		int min = -12345;
		int temp = 90;
		for (int i = 0; i < len-1; i++) {
			min = i;
			for (int j = i+1; j<len; j++) {
				if (arr[j]<arr[min])
					min = j;
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			}
		System.out.println(Arrays.toString(arr));
	}
}