package me.promenade.algorithm;

import me.promenade.algorithm.common.AlgorithmUtil;
import me.promenade.algorithm.common.LinkedListNode;

public class Test_24_Reverse_Linked_List {
	
	/**
	 * reverse linked list locally.
	 * @param args
	 */
	public static void main(String args[]) {
		LinkedListNode<Integer> p = AlgorithmUtil.createLinkedList();
		AlgorithmUtil.print(p);

		LinkedListNode<Integer> a = p;
		LinkedListNode<Integer> b = a.getNext();
		a.setNext(null);
		while( b != null ){
			LinkedListNode<Integer> c = b.getNext();
			b.setNext(a);
			a = b;
			b = c;
			if( b != null )
				c = b.getNext();
		}
		
		AlgorithmUtil.print(a);
	}
}
