package me.promenade.algorithm;

import java.util.ArrayList;
import java.util.List;

import me.promenade.algorithm.common.AlgorithmUtil;

public class Test_5_Find_Min_K {
	

	public static void main(String args[]){
		List<Integer> list = new ArrayList<>();
		list.add( 1 );
		list.add( 7 );
		list.add( 2 );
		list.add( 5 );
		list.add( 3 );
		list.add( 8 );
		list.add( 10 );
		
		for( int k=0; k<list.size(); k++){
			AlgorithmUtil.partition( k , list);
			List<Integer> subList = list.subList(0, k);
			AlgorithmUtil.print(subList);
		}
		
	}
	
}
