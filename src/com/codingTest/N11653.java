package com.codingTest;

import java.util.Scanner;

//https://www.acmicpc.net/problem/11653
//정수 N이 주어졌을 때, 소인수분해하는 프로그램
public class N11653 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i=2; i<N; i++) {
			while(N%i ==0) {
				System.out.println(i);
				N = N/i;
			}
		}
		if(N!=1) {
			System.out.println(N);
		}

	}

}
