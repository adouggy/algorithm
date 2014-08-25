package me.promenade.algorithm;

import me.promenade.algorithm.common.NumberUtil;

public class Test_3_MaxSubArray {
	public static final int[] arr = { 1, -2, 3, 10, -4, 7, 2, -5 };

	public static void main(String args[]) {
		int[] tmp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				tmp[i] = arr[i];
			} else {
				if (tmp[i - 1] + arr[i] > 0) {
					tmp[i] = tmp[i - 1] + arr[i];
				} else {
					tmp[i] = arr[i] > 0 ? arr[i] : 0;
				}
			}
		}

		for (int n : tmp) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("max value:" + NumberUtil.max(tmp));
	}

}
