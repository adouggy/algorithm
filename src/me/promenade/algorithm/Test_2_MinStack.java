package me.promenade.algorithm;

import java.util.ArrayList;

/**
 * min, push, pop time complexity = O(1)
 * 
 * @author liyazi
 *
 */
public class Test_2_MinStack {
	static class MinStack {
		private ArrayList<Integer> stack = new ArrayList<>();
		private ArrayList<Integer> minStack = new ArrayList<>();

		public void push(Integer data) {
			stack.add(data);

			if (minStack.size() == 0 || data < min()) {
				minStack.add(data);
			} else {
				minStack.add(min());
			}
		}

		public Integer pop() {
			if (stack.size() == 0)
				return null;
			Integer data = stack.get(stack.size() - 1);
			stack.remove(stack.size() - 1);
			minStack.remove(minStack.size() -1);
			return data;
		}

		public Integer min() {
			if (minStack.size() == 0)
				return 0;

			return minStack.get(minStack.size() - 1);
		}
	}
	
	public static void main(String args[]){
		MinStack minStack = new MinStack();
		test(minStack, 10);
		test(minStack, 9);
		test(minStack, 8);
		test(minStack, 11);
		test(minStack, 12);
		test(minStack, 1);
		testPop(minStack);
		testPop(minStack);
		testPop(minStack);
		testPop(minStack);
		testPop(minStack);
		testPop(minStack);
		testPop(minStack);
		testPop(minStack);
	}
	
	private static void test(MinStack s , int n){
		s.push(n);
		System.out.println( "pushed:" + n + ", min:" + s.min() );
	}
	private static void testPop(MinStack s){
		Integer v = s.pop();
		System.out.println( "poped:" + v + ", min:" + s.min() );
	}
}
