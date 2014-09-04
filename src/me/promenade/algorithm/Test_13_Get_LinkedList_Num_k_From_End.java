package me.promenade.algorithm;

import me.promenade.algorithm.common.AlgorithmUtil;
import me.promenade.algorithm.common.LinkedListNode;

public class Test_13_Get_LinkedList_Num_k_From_End {
	public static void main(String args[]) {
		LinkedListNode<Integer> n = AlgorithmUtil.createLinkedList();
		
		for( int i=0; i<10; i++ ){
			LinkedListNode<Integer> node = findReverseK( i, n );
			System.out.println(i + "  " + (node ==null?"null":node.getData()));
		}
	}
	
	/**
	 * 找出倒数第k个节点
	 * 
	 * 首先，链表，我不知道长度。
	 * 最先的想法是：不考虑空间，遍历一遍放入一个数组，然后直接拿出数组中第n-k个元素，即为倒数第k个。时间复杂度为O(n)，空间复杂度为O(n)
	 * 
	 * 哦，第二个方法！用两个指针，相差k个！这样当第一个指针指向最后一个节点的时候第二个指针正好出于倒数第k个节点
	 * 复杂度变为了时间：O(n-k), 空间O(1)
	 * 
	 */
	public static LinkedListNode<Integer> findReverseK(int k, LinkedListNode<Integer> firstNode){
		LinkedListNode<Integer> p = firstNode;
		LinkedListNode<Integer> q = firstNode;
		for( int i=0; i<k && q !=null; i++ ){
			q = q.getNext();
		}
		
		if( q == null )
			return null;
		
		while( q.getNext() != null ){
			q = q.getNext();
			p = p.getNext();
		}
		
		return p;
	}
}
