package me.promenade.algorithm;

public class Test_12_One_Plus_To_N {

	/**
	 * 还不让用for, while, if else, switch, case等关键词以及条件判断语句
	 * 
	 * @param n
	 * @return
	 */
	public static int plus(int n) {
//		return n==0?0:n + plus(n-1); //<--这tm也是条件判断语句
		//首项加末项乘以项数除以二会不？
		return (n + 1)*(n)/2;
	}
	
	public static void main(String args[]){
		System.out.println( plus(10) );
	}
}
