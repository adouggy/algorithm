package me.promenade.algorithm;

public class Test_28_Count_1_Within_Binary {
	
	/**
	 * 最屌丝的方法是一个一个数 O(n)
	 * 高端一些的与1求与做右移，也是一个一个数
	 * 
	 * 每次n与n-1求&的话能消掉一个0，直到n变为n。这样的复杂度是O(k), k就是1的数量
	 * 
	 * @param input
	 * @return
	 */
	public static int countOne(int input){
		int count = 0;
		while( input > 0 ){
			count ++;
			input = input & (input -1);
		}
		return count;
	}
	
	public static void main(String args[]){
		for( int i=0 ;i<100; i++ ){
			System.out.println( i+ ":" + countOne(i) );
		}
	}
}
