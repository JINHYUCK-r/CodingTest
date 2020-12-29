package com.codingTest;

//https://www.acmicpc.net/problem/4673
// d(75) = 75+7+5 = 87
//생성자가 없는 숫자를 셀프 넘버
public class N4673 {

	public static void main(String[] args) {

		boolean[] arr = new boolean[10001];

		for (int i = 0; i < 10001; i++) {
			int value = d(i);

			if (value < 10001) {
				arr[value] = true;
			}
		}

		for (int i = 0; i < 10001; i++) {
			if (arr[i] != true) {
				System.out.println(i);
			}
		}

	}

	public static int d(int num) {
		int sum = num;
		while (num != 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		return sum;

	}

}
