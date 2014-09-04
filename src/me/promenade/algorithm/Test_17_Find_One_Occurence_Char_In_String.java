package me.promenade.algorithm;

import java.util.HashMap;
import java.util.Map;

public class Test_17_Find_One_Occurence_Char_In_String {
	public static void main(String args[]) {
		final String s = "abaccdeff";
		Map<Character, Integer> map = new HashMap<>();
		char[] arr = s.toCharArray();
		for( char c : arr ){
			if( map.containsKey(c) ){
				map.put(c, map.get(c) + 1);
			}else{
				map.put(c, 1);
			}
		}
		
		System.err.println(map);
	}
}
