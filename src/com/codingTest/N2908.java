package com.codingTest;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2908
//거꾸로 일고 큰수 출력 
public class N2908 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int rA = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
		int rB = Integer.parseInt(new StringBuilder().append(b).reverse().toString());
		System.out.println(rA > rB ? rA : rB);
	}
}
