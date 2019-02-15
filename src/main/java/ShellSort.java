
/**
 * @author maxu
 */
public class ShellSort implements SortAlgorithm {


	@Override
	public <T extends Comparable<T>> T[] sort(T[] arr) {
		int N = arr.length;
		int h = 1;
		while (h < N / 3) {
			// 1, 4, 13, 40, ...
			h = h * 3 + 1;
		}
		// 控制增量
		while (h >= 1) {

			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && SortUntils.less(arr[j], arr[j - h]); j -= h) {
					SortUntils.swap(arr, j, j - h);
				}
			}

			h /= 3;
		}
		return arr;
	}


	public static void main(String[] args) {
		ShellSort shellSort = new ShellSort();
		Integer[] arr = {1,2,4,3,5,6,8,7};
		Integer[] sort = shellSort.sort(arr);
		SortUntils.print(sort);
	}
}
