package algo.learning.minmaxsum;

/*
 * 주어진 배열에서 가장 큰 값을 제외한 합, 
 * 가장 작은 값을 제외한 합을 순서대로 출력
 */
public class MiniMaxSum {

	public static void main(String[] args) {
		int[] arr = {1000000000, 299, 1, 3, 8999989, 912123123, 1232, 1, 9, 3, 2100000000};
		miniMaxSum(arr);
	}
	
	static void miniMaxSum(int[] arr) {
		int[] sortingArr = sort(arr);

		long minSum = 0, maxSum = 0;
		for (int i = 0; i < sortingArr.length - 1; i++) {
			minSum += sortingArr[i];
		}

		for (int i = 1; i < sortingArr.length; i++) {
			maxSum += sortingArr[i];
		}

		System.out.println(minSum + "  " + maxSum);

	}

	/*
	 * 선택 정렬
	 */
	static int[] sort(int[] arr) {

		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		return arr;
	}

}
