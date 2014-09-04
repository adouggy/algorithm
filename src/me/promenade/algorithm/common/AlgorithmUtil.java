package me.promenade.algorithm.common;

import java.util.List;
import java.util.Stack;

public class AlgorithmUtil {

	/**
	 * 完美版partition
	 * 
	 * @param args
	 */
	public static void partition(int k, List<Integer> list) {
		if (list == null)
			return;

		int pivotValue = list.get(k);
		int p = 0;
		int q = list.size() - 1;
		swap(list, k, q);
		q--;

		for (int i = p; i <= q; i++) {
			if (list.get(i) < pivotValue) {
				swap(list, i, p);
				p++;
			}
		}

		swap(list, p, list.size() - 1);
	}

	public static <T> void swap(List<T> list, int m, int n) {
		T tmp = list.get(m);
		list.set(m, list.get(n));
		list.set(n, tmp);
	}

	public static <T> void print(List<T> list) {
		for (T t : list) {
			System.out.print(t.toString() + " ");
		}
		System.out.println();
	}

	public static <T> void print(LinkedListNode<T> head) {
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.getNext();
		}
		System.out.println();
	}

	public static BinaryTreeNode<Integer> createTree() {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
		root.setLeft(new BinaryTreeNode<Integer>(6));
		root.setRight(new BinaryTreeNode<Integer>(14));
		root.getLeft().setLeft(new BinaryTreeNode<Integer>(4));
		root.getLeft().setRight(new BinaryTreeNode<Integer>(8));
		root.getRight().setLeft(new BinaryTreeNode<Integer>(12));
		root.getRight().setRight(new BinaryTreeNode<Integer>(16));
		return root;
	}

	public static LinkedListNode<Integer> createLinkedList() {
		LinkedListNode<Integer> n1 = new LinkedListNode<>();
		LinkedListNode<Integer> n2 = new LinkedListNode<>();
		LinkedListNode<Integer> n3 = new LinkedListNode<>();
		LinkedListNode<Integer> n4 = new LinkedListNode<>();
		LinkedListNode<Integer> n5 = new LinkedListNode<>();
		LinkedListNode<Integer> n6 = new LinkedListNode<>();
		LinkedListNode<Integer> n7 = new LinkedListNode<>();
		LinkedListNode<Integer> n8 = new LinkedListNode<>();
		LinkedListNode<Integer> n9 = new LinkedListNode<>();
		LinkedListNode<Integer> n10 = new LinkedListNode<>();

		n1.setData(0);
		n2.setData(1);
		n3.setData(2);
		n4.setData(3);
		n5.setData(4);
		n6.setData(5);
		n7.setData(6);
		n8.setData(7);
		n9.setData(8);
		n10.setData(9);

		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		n7.setNext(n8);
		n8.setNext(n9);
		n9.setNext(n10);

		return n1;
	}

	/**
	 * 非递归后续遍历二叉树 记不住！不理解！
	 * 
	 * @param root
	 */
	public static void postIterator(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;

		Stack<BinaryTreeNode<Integer>> s = new Stack<>();
		BinaryTreeNode<Integer> current = root;
		BinaryTreeNode<Integer> preVisited = null;
		while (current != null || !s.isEmpty()) {
			while (current != null) {
				s.push(current);
				current = current.getLeft();
			}
			current = s.peek();
			if (current.getRight() == null || current.getRight() == preVisited) {
				System.out.println(current.getData());
				preVisited = current;
				s.pop();
				current = null;
			} else {
				current = current.getRight();
			}
		}
	}

	public static void printTree(BinaryTreeNode<Integer> node) {
		if (node.getLeft() != null)
			printTree(node.getLeft());
		System.out.print(node.getData() + " ");
		if (node.getRight() != null)
			printTree(node.getRight());
	}

}
