package me.promenade.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import me.promenade.algorithm.common.AlgorithmUtil;
import me.promenade.algorithm.common.BinaryTreeNode;

public class Test_15_Mirror_BST {

	/**
	 * 由小到大的变为由大到小的 递归
	 */
	public static void recursiveMirror(BinaryTreeNode<Integer> node) {
		BinaryTreeNode<Integer> left = node.getLeft();
		BinaryTreeNode<Integer> right = node.getRight();
		node.setLeft(right);
		node.setRight(left);

		if (left != null)
			recursiveMirror(left);
		if (right != null)
			recursiveMirror(right);
	}

	/**
	 * 由小到大的变为由大到小的 非递归
	 * 
	 * 深度优先遍历或者广度优先遍历一棵树，把所有节点放到一个数组中 然后对数组中每个元素都左右颠倒即可
	 */
	public static void nonRecursiveMirror(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;

		List<BinaryTreeNode<Integer>> list = new ArrayList<>();
		Stack<BinaryTreeNode<Integer>> s = new Stack<>();

		list.add(root);
		if (root.getLeft() != null)
			s.push(root.getLeft());
		if (root.getRight() != null)
			s.push(root.getRight());
		while (!s.isEmpty()) {
			BinaryTreeNode<Integer> node = s.pop();
			list.add(node);
			if (node.getLeft() != null)
				s.push(node.getLeft());
			if (node.getRight() != null)
				s.push(node.getRight());
		}
		
		for( BinaryTreeNode<Integer> n: list ){
			BinaryTreeNode<Integer> left = n.getLeft();
			BinaryTreeNode<Integer> right = n.getRight();
			n.setLeft(right);
			n.setRight(left);
		}
		
	}

	public static void main(String args[]) {
		BinaryTreeNode<Integer> root = AlgorithmUtil.createTree();

		AlgorithmUtil.printTree(root);
		System.out.println();

		recursiveMirror(root);
		AlgorithmUtil.printTree(root);
		System.out.println();

		nonRecursiveMirror(root);
		AlgorithmUtil.printTree(root);
		System.out.println();

	}
}
