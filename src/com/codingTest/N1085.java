package com.codingTest;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1085
//직사각형 탈출 
//한수는 지금 (x, y)에 있다. 직사각형의 왼쪽 아래 꼭짓점은 (0, 0)에 있고, 
//오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
public class N1085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		int a = Math.min(x, w-x);
		int b = Math.min(y, h-y);
		System.out.println(Math.min(a, b));
	}

}
