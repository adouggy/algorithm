package me.promenade.algorithm.common;

public class NumberUtil {
	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static int max(int... a) {
		int max = Integer.MIN_VALUE;
		for (int n : a) {
			if (n > max)
				max = n;
		}
		return max;
	}

	/**
	 * calculate power, time consume: O(logN)
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static long pow(long a, int b) {
		if (b == 0)
			return 1;
		else if (b == 1)
			return a;

		if (b % 2 == 0)
			return pow(a * a, b / 2);
		else
			return a * pow(a * a, (b - 1) / 2);
	}
}
