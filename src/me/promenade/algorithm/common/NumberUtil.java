package me.promenade.algorithm.common;

public class NumberUtil {
	public static int max(int a, int b){
		return a>b?a:b;
	}
	
	public static int max(int... a){
		int max = Integer.MIN_VALUE;
		for( int n : a ){
			if( n > max )
				max = n;
		}
		return max;
	}
}
