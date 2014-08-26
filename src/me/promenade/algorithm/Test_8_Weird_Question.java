package me.promenade.algorithm;

import me.promenade.algorithm.common.AlgorithmUtil;
import me.promenade.algorithm.common.LinkedListNode;

public class Test_8_Weird_Question {
	// 1, 灯泡的，开一会再关，灯泡是有温度的
	// 2, 4，2，1. 第一天1， 第二天给2还1，第三天给1，2，第四天给四还1，2，第五天给1， 第六天給2还1，第七天全给了
	public static void main(String args[]) {
		/**
		 * 3，用一种算法来颠倒一个链接表的顺序。现在在不用递归式的情况下做一遍。<br>
		 */
		LinkedListNode<Integer> a = Test_7_Linked_List_Intersect.createLinkedList();
		AlgorithmUtil.print(a);

		LinkedListNode<Integer> b = a.getNext();
		a.setNext(null);

		while (a != null && b != null) {
			LinkedListNode<Integer> c = b.getNext();
			b.setNext(a);
			a = b;
			b = c;
		}
		AlgorithmUtil.print(a);

		/**
		 * 4.用一种算法在一个循环的链接表里插入一个节点，但不得穿越链接表。
		 * 其实没太明白说啥呢
		 */
		System.out.println("question.4");
		a = Test_7_Linked_List_Intersect.createLinkedList();
		AlgorithmUtil.print(a);
		LinkedListNode<Integer> tail = a;
		while (tail.getNext() != null) {
			tail = tail.getNext();
		}
		tail.setNext(a);

		LinkedListNode<Integer> head = a;
		System.out.print(a.getData() + " ");
		while (a.getNext() != head) {
			a = a.getNext();
			System.out.print(a.getData() + " ");
		}
		System.out.println();
		
		LinkedListNode<Integer> node = new LinkedListNode<>();
		node.setData(10);
		tail.setNext(node);
		node.setNext(head);
		
		a = head;
		System.out.print(a.getData() + " ");
		while (a.getNext() != head) {
			a = a.getNext();
			System.out.print(a.getData() + " ");
		}
		System.out.println();
		

		/**
		 * 5.用一种算法整理一个数组。你为什么选择这种方法
		 * 整理？是说排序么？
		 * 
		 * a，quickSort，分而治之，方便并行运算。最坏情况时间O(n^2)，一般情况O(nlgn)。但是通过随机算法可以避免最坏情况吧？
		 * b，归并排序，好处是稳定排序。时间复杂度应该也是O(nlgn)
		 * c，java中的sort，primitive的是用quicksort，object是用merge sort
		 * d, 插入排序，简单。O(n^2)
		 */
		
		/**
		 * 6.用一种算法使通用字符串相匹配
		 * 
		 * a，strcmp算法，按char逐一匹配
		 * b，kmp
		 * c，bm
		 * d，sunday
		 */
		
		/**
		 * 7.颠倒一个字符串。优化速度。优化空间
		 * 应该能做到O(lgN)，空间O(1)
		 * 查看java中StringBuffer.reverse源码，逐一匹配utf8
		 */
		
		/**
		 * 8. 颠倒一个句子中的词的顺序，比如将“我叫克丽丝”转换为“克丽丝叫我”，实现速度最快，移动最少。
		 * 同上题
		 */
		
		/**
		 * 9.找到一个子字符串。优化速度。优化空间。
		 * BM
		 */
		
		/**
		 * 10. 比较两个字符串，用O(n)时间和恒量空间
		 * ...
		 */
		
		/**
		 * 11. 假设你有一个用1001个整数组成的数组，这些整数是任意排列的，但是你知道所有的整数都在1到1000(包括1000)之间。此外，除一个数字出现两次外，其他所有数字只出现一次。假设你只能对这个数组做一次处理，用一种算法找出重复的那个数字。如果你在运算中使用了辅助的存储方式，那么你能找到不用这种方式的算法吗?
		 * bitmap
		 */
		
		/**
		 * 12. 不用乘法或加法增加8倍。现在用同样的方法增加7倍
		 */
		int i = 1;
		System.out.println( i << 3 );
		System.out.println( (i << 3) - i );
	}

}
