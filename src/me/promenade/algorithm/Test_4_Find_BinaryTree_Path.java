package me.promenade.algorithm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

import me.promenade.algorithm.common.BinaryTreeNode;

public class Test_4_Find_BinaryTree_Path {

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

	/**
	 * 非递归深度优先遍历
	 * 
	 * @param root
	 */
	public static void iterator(BinaryTreeNode<Integer> root) {
		Stack<BinaryTreeNode<Integer>> s = new Stack<>();
		Set<BinaryTreeNode<Integer>> leftDone = new HashSet<>();
		Set<BinaryTreeNode<Integer>> rightDone = new HashSet<>();

		s.push(root);
		while (!s.isEmpty()) {
			BinaryTreeNode<Integer> node = s.peek();
			if (node.isLeaf()) {
				printStack(s);
				int sum = sumStack( s );
				System.out.println( sum );
				s.pop();
			} else if (node.getLeft() != null && !leftDone.contains(node)) {
				s.push(node.getLeft());
				leftDone.add(node);
			} else if (node.getRight() != null && !rightDone.contains(node)) {
				s.push(node.getRight());
				rightDone.add(node);
			} else {
				s.pop();
			}
		}
	}

	private static void printStack(Stack<BinaryTreeNode<Integer>> s) {
		Iterator<BinaryTreeNode<Integer>> iter = s.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next().getData() + " ");
		}
		System.out.println();
	}
	
	private static int sumStack( Stack<BinaryTreeNode<Integer>> s ){
		int sum = 0;
		Iterator<BinaryTreeNode<Integer>> iter = s.iterator();
		while (iter.hasNext()) {
			sum+=iter.next().getData();
		}
		return sum;
	}

	public static void main(String args[]) {
		BinaryTreeNode<Integer> root = createTree();
		iterator(root);
	}

}
