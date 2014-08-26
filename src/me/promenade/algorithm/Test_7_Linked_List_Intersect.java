package me.promenade.algorithm;

import java.util.HashSet;

import me.promenade.algorithm.common.AlgorithmUtil;
import me.promenade.algorithm.common.LinkedListNode;

public class Test_7_Linked_List_Intersect {
	public static LinkedListNode<Integer> createLinkedList(){
		LinkedListNode<Integer> head = new LinkedListNode<>();
		LinkedListNode<Integer> tmp = head; 
		head.setData(0);
		
		for( int i=1; i<10; i++ ){
			LinkedListNode<Integer> node = new LinkedListNode<Integer>();
			node.setData(i);
			tmp.setNext(node);
			tmp = node;
		}
		
		return head;
	}
	
	public static void main(String args[]){
		LinkedListNode<Integer> head1 = createLinkedList();
		AlgorithmUtil.print(head1);
		
		LinkedListNode<Integer> head2 = createLinkedList();
		AlgorithmUtil.print(head2);
		
		LinkedListNode<Integer> head3 = createLinkedList();
		AlgorithmUtil.print(head3);
		
		//把1，3连起来
		LinkedListNode<Integer> lastNode = head1;
		while( lastNode.getNext() != null ){
			lastNode = lastNode.getNext();
		}
		lastNode.setNext(head3);
		AlgorithmUtil.print(head1);
		
		//把2、3连起来
		lastNode = head2;
		while( lastNode.getNext() != null ){
			lastNode = lastNode.getNext();
		}
		lastNode.setNext(head3);
		AlgorithmUtil.print(head2);
		
		/**
		 * 如果有相交，next的指针肯定指向相同的位置
		 * 时间复杂度O(m+n), 空间复杂度O(m)
		 * 
		 */
		HashSet<LinkedListNode<Integer>> nextSet  = new HashSet<>();
		LinkedListNode<Integer> tmp = head1;
		while( tmp.getNext() != null ){
			nextSet.add( tmp );
			tmp = tmp.getNext();
		}
		
		tmp = head2;
		while( tmp.getNext() != null ){
			if( nextSet.contains(tmp.getNext()) ){
				System.out.println("bingo, find intersect point at :" + tmp.getData());
			}
			tmp = tmp.getNext();
		}
		
		/**
		 * 关于扩展
		 * 1，如果又环，找互素的两个数作为步长，遍历一个链表，如果碰上了，则有环。或者往set里放，如果set大小不增长了，则有环
		 * 2，找出第一个点，环肯定在相交的链表中，没跑，但有可能有共同交点。
		 *    如果有，按照上述算法，第一个出现的点即为交点。
		 */
		
	}
}
