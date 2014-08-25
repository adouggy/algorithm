package me.promenade.algorithm;

import me.promenade.algorithm.common.BinaryTreeNode;

/**
 * http://blog.csdn.net/v_JULY_v/article/details/6057286
 * 
 * @author liyazi
 *
 */
public class Test_1_BinaryTree_to_BiLinkedList {

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

	// 前序优先遍历
	public static void iterateBinaryTreePre(BinaryTreeNode<Integer> node) {
		if (node.getLeft() != null)
			iterateBinaryTreePre(node.getLeft());
		System.out.print(node.getData() + " ");
		if (node.getRight() != null)
			iterateBinaryTreePre(node.getRight());
	}

	static class HeadTail {
		BinaryTreeNode<Integer> head;
		BinaryTreeNode<Integer> tail;
	}

	// 变成双向链表
	public static HeadTail convertToBiLinkedList(BinaryTreeNode<Integer> node) {
		if (node.getLeft() != null) {
			HeadTail htLeft = convertToBiLinkedList(node.getLeft());
			node.setLeft(htLeft.tail);
			htLeft.tail.setRight(node);
		}

		if (node.getRight() != null) {
			HeadTail htRight = convertToBiLinkedList(node.getRight());
			node.setRight(htRight.head);
			htRight.head.setLeft(node);
		}

		HeadTail ht = new HeadTail();
		BinaryTreeNode<Integer> left = node.getLeft();
		while (left != null) {
			ht.head = left;
			left = left.getLeft();
		}
		if (ht.head == null) {
			ht.head = node;
		}

		BinaryTreeNode<Integer> right = node.getRight();
		while (right != null) {
			ht.tail = right;
			right = right.getRight();
		}
		if (ht.tail == null) {
			ht.tail = node;
		}
		System.out.println("return ht:" + ht.head.getData() + "," + ht.tail.getData());
		return ht;
	}

	public static void main(String args[]) {
		BinaryTreeNode<Integer> root = createTree();
		iterateBinaryTreePre(root);

		HeadTail ht = convertToBiLinkedList(root);
		BinaryTreeNode<Integer> node = ht.head;
		System.out.println( node.getData() );
		while( node.getRight() != null ){
			node = node.getRight();
			System.out.println( node.getData() );
		}
		
		
		node = ht.tail;
		System.out.println( node.getData() );
		while( node.getLeft() != null ){
			node = node.getLeft();
			System.out.println( node.getData() );
		}
	}
}
