package com.codingTest;

import java.util.Scanner;

//https://www.acmicpc.net/problem/9020
//골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 
//이러한 수를 골드바흐 수라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션
//골드바흐 파티션을 출력하는 프로그램을 작성하시오. 
//만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력

public class N9020 {
	
	public static boolean prime[] = new boolean[10001];
	

	public static void main(String[] args) {
		
		getPrime();
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T != 0) {
			int N = scan.nextInt();
			int p = N/2;
			int q = N/2;
			
			while(true) {
				if(prime[p]==false && prime[q]==false) {
					System.out.println(p + " " + q + " ");
					break;
				}
				p--;
				q++;
			}
			T--;
			
		}
		
	

	}
	
	public static void getPrime() {
		prime[0] = prime[1] = true;
		for(int i=2; i<Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j= i*i; j<prime.length; j+=i) {
				prime[j]=true;
			}
		}
		
		
		
	}

}
