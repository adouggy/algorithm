package me.promenade.algorithm;

import java.util.Arrays;
import java.util.List;

public class Test_32_Switch_For_Min_Sum {
	private static List<Integer> l1 = Arrays.asList(100, 99, 98, 1, 2, 3);
	private static List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 40);

	/**
	 * 如果能随意叫唤，就找出两组数字，相加差最小即可。
	 * 
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		int interval = Integer.MAX_VALUE;
		for (int i = 0; i < l1.size(); i++) {
			for (int j = 0; j < l2.size(); j++) {
				swap( l1, l2, i, j );
				if( Math.abs(sum(l1)-sum(l2)) < interval ){
					interval = Math.abs(sum(l1)-sum(l2)) ;
					System.out.println("new interval:" + interval);
					System.out.println(l1);
					System.out.println(l2);
				}
				//swap( l1, l2, i, j );
			}
		}
	}

	private static void swap(List<Integer> l1, List<Integer> l2, int i, int j){
		int tmp = l1.get(i);
		l1.set(i, l2.get(j));
		l2.set(j, tmp);
	}
	
	private static int sum(List<Integer> l) {
		int sum = 0;
		for (int n : l)
			sum += n;
		return sum;
	}
}
