package abc;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = new int[] { 123, 12, 4, 1, 23, 1222, 42, 1246, 53, 5 };
		int len = arr.length;
		int min = -12345;
		int temp = 90;
		for (int i = 1; i < len; i++) {
			if (arr[i] < arr[i - 1]) {
				for (int j = 0; j < len; j++) {
					if (arr[j] > arr[i]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
