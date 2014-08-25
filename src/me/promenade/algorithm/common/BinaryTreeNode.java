package me.promenade.algorithm.common;


public class BinaryTreeNode<T> {
	private T data;
	private BinaryTreeNode<T> left;
	private BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data){
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode<T> left) {
		this.left = left;
	}

	public BinaryTreeNode<T> getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode<T> right) {
		this.right = right;
	}
	
	public boolean isLeaf(){
		if( left == null && right == null )
			return true;
		return false;
	}

}
