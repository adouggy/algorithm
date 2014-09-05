package me.promenade.algorithm;

import java.util.HashMap;

public class Test_27_Jump_Footstep {

	/**
	 * 有n个台阶 <br>
	 * 每次可以跳一节，也可以跳两节台阶<br>
	 * 可能有多少种跳法<br>
	 * <br>
	 * n -> times<br>
	 * 1 -> 1<br>
	 * 2 -> 1,1; 2<br>
	 * 3 -> 1, 1, 1; 1, 2<br>
	 * 4 -> 1,1,1,1; 1,1,2; 1,2,1; 2,2; <br>
	 * 其实这个是很简单的动态规划，后面的问题通过前面的解来获取<br>
	 * 典型的递归吧<br>
	 * <br>
	 * f(n) = max{f(n-1) + 1, f(n-2) + 2}<br>
	 * top-down的方法做个cache。
	 */
	final static HashMap<Integer, Integer> cache = new HashMap<>();

	public static int jump(int n) {
		if (n == 1)
			return 1;
		else if (n == 2)
			return 2;

		if (n <= 0)
			return 0;

		if (cache.containsKey(n)) {
			return cache.get(n);
		}
		int res = jump(n - 1) + jump(n - 2);
		cache.put(n, res);
		return res;
	}

	public static void main(String args[]) {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + ":" + jump(i));
		}
	}
}
