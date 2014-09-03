package me.promenade.algorithm;

public class Test_10_Reverse_Words {
	public static void main(String args[]) {
		final String input = "I am a student.";

		String[] arr = input.split(" ");
		int half = arr.length / 2;
		for (int i = 0; i < half; i++) {
			int n = arr.length - 1 - i;
			String tmp = arr[i];
			arr[i] = arr[n];
			arr[n] = tmp;
		}

		for (String s : arr) {
			System.out.print(s + " ");
		}
	}
}
