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
		int mid = (left - right) / 2 + right;
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
		Integer[] arr = {3,6,2,1,5,8,4,7};
		QuickSort quickSort = new QuickSort();
		Integer[] sort = quickSort.sort(arr);
		System.out.println(Arrays.toString(sort));
	}
}
