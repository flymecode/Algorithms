package com.xupt.sort;

import java.util.Arrays;

/**
 * @author maxu
 */
public class MergeSort implements SortAlgorithm{

	@Override
	public <T extends Comparable<T>> T[] sort(T[] unsorted) {
		T[] temp = (T[]) new Comparable[unsorted.length];
		doSort(unsorted, temp, 0, unsorted.length - 1);
		return unsorted;
	}
	static int string2int(String str) {
		if(str == null ||str.length() == 0) {
			return 0;
		}
		int num = 0;
		int n = 0;
		for(int i = str.length()-1;i>=0;i--){
			char c = str.charAt(i);
			if((c - '0') > 9) {
				return 0;
			}
			if(c == '+') {
				return num;
			}
			if( c == '-') {
				return -num;
			}
			num = num + (c-'0') * (int) Math.pow(10,n);
			n++;
		}
		return num;

	}

	private static <T extends Comparable<T>> void doSort(T[] arr, T[] temp, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			doSort(arr, temp, left, mid);
			doSort(arr, temp, mid + 1, right);
			merge(arr, temp, left, mid, right);
		}

	}


	private static <T extends Comparable<T>> void merge(T[] arr, T[] temp, int left, int mid, int right) {
		System.arraycopy(arr, left, temp, left, right - left + 1);

		int i = left;
		int j = mid + 1;
		int k = left;

		while (i <= mid && j <= right) {
			if (temp[i].compareTo(temp[j]) <= 0) {
				arr[k++] = temp[i++];
			} else {
				arr[k++] = temp[j++];
			}
		}

		while (i <= mid) {
			arr[k++] = temp[i++];
		}

		while (j <= right) {
			arr[k++] = temp[j++];
		}

	}


	public static void main(String[] args) {
		Integer[] arr = {4, 23, 6, 78, 1, 54, 231, 9, 12};
		MergeSort mergeSort = new MergeSort();
		Integer[] sort = mergeSort.sort(arr);
		System.out.println(Arrays.toString(sort));
	}
}
