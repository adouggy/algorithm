package me.promenade.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test_21_Find_1_to_n_Sum_EQUAL_m {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		findSumToM(6, 10, list);
	}

	/**
	 * 从1，...,n中找出所有相加等于m的组合
	 * 
	 * 首先，如果n>m，就没得聊了，所以可以考虑1,....,m找出所有相加等于m的组合
	 * 
	 * 这种m小时候的组合对于m大了以后的组合是有帮助的,但由于组合出小的需要消耗更小的数字，所以有待商榷： m: combination 1: 1 2:
	 * 2 3: 1+2, 3 4, 1+3, 4 5, 1+4, 2+3, 5 6, 1+5, 2+4, 6 7, 1+6, 2+5, 3+4, 7
	 * 8, 1+7, 2+6, 3+5, 8
	 * 
	 * 还是动态规划吧，小的问题的最优解有能帮助解决更大的问题 对于小问题中使用过的数字，类似于背包问题，把它排除掉就好了
	 * 
	 * 用top-down的方法，先写出recursive解决办法,再做缓存
	 * 
	 * TODO: 再想想！
	 * 
	 * @param n
	 * @param m
	 * @return
	 */
	private static final HashMap<String, List<Integer>> cache = new HashMap<>(); //how?
	public static void findSumToM(int n, int m, List<Integer> list) {
		if( n <= 0 || m<=0 )
			return;
		
		if (m > n) {
			list.add(n);
			findSumToM(n - 1, m - n, list);
			list.remove(list.size() - 1);
			findSumToM(n - 1, m, list);
		} else {
			list.add(m);
			System.out.println( list );
			list.remove(list.size() -1);
			findSumToM( m-1, m, list );
		}
	}
}
