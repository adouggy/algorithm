package me.promenade.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Test_19_Fabonacci {

	/**
	 * 时间复杂度是O(n),空间复杂度是O(n) <br>
	 * 其实可以空间复杂度优化到O(1)，记录最后三个数字就好了 <br>
	 * 
	 * 但是，妈蛋，还有个O(lgN)的算法，用一个1x4的矩阵来算<br>
	 * { 1,  1       {Xn-1     <br>
	 *   1,  0 }  x   Xn-2}    <br>
	 *   
	 *   
	 *   Xn+Xn-1 = (1,1,1,0)^n-1 x (1,1) <br>
	 *   一个东西的n次幂是可以在logN的时间内计算出来的。 <---- 你懂得…… <br>  
	 *   
	 * @param n
	 * @return
	 */
	public static long fabonacciN(int n){
		List<Long> list = new ArrayList<>();
		list.add(0l);
		list.add(1l);
		
		for( int i=1; i<=n; i++ ){
			list.add( list.get(list.size()-2) + list.get(list.size()-1) );
		}
		
		return list.get(n);
	}
	
	public static void main(String args[]){
		for( int i=0; i<100; i++ ){
			System.out.print( "Fabonacci." + i + "=" );
			System.out.println(fabonacciN(i));
		}
	}
}
