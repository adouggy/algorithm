package me.promenade.algorithm;

public class Test_11_Longest_Distants_In_Binary {

	/**
	 * 找出距离最远的两个节点。
	 * 
	 * 推出：
	 * 1， 这两个节点要不是根节点到叶子节点，要不就是叶子节点到叶子节点。
	 * 2， 如果是后者，则是由根节点到左子树的某个叶子节点加上根到右子树的某个叶子节点。
	 * 
	 * 妥妥的用动态规划
	 * 状态转移方程： max_depth(root) = max{ max_depth(left_child), max_depth(right_childe), left_depth+right_depth }
	 * 
	 */
}
