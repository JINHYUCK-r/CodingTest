package com.codingTest;

import java.util.Scanner;

//https://www.acmicpc.net/problem/4948
//베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재
//자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램
public class N4948 {

	//주어진n의 최대값이 123456이기때문에 
	public static boolean[] prime = new boolean[246913];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		get_prime();
		while(true) {
			int n = scan.nextInt();
			if(n==0) break;
			int count = 0; //소수의 개수를 받는 변수 
			for(int i= n+1; i<=2*n; i++) {
				if(!prime[i]) count++;
			}
			System.out.println(count);
		}

	}
	
	public static void get_prime() {
		prime[0] = prime[1] = true;
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}

}
