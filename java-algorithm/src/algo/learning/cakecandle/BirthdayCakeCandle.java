package algo.learning.cakecandle;

import java.util.Scanner;

public class BirthdayCakeCandle {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int arCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		int[] ar = new int[arCount];
		
		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for (int i = 0; i < arItems.length; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}
		
		int result = birthdayCakeCandles(ar);
		
		System.out.println(result);
		
		scanner.close();
	}
	
	static int birthdayCakeCandles(int[] ar) {
		int[] sortingAr = insertionSort(ar);

		int maxLength = sortingAr[ar.length - 1];
		
		System.out.println("maxLength: " + maxLength);
		int count = 1;
		for (int i = 0; i < sortingAr.length - 1; i++) {
			if (maxLength == sortingAr[i]) count += 1;
			else continue;
			
		}
		
		return count;
    }
	
	/*
	 * 삽입정렬
	 * 
	 */
	static int[] insertionSort(int[] ar) {
		int temp = 0, j = 0;
		
		for (int i = 1; i < ar.length; i++) {
            temp = ar[i];
            for (j = i - 1; j >= 0 && ar[j] > temp; j--) {
                ar[j + 1] = ar[j];
            }
            ar[j + 1] = temp;
        }
		
		return ar;
	}
}
