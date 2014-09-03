package me.promenade.algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import me.promenade.algorithm.common.AlgorithmUtil;
import me.promenade.algorithm.common.BinaryTreeNode;

public class Test_9_Is_Post_Iterator {

	
	/**
	 * 后续遍历，找根
	 * 
	 * 根是最后一个，因为是binary search tree，所以可以递归来搞
	 * 
	 * @param args
	 */
	public static BinaryTreeNode<Integer> reconstructTree(List<Integer> list){
		if( list.size() == 0 )
			return null;
		
		int rootData = list.get(list.size()-1);
		BinaryTreeNode<Integer> rootNode = new BinaryTreeNode<Integer>(rootData);
		
		BinaryTreeNode<Integer> leftNode = reconstructTree( list.stream().filter(d->d<rootData).collect(Collectors.toList()) );
		BinaryTreeNode<Integer> rightNode = reconstructTree( list.stream().filter(d->d>rootData).collect(Collectors.toList()) );
		rootNode.setLeft(leftNode);
		rootNode.setRight(rightNode);
		
		return rootNode;
	}

	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(5,7, 6, 9, 11, 10, 8);
		BinaryTreeNode<Integer> root = reconstructTree(list);
		AlgorithmUtil.postIterator(root);
	}
}
