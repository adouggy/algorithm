package me.promenade.algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Test_29_Push_Pop_Sequence {

	/**
	 * straightforward
	 * @param push
	 * @param pop
	 * @return
	 */
	public static boolean isSequenceCorrent(List<Integer> push, List<Integer> pop) {
		Stack<Integer> s = new Stack<Integer>();
		
		int pushIdx = 0;
		int popIdx = 0;
		
		if( push.size() != pop.size() )
			return false;
		
		while( popIdx < pop.size() ){
			if( s.empty() || s.peek() != pop.get(popIdx) ){
				if( pushIdx < push.size() )
					s.push( push.get(pushIdx++) );
				else
					return false;
				while( !s.empty() && s.peek() == pop.get(popIdx) ){
					s.pop();
					popIdx ++;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String args[]){
		List<Integer> l1 = Arrays.asList(1,2,3,4,5);
		List<Integer> l2 = Arrays.asList(4,5,3,2,1);
		System.out.println( isSequenceCorrent(l1,l2) );
	}
}
