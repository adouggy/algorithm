package me.promenade.algorithm;

import me.promenade.algorithm.common.AlgorithmUtil;
import me.promenade.algorithm.common.LinkedListNode;

public class Test_18_Del_Circle_Number {
	public static void main(String args[]){
		
		//先做一个环
		LinkedListNode<Integer> first = AlgorithmUtil.createLinkedList();
		
		LinkedListNode<Integer> last = first;
		while( last.getNext() != null )
			last = last.getNext();
		
		last.setNext(first);
		
		//然后按照规则去解决
		final int m = 3;
		while( first.getNext() != first ){
			for( int i=1; i<m-1; i++ ){
				first = first.getNext();
			}
			first.setNext( first.getNext().getNext() );
		}
		System.out.println( first.getData() );
	}
	
	
}
