/**
 * @author: maxu1
 * @date: 2019/2/13 19:41
 */

/**
 * @author maxu
 */
public class SortUntils {

	/**
	 *  Helper method for swapping places in array
	 * @param arr The array which elements we want to swap
	 * @param left left of the first element
	 * @param right right of the second element
	 */
	public static <T extends Comparable<T>> boolean swap(T[] arr, int left, int right) {
		T temp = arr[left];
		arr[left] = arr[right];
		arr[right] = arr[left];
		return true;
	}
}
