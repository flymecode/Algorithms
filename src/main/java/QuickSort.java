/**
 * @author: maxu1
 * @date: 2019/2/13 20:02
 */

import java.util.Arrays;

/**
 * @author maxu
 */
public class QuickSort implements SortAlgorithm {

	@Override
	public <T extends Comparable<T>> T[] sort(T[] unsorted) {
		doSort(unsorted, 0, unsorted.length - 1);
		return unsorted;
	}

	private <T extends Comparable<T>> void doSort(T[] unsorted, int left, int right) {
		if (left < right) {
			int pivot = partition(unsorted, left, right);
			doSort(unsorted, left, pivot - 1);
			doSort(unsorted, pivot, right);
		}
	}

	private <T extends Comparable<T>> int partition(T[] unsorted, int left, int right) {
		int mid = (left + right) / 2;
		T pivot = unsorted[mid];

		while (left <= right) {
			while (SortUntils.less(unsorted[left], pivot)) {
				left++;
			}
			while (SortUntils.less(pivot, unsorted[right])) {
				right--;
			}
			if (left <= right) {
				SortUntils.swap(unsorted, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	public static void main(String[] args) {
		Integer[] arr = {4, 23, 6, 78, 1, 54, 231, 9, 12};
		QuickSort quickSort = new QuickSort();
		Integer[] sort = quickSort.sort(arr);
		System.out.println(Arrays.toString(sort));
	}
}