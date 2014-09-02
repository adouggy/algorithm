package me.promenade.algorithm;

import java.util.Stack;

import me.promenade.algorithm.common.AlgorithmUtil;
import me.promenade.algorithm.common.BinaryTreeNode;

public class Test_9_Is_Post_Iterator {

	public static void postIterator(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;

		Stack<BinaryTreeNode<Integer>> s = new Stack<>();
		BinaryTreeNode<Integer> current = root;
		BinaryTreeNode<Integer> preVisited = null;
		while (current != null || !s.isEmpty()) {
			while( current != null ){
				s.push(current);
				current = current.getLeft();
			}
			current = s.peek();
			if( current.getRight() == null || current.getRight() == preVisited ){
				System.out.println( current.getData() );
				preVisited = current;
				s.pop();
				current = null;
			}else{
				current = current.getRight();
			}
		}
	}
	

	public static void main(String args[]) {
		BinaryTreeNode<Integer> node = AlgorithmUtil.createTree();
		postIterator(node);
	}
}
