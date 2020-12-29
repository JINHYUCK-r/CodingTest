package com.codingTest;

import java.util.Scanner;

//https://www.acmicpc.net/problem/8958
//OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램
public class N8958 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String[] arr = new String[num];
		for(int i=0; i<num; i++) {
			arr[i] = scan.next();
		}
		for(int i=0; i<num; i++) {
			int sum = 0; 
			int cnt =0;
			for(int j =0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					cnt++;
				}else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
		

	}

}
