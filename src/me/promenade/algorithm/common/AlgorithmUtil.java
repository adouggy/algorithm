package me.promenade.algorithm.common;

import java.util.List;

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
	
}
