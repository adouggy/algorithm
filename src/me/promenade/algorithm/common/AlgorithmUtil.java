package me.promenade.algorithm.common;

import java.util.List;

public class AlgorithmUtil {

	/**
	 * 完美版partition
	 * 
	 * @param args
	 */
	public static void partition(int k, List<Integer> list) {
		if (list == null)
			return;

		int pivotValue = list.get(k);
		int p = 0;
		int q = list.size() - 1;
		swap(list, k, q);
		q--;

		for( int i=p; i<=q; i++ ){
			if (list.get(i) < pivotValue) {
				swap(list, i, p);
				p++;
			}
		}

		swap(list, p, list.size()-1);
	}

	public static <T> void swap(List<T> list, int m, int n) {
		T tmp = list.get(m);
		list.set(m, list.get(n));
		list.set(n, tmp);
	}

	public static <T> void print(List<T> list) {
		for (T t : list) {
			System.out.print(t.toString() + " ");
		}
		System.out.println();
	}
}