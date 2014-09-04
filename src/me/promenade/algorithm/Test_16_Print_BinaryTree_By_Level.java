package me.promenade.algorithm;

import java.util.ArrayList;
import java.util.List;

import me.promenade.algorithm.common.AlgorithmUtil;
import me.promenade.algorithm.common.BinaryTreeNode;

public class Test_16_Print_BinaryTree_By_Level {

	public static void main(String args[]){
		BinaryTreeNode<Integer> root = AlgorithmUtil.createTree();
		List<BinaryTreeNode<Integer>> l1 = new ArrayList<>();
		List<BinaryTreeNode<Integer>> l2 = new ArrayList<>();
		
		l1.add(root);
		while( !l1.isEmpty() ){
			//print on level
			for( BinaryTreeNode<Integer> node : l1 ){
				System.out.print( node.getData() + " " );
				
				if( node.getLeft() != null )
					l2.add(node.getLeft());
				if( node.getRight() != null )
					l2.add(node.getRight());
			}
			System.out.println();
			
			l1 = l2;
			l2 = new ArrayList<>();
		}
		
	}
}
