package com.codingTest;

import java.util.ArrayList;
import java.util.Scanner;

//https://www.acmicpc.net/problem/2581
//소수
//자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램

public class N2581 {
	


	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int min = scan.nextInt();
		int max = scan.nextInt();
		int check = 0;	//소수인지 아닌지 체크 
		ArrayList answer = new ArrayList();
		int sum = 0;
		
		for(int i=min; i<=max; i++) {
			if(i == 1) {
				check =1;
			}
			for(int j=2; j<i; j++ ) {
				if(i%j ==0) {	//자기보다 작은수로 나누었을때 나누어지면 소수가 아님 
					check =1;
					break;
				}
			}
			if(check == 0) {
				answer.add(i);
				sum += i;
			}
			check = 0;
		}
		if(answer.size() == 0) {
			System.out.println("-1");
		}else {
			System.out.println(sum);
			System.out.println(answer.get(0));
		}
	
		
	}

}

//에라토스테네스 체 알고리즘를 활용한 풀이법 
//" k=2 부터 √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다"
/*
  임의의 자연수 𝐍 (𝐍 > 0) 이 있다고 가정하자.
 𝑝 × 𝑞 = 𝐍 을 만족할 때 우리는 아래와 같은 부등식을 완성할 수 있다.
( 1 ≤  𝑝 , 𝑞 ≤ 𝐍 )
그리고 𝑝 와 𝑞 중 하나는 √N 보다 작거나 같다.

예로들어  𝐍 = 16 라고 하자.
그러면 아래와 같이 두 수의 곱으로 표현할 수 있다.

1 × 16

2 × 8

4 × 4

8 × 2

16 × 1

여기서 볼 수 있듯이 만약 𝑝 가 증가한다면 자연스레 𝑞 가 감소하고,
반대로 𝑝 가 감소한다면 자연스레 𝑞 가 증가한다.
그리고 𝑝 와 𝑞 는 𝐍의 약수이기 때문에 결국 𝐍 을 임의의 수로 나누게 되면 임의의 수가 √N 보다 작다면 결국 나머지는 √N 보다 클 수 밖에 없다.
결과적으로 𝑝 와 𝑞 중 하나는 반드시 √N 보다 작거나 같다.
즉, √N 이하의 자연수 중에 나누어 떨어지는 수가 있다면 이는 1 과 N 을 제외한 다른 자연수가 N 의 약수라는 의미이므로 소수가 아니게 되는 것이다.
 
 
k = 2 이면 2 를 제외한 2의 배수를 모두 지워주고,
k = 3 이면 3 을 제외한 3의 배수를 모두 지워주고,
(4는 이미 k = 2 에서 제외되어 넘어간다.)
k = 5 이면 5 를 제외한 5의 배수를 모두 지워주고..
이렇게 하여 k = √N 까지 반복 
시간 복잡도 = O(N㏒(㏒N))
 
 */
/*
import java.util.Scanner;
 
public class Main {
 
	public static boolean prime[];
	
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int M = in.nextInt();
		int N = in.nextInt();
		
		prime = new boolean[N + 1];	// 배열 생성 
		get_prime();
		
		
		// 소수 합 및 최솟값 
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i = M; i <= N; i++) {
			if(prime[i] == false) {	// false = 소수 
				sum += i;
				if(min == Integer.MAX_VALUE) {	// 첫 소수가 최솟값임  
					min = i;
				}
			}
		}
		
		if(sum == 0) {	// 소수가 없다면 
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}
 
	
	// 에라토스테네스 체 알고리즘 
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
		
	}
}
 
  
 * 
 */
