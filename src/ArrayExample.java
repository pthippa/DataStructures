
public class ArrayExample {
	public static void main(String[] args) {
		int[] testArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int rotateBy = 4;
		System.out.println("Initial Array");
		printArray(testArray);

		System.out.println("Reverse Array");
		reverseArray(testArray);
		printArray(testArray);

		System.out.println("Restore Array");
		reverseArray(testArray);
		printArray(testArray);

		System.out.println("Rotate Array by " + rotateBy + " elements");
		rotateArray(testArray, rotateBy);
		System.out.println("After rotation");
		printArray(testArray);
	}

	static void rotateArray(int[] arr, int m) {
		// rotate array by m elements
		int[] temp = new int[m];
		for (int i = 0; i < m; i++) {
			temp[i] = arr[i];
		}

		for (int i = 0, j = i + m; i < arr.length && j < arr.length; i++, j++) {
			arr[i] = arr[j];
		}

		for (int i = arr.length - m, j = 0; i < arr.length; i++, j++) {
			arr[i] = temp[j];
		}
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void reverseArray(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
