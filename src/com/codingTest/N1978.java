package com.codingTest;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1978
// 소수찾기 
public class N1978 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int sosuCnt = 0, cnt = 0;

		for (int i = 1; i <= num; i++) {
			int num2 = scan.nextInt();
			sosuCnt = 0;

			for (int j = 1; j <= num2; j++) {
				if (num2 % j == 0)
					sosuCnt++;
			}

			if (sosuCnt == 2)
				cnt++;
		}
		System.out.print(cnt);

	}

}
