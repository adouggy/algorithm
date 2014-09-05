package me.promenade.algorithm;

import java.util.HashMap;
import java.util.Map;

public class Test_25_Find_Longest_Digits_In_String {
	public static void main(String args[]) {
		System.out.println(findLongestDigest("abcd12345ed125ss123456789"));
	}

	private static final Map<Character, Integer> map = new HashMap<>();
	static {
		map.put('0', 0);
		map.put('1', 1);
		map.put('2', 2);
		map.put('3', 3);
		map.put('4', 4);
		map.put('5', 5);
		map.put('6', 6);
		map.put('7', 7);
		map.put('8', 8);
		map.put('9', 9);
	}

	/**
	 * 一个字符串，找出最长的数字 <br>
	 *  怎么想都是O(n) <br>
	 *  先来个屌丝打法
	 * 
	 * @param input
	 * @return
	 */
	public static String findLongestDigest(String input) {
		String longest = "";
		String tmp = "";
		char[] arr = input.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if( map.containsKey(arr[i]) ){
				tmp += arr[i];
			}else{
				if( longest.length() < tmp.length() ){
					longest = tmp;
				}
				tmp = "";
			}
		}
		
		if( longest.length() < tmp.length() ){
			longest = tmp;
		}
		
		return longest;
	}
}
