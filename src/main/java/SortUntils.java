/**
 * @author: maxu1
 * @date: 2019/2/13 19:41
 */

import java.util.Arrays;

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
		arr[right] = temp;
		return true;
	}

	/**
	 * Helper method for compare tow elements
	 * @param t
	 * @param pivot
	 */
	public static <T extends Comparable<T>> boolean less(T t, T pivot) {
		return t.compareTo(pivot) < 0;
	}

	/**
	 * Prints an array
	 */
	public static  void print(Object[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
