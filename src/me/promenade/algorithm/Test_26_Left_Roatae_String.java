package me.promenade.algorithm;

public class Test_26_Left_Roatae_String {

	public static void main(String args[]){
		final String input = "abcdef";
		for( int i=0; i<input.length();i++ )
			System.out.println( leftRotate(input, i) );
	}
	
	/**
	 * 把字符串前若干个字符移动到字符串的尾部
	 * time: O(n), mem: O(1)
	 */
	public static String leftRotate(String input, int n){
		char tmp;
		for( int i=0; i<n; i++ ){
			tmp = input.charAt(0);
			input = input.substring(1);
			input += tmp;
		}
		return input;
	}
	
	/**
	 * 不过上述方法略屌丝，substring和+可能对时间空间要求有冲突
	 * 有个nb的方法，通过翻转字符串 (X^T Y^T)^T = YX
	 */
}
