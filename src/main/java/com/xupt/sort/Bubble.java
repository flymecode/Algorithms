package com.xupt.sort;

/**
 * @author maxu
 */
public class Bubble implements SortAlgorithm {

	/**
	 * 从左到右不断交换相邻逆序的元素，在一轮的循环之后，可以让未排序的最大元素上浮到右侧。
	 * 在一轮循环中，如果没有发生交换，就说明数组已经是有序的，此时可以直接退出。
	 *
	 * 时间复杂度为O(n^2)
	 * 稳定的排序
	 */
	@Override
	public <T extends Comparable<T>> T[] sort(T[] arr) {
		boolean swap = true;
		for (int i = 0; i < arr.length && swap; i++) {
			// 设置标志，如果循环一遍没有发生交换就说明已经排好序了
			swap = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (SortUntils.less(arr[j + 1], arr[j])) {
					// 判断是否交换
					swap = SortUntils.swap(arr, j + 1, j);
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Bubble bubble = new Bubble();
		Integer[] arr = {1, 3, 4,5,6,7,8};
		String[] strings = {"c", "a", "e", "b","d"};
 		Integer[] sort1 = bubble.sort(arr);
		String[] sort = bubble.sort(strings);
		SortUntils.print(sort);
		SortUntils.print(sort1);
	}
}
