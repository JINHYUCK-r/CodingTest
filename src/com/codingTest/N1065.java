package com.codingTest;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1065
//정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열
//한 수의 개수 
public class N1065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		System.out.println(cnt(num));
	}

	public static int cnt(int num) {
		int cnt = 0;

		if (num < 100) {
			cnt = num;
		} else {
			cnt = 99;
			if (num == 1000) {
				num = 999;
			}
			for (int i = 100; i <= num; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;

				if ((hun - ten) == (ten - one)) {
					cnt++;
				}
			}
		}
		return cnt;
	}

}
