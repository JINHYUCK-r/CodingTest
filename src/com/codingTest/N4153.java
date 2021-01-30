package com.codingTest;

import java.util.Scanner;

//https://www.acmicpc.net/problem/4153
//직각삼각형 판별 
public class N4153 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {

			int x = scan.nextInt();
			int y = scan.nextInt();
			int z = scan.nextInt();

			// 0 0 0 을 입력받으면 종료
			if (x == 0 && y == 0 && z == 0)
				break;

			if ((x * x + y * y) == z * z) {
				System.out.println("right");
			} else if (x * x == (y * y + z * z)) {
				System.out.println("right");
			} else if (y * y == (z * z + x * x)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}

		}

	}

}
