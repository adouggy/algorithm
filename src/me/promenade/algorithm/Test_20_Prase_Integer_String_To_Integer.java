package me.promenade.algorithm;

import java.util.HashMap;
import java.util.Map;

import me.promenade.algorithm.common.NumberUtil;

public class Test_20_Prase_Integer_String_To_Integer {
	public static void main(String args[]) {
		System.out.println( parseDecimal( "-12345678987654321" ) );
	}

	public static final Map<Character, Integer> CHAR_TO_INT_MAP = new HashMap<>();
	static {
		CHAR_TO_INT_MAP.put('0', 0);
		CHAR_TO_INT_MAP.put('1', 1);
		CHAR_TO_INT_MAP.put('2', 2);
		CHAR_TO_INT_MAP.put('3', 3);
		CHAR_TO_INT_MAP.put('4', 4);
		CHAR_TO_INT_MAP.put('5', 5);
		CHAR_TO_INT_MAP.put('6', 6);
		CHAR_TO_INT_MAP.put('7', 7);
		CHAR_TO_INT_MAP.put('8', 8);
		CHAR_TO_INT_MAP.put('9', 9);
	}

	public static long parseDecimal(String input) {
		long res = 0;
		if (input == null || input.length() == 0)
			return res;
		
		int negative = 1;
		
		if( input.startsWith("-") ){
			negative = -1;
			input = input.substring(1);
		}

		char[] arr = input.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			long num =  CHAR_TO_INT_MAP.get(arr[i]) * NumberUtil.pow(10l, arr.length-1-i) ;
			System.out.println(num);
			res += num;
		}

		return res*negative;
	}
}
