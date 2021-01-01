package com.codingTest;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2292
//벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을

public class N2292 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int cnt = 1;
		int range = 2; //첫번째 최소값 
		if(x == 1) {
			System.out.println(cnt);
		}else {
			while(range <= x) {
				range = range + (cnt*6); //한 계층의 최소값 
				cnt++;
			}
			System.out.println(cnt);
		}
	}

}
