package me.promenade.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Test_14_Find_Two_Number_Sum_Equal_N {

	/**
	 * 输入的是升序的数组
	 * 找出两个和为n的数字
	 * 时间复杂度要求是O(n)
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1, 2, 4, 7, 11, 15);
		final int n = 15;
		
		HashSet<Integer> set = new HashSet<>();
		for( int i : list ){
			if( set.contains(i) ){
				System.out.println( "found:" + n + "=" + i + "+" + (n-i) );
			}else{
				if( n-i>=0 ){
					set.add(n-i);
				}
			}
		}
	}
	
	/**
	 * 还有一种，两头指针，向中间收紧。大于预期则收紧右边，小于预期则收紧左边。 <--不知道work不
	 */

}
